package org.arong.axmlswing.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public final static String CONFIG_FILE_NAME = "/aswing.cfg.xml"; 
	
	static{
		vars.set(new HashMap<String, String>());
		String rootPath = ClassLoader.getSystemResource("").getPath();
		vars.get().put("rootPath", rootPath);
		//加载配置文件
		try {
			Document doc = Dom4jUtil.getDOM(rootPath + CONFIG_FILE_NAME);
			Node n = doc.selectSingleNode("/configuation");
			if(n != null){
				n = doc.selectSingleNode("/configuation/scan-package");
				if(n != null){
					vars.get().put("scan-package", n.getText());
					n = doc.selectSingleNode("/configuation/properties");
					if(n != null){
						List<Node> ns =  doc.selectNodes("/configuation/properties/property");
						if(ns != null && ns.size() > 0){
							for(Node node : ns){
								vars.get().put(((Element)node).attributeValue("name"), node.getText());
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
