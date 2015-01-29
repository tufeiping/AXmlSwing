package org.arong.axmlswing;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
/**
 * 颜色管理器
 * @author dipoo
 * @since 2015-01-28
 */
public class ColorManager {
	
	private static Map<String, Color> colors = new HashMap<String, Color>();
	
	/**
	 * 十六进制颜色转换为RGB颜色
	 * @param c 要转换的十六进制颜色
	 */
    public static Color parseHex(final String c) {
    	//先检测缓存
    	if(colors.containsKey(c.toLowerCase())){
    		return colors.get(c.toLowerCase());
    	}
        Color convertedColor = Color.WHITE;
        if("blue".equals(c.toLowerCase())){
        	convertedColor = Color.BLUE;
        }else if("black".equals(c.toLowerCase())){
        	convertedColor = Color.BLACK;
        }else if("cyan".equals(c.toLowerCase())){
        	convertedColor = Color.CYAN;
        }else if("darkgray".equals(c.toLowerCase())){
        	convertedColor = Color.DARK_GRAY;
        }else if("gray".equals(c.toLowerCase())){
        	convertedColor = Color.GRAY;
        }else if("green".equals(c.toLowerCase())){
        	convertedColor = Color.GREEN;
        }else if("lightgray".equals(c.toLowerCase())){
        	convertedColor = Color.LIGHT_GRAY;
        }else if("magenta".equals(c.toLowerCase())){
        	convertedColor = Color.MAGENTA;
        }else if("orange".equals(c.toLowerCase())){
        	convertedColor = Color.ORANGE;
        }else if("pink".equals(c.toLowerCase())){
        	convertedColor = Color.PINK;
        }else if("red".equals(c.toLowerCase())){
        	convertedColor = Color.RED;
        }else if("yellow".equals(c.toLowerCase())){
        	convertedColor = Color.YELLOW;
        }else{
        	try {
                convertedColor = new Color(Integer.parseInt(c, 16));
            } catch(NumberFormatException e) {
                
            }
        }
        //放入缓存
        colors.put(c.toLowerCase(), convertedColor);
        return convertedColor;
    }
}
