package org.arong.axmlswing.manager;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

/**
 * 字体管理器
 * @author dipoo
 * @since 2015-01-29
 */
public class FontManager {
	private static Map<String, Font> fonts = new HashMap<String, Font>();
	

	public static void setFonts(Map<String, Font> fonts) {
		FontManager.fonts = fonts;
	}

	public static Map<String, Font> getFonts() {
		return fonts;
	}
	
}
