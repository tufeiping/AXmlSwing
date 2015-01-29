package org.arong.axmlswing.manager;

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
	
	static{
		colors.put("BLUE", Color.BLUE);
		colors.put("WHITE", Color.WHITE);
		colors.put("BLACK", Color.BLACK);
		colors.put("CYAN", Color.CYAN);
		colors.put("DARK_GRAY", Color.DARK_GRAY);
		colors.put("GRAY", Color.GRAY);
		colors.put("GREEN", Color.GREEN);
		colors.put("LIGHT_GRAY", Color.LIGHT_GRAY);
		colors.put("MAGENTA", Color.MAGENTA);
		colors.put("ORANGE", Color.ORANGE);
		colors.put("PINK", Color.PINK);
		colors.put("RED", Color.RED);
		colors.put("YELLOW", Color.YELLOW);
	}
	
	public static void setColors(Map<String, Color> colors) {
		ColorManager.colors = colors;
	}

	public static Map<String, Color> getColors() {
		return colors;
	}
}
