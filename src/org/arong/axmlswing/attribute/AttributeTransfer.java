package org.arong.axmlswing.attribute;

import java.awt.Color;
import java.awt.Cursor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.arong.axmlswing.manager.ColorManager;
import org.arong.axmlswing.manager.CursorManager;

/**
 * 属性转换，与AttributeValidator配合使用
 * @author dipoo
 * @since 2015-01-29
 */
public class AttributeTransfer {
	
	private static Map<String, String> vars = new HashMap<String, String>();
	
	static{
		String rootPath = ClassLoader.getSystemResource("").getPath();
		vars.put("rootPath", rootPath);
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
	
	public static int[] bounds(String value){
		String[] arr = value.split(",");
		int[] ret = new int[4];
		for(int i = 0; i < arr.length; i ++){
			ret[i] = Integer.parseInt(arr[i].trim());
		}
		return ret;
	}
	
	public static Cursor cursor(String value){
		return CursorManager.getCursors().get(value.toUpperCase());
	}
	
	public static Color color(String value){
		Color color = ColorManager.getColors().get(value.toUpperCase());
		if(color == null){
			try {
				color = new Color(Integer.parseInt(value, 16));
				ColorManager.getColors().put(value.toUpperCase(), color);
            } catch(NumberFormatException e) {
            }
		}
		return color;
	}
	
	public static Icon icon(String value){
		return new ImageIcon(value);
	}
}
