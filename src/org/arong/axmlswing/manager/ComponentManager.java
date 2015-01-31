package org.arong.axmlswing.manager;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import org.arong.axmlswing.attribute.AttributeModel;
import org.arong.axmlswing.attribute.AttributeTransfer;
import org.arong.axmlswing.attribute.AttributeValidator;
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
	
	/**
	 * 设置组件共有的属性
	 */
	public static void setCommonAttribute(Component comp, AttributeModel attr){
		comp.setBounds(attr.getX(), attr.getY(), attr.getWidth(), attr.getHeight());
		if(AttributeValidator.size(attr.getSize())){
			int[] arr = AttributeTransfer.size(attr.getSize());
			//setSize
			comp.setSize(arr[0], arr[1]);
		}
		if(AttributeValidator.color(attr.getBackground())){
			//setBackground
			comp.setBackground(AttributeTransfer.color(attr.getBackground()));
		}
		if(AttributeValidator.color(attr.getForeground())){
			//setForeground
			comp.setForeground(AttributeTransfer.color(attr.getForeground()));
		}
		if(AttributeValidator.size(attr.getLocation())){
			int[] arr = AttributeTransfer.size(attr.getLocation());
			//setLocation
			comp.setLocation(arr[0], arr[1]);
		}
		if(AttributeValidator.size(attr.getMaximumSize())){
			int[] arr = AttributeTransfer.size(attr.getMaximumSize());
			//setMaximumSize
			comp.setMaximumSize(new Dimension(arr[0], arr[1]));
		}
		if(AttributeValidator.size(attr.getMinimumSize())){
			int[] arr = AttributeTransfer.size(attr.getMinimumSize());
			//setMinimumSize
			comp.setMinimumSize(new Dimension(arr[0], arr[1]));
		}
		if(AttributeValidator.size(attr.getPreferredSize())){
			int[] arr = AttributeTransfer.size(attr.getPreferredSize());
			//setPreferredSize
			comp.setPreferredSize(new Dimension(arr[0], arr[1]));
		}
		if(AttributeValidator.bounds(attr.getBounds())){
			int[] arr = AttributeTransfer.bounds(attr.getBounds());
			//setBounds
			comp.setBounds(arr[0], arr[1], arr[2], arr[3]);
		}
		if(AttributeValidator.cursor(attr.getCursor())){
			//setCursor
			comp.setCursor(AttributeTransfer.cursor(attr.getCursor()));
		}
		if(AttributeValidator.font(attr.getFont())){
			//setFont
			comp.setFont(AttributeTransfer.font(attr.getFont()));
		}
	}
	
}
