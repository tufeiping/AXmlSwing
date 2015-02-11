package org.arong.axmlswing.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.arong.axmlswing.attribute.AttributeModel;
import org.arong.util.BeanUtil;
import org.arong.util.Dom4jUtil;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;

/**
 * xml文件变量管理器
 * @author dipoo
 * @since 2015-01-30
 */
@SuppressWarnings("unchecked")
public class VarsManager {
	
	private static ThreadLocal<Map<String, String>> vars = new ThreadLocal<Map<String, String>>();
	
	/**
	 * 组件全局属性
	 */
	private static Map<String, AttributeModel> defaults = new HashMap<String, AttributeModel>();
	
	public final static String CONFIG_FILE_NAME = "/aswing.cfg.xml"; 
	
	static{
		vars.set(new HashMap<String, String>());
		String rootPath = ClassLoader.getSystemResource("").getPath();
		vars.get().put("rootPath", rootPath);
		//加载配置文件
		try {
			Document doc = Dom4jUtil.getDOM(rootPath + CONFIG_FILE_NAME);
			Node root = doc.selectSingleNode("/configuation");
			if(root != null){
				Node n = root.selectSingleNode("scan-package");
				if(n != null){
					vars.get().put("scan-package", n.getText());
				}
				n = root.selectSingleNode("properties");
				if(n != null){
					List<Node> ns =  n.selectNodes("property");
					if(ns != null && ns.size() > 0){
						for(Node node : ns){
							vars.get().put(((Element)node).attributeValue("name"), node.getText());
						}
					}
				}
				n = root.selectSingleNode("tag-default");
				if(n != null){
					List<Node> ns =  n.selectNodes("tag");
					if(ns != null && ns.size() > 0){
						List<Node> attrs;
						for(Node tag : ns){
							attrs = tag.selectNodes("attr");
							if(attrs != null && attrs.size() > 0){
								AttributeModel model = new AttributeModel();
								for(Node attr : attrs){
									BeanUtil.setProperty(model, ((Element)attr).attributeValue("name"), new String[]{attr.getText()});
								}
								defaults.put(((Element)tag).attributeValue("name").toLowerCase(), model);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Map<String, String> getVars() {
		return vars.get();
	}
	
	public static String getVarValue(String name){
		return getVars().get(name);
	}
	
	public static Map<String, AttributeModel> getDefaults() {
		return defaults;
	}
	
	/**
	 * 占位符替换
	 */
	public static String transfer(String value){
		if(value == null)
			return null;
		String str = value.trim();
		for(String key : vars.get().keySet()){
			str = str.replaceAll("\\$\\{" + key + "\\}", vars.get().get(key));
		}
		return str;
	}
}
