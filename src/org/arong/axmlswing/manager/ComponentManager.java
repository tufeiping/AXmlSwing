package org.arong.axmlswing.manager;

import java.awt.Component;
import java.awt.Container;
import java.util.HashMap;
import java.util.Map;
/**
 * 组件管理器
 * @author dipoo
 * @since 2015-01-27
 */
public class ComponentManager {
	private static Container mainWindow;
	
	private static Map<String, Component> listeners = new HashMap<String, Component>();
	
	public static Component getComponent(String id){
		return listeners.get(id);
	}
	
	public static void putComponent(String id, Component component){
		listeners.put(id, component);
	}

	public static void setMainWindow(Container mainWindow) {
		ComponentManager.mainWindow = mainWindow;
	}

	public static Container getMainWindow() {
		return mainWindow;
	}
}
