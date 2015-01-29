package org.arong.axmlswing.manager;

import java.awt.Cursor;
import java.util.HashMap;
import java.util.Map;

/**
 * 鼠标管理器
 * @author dipoo
 * @since 2015-01-29
 */
public class CursorManager {
	private static Map<String, Cursor> cursors = new HashMap<String, Cursor>();

	static{
		//默认
		cursors.put("DEFAULT", Cursor.getDefaultCursor());
		//十字形
		cursors.put("CROSSHAIR_CURSOR", Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		//调整窗口右边框大小的光标类型。
		cursors.put("E_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
		//手状光标类型。
		cursors.put("HAND_CURSOR", Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//移动光标类型
		cursors.put("MOVE_CURSOR", Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		//调整窗口上边框大小的光标类型。
		cursors.put("N_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
		//调整窗口右上角大小的光标类型。
		cursors.put("NE_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR));
		//调整窗口左上角大小的光标类型。
		cursors.put("NW_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
		//调整窗口下边框大小的光标类型。
		cursors.put("S_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
		//调整窗口右下角大小的光标类型。
		cursors.put("SE_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
		//调整窗口左下角大小的光标类型。
		cursors.put("SW_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
		//文字光标类型。
		cursors.put("TEXT_CURSOR", Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		//调整窗口左边框大小的光标类型。
		cursors.put("W_RESIZE_CURSOR", Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
		//等待光标类型。
		cursors.put("WAIT_CURSOR", Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
	}
	
	public static void setCursors(Map<String, Cursor> cursors) {
		CursorManager.cursors = cursors;
	}

	public static Map<String, Cursor> getCursors() {
		return cursors;
	}
	
}
