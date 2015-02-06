package org.arong.axmlswing.attribute;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.arong.axmlswing.manager.ColorManager;
import org.arong.axmlswing.manager.CursorManager;
import org.arong.axmlswing.manager.FontManager;

/**
 * 属性转换，与AttributeValidator配合使用
 * @author dipoo
 * @since 2015-01-29
 */
public class AttributeTransfer {
	
	public static int[] size(String value){
		String[] arr = value.split(",");
		int[] ret = new int[2];
		for(int i = 0; i < arr.length; i ++){
			ret[i] = Integer.parseInt(arr[i].trim());
		}
		return ret;
	}
	
	public static int[] intArray(String value, String tag){
		String[] a = value.split(tag);
		int[] ints = new int[a.length];
		for(int i = 0; i < a.length; i++){
			ints[i] = Integer.parseInt(a[i]);
		}
		return ints;
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
	
	public static Font font(String value){
		Font font = FontManager.getFonts().get(value);
		if(font == null){
			String[] arr = value.split(",");
			font = new Font(arr[0], Integer.parseInt(arr[1].trim()), Integer.parseInt(arr[2].trim()));
			FontManager.getFonts().put(value, font);
		}
		return font;
	}
	
	public static Icon icon(String value){
		return new ImageIcon(value);
	}
}
