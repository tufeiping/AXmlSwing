package org.arong.axmlswing.manager;

import java.util.HashMap;
import java.util.Map;

import javax.swing.SwingConstants;
/**
 * xml文件变量管理器
 * @author dipoo
 * @since 2015-01-30
 */
public class VarsManager {
	private static Map<String, String> vars = new HashMap<String, String>();
	
	static{
		String rootPath = ClassLoader.getSystemResource("").getPath();
		vars.put("rootPath", rootPath);
		vars.put("SwingConstants.RIGHT", SwingConstants.RIGHT + "");
		vars.put("SwingConstants.LEFT", SwingConstants.LEFT + "");
		vars.put("SwingConstants.CENTER", SwingConstants.CENTER + "");
		vars.put("SwingConstants.LEADING", SwingConstants.LEADING + "");
		vars.put("SwingConstants.TRAILING", SwingConstants.TRAILING + "");
	}
	
	/**
	 * 占位符替换
	 */
	public static String transfer(String value){
		if(value == null)
			return null;
		String str = value.trim();
		for(String key : vars.keySet()){
			str = str.replaceAll("\\$\\{" + key + "\\}", vars.get(key));
		}
		return str;
	}
}
