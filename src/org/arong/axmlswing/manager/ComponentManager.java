package org.arong.axmlswing.manager;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JWindow;

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
	
	/**
	 * 设置按钮共有的属性
	 */
	public static void setAbstactButtonAttribute(AbstractButton comp, AttributeModel attr){
		if(!AttributeValidator.isBlank(attr.getDisabledIcon())){
			comp.setDisabledIcon(AttributeTransfer.icon(attr.getDisabledIcon()));
		}
		if(!AttributeValidator.isBlank(attr.getIcon())){
			comp.setIcon(AttributeTransfer.icon(attr.getIcon()));
		}
		if(!AttributeValidator.isBlank(attr.getDisabledSelectedIcon())){
			comp.setDisabledSelectedIcon(AttributeTransfer.icon(attr.getDisabledSelectedIcon()));
		}
		if(!AttributeValidator.isBlank(attr.getPressedIcon())){
			comp.setPressedIcon(AttributeTransfer.icon(attr.getPressedIcon()));
		}
		if(!AttributeValidator.isBlank(attr.getRolloverIcon())){
			comp.setRolloverIcon(AttributeTransfer.icon(attr.getRolloverIcon()));
		}
		if(!AttributeValidator.isBlank(attr.getRolloverSelectedIcon())){
			comp.setRolloverSelectedIcon(AttributeTransfer.icon(attr.getRolloverSelectedIcon()));
		}
		if(AttributeValidator.bounds(attr.getMargin())){
			int[] arr = AttributeTransfer.bounds(attr.getMargin());
			comp.setMargin(new Insets(arr[0], arr[1], arr[2], arr[3]));
		}
	}
	
	/**
	 * 设置组件的特殊属性
	 */
	public static void setComponentSpecificAttribute(String name, Component c, AttributeModel attr){
		if("JFrame".toLowerCase().equals(name.toLowerCase())){
			JFrame comp = (JFrame)c;
			if(AttributeValidator.bounds(attr.getMaximizedBounds())){
				int[] arr = AttributeTransfer.bounds(attr.getMaximizedBounds());
				comp.setMaximizedBounds(new Rectangle(arr[0], arr[1], arr[2], arr[3]));
			}
			if(!AttributeValidator.isBlank(attr.getIconImage())){
				comp.setIconImage(((ImageIcon)AttributeTransfer.icon(attr.getIconImage())).getImage());
			}
			if(!AttributeValidator.isBlank(attr.getLocationRelativeTo())){
				comp.setLocationRelativeTo(ComponentManager.getComponent(attr.getLocationRelativeTo()));
			}
		}else if("JWindow".toLowerCase().equals(name.toLowerCase())){
			JWindow comp = (JWindow) c;
			if(!AttributeValidator.isBlank(attr.getIconImage())){
				comp.setIconImage(((ImageIcon)AttributeTransfer.icon(attr.getIconImage())).getImage());
			}
			if(!AttributeValidator.isBlank(attr.getLocationRelativeTo())){
				comp.setLocationRelativeTo(ComponentManager.getComponent(attr.getLocationRelativeTo()));
			}
		}else if("JDialog".toLowerCase().equals(name.toLowerCase())){
			JDialog comp = (JDialog) c;
			if(!AttributeValidator.isBlank(attr.getIconImage())){
				comp.setIconImage(((ImageIcon)AttributeTransfer.icon(attr.getIconImage())).getImage());
			}
			if(!AttributeValidator.isBlank(attr.getLocationRelativeTo())){
				comp.setLocationRelativeTo(ComponentManager.getComponent(attr.getLocationRelativeTo()));
			}
		}else if("JTextField".toLowerCase().equals(name.toLowerCase())){
			JTextField comp = (JTextField) c;
			if(AttributeValidator.color(attr.getCaretColor())){
				comp.setCaretColor(AttributeTransfer.color(attr.getCaretColor()));
			}
			if(AttributeValidator.color(attr.getSelectionColor())){
				comp.setSelectionColor(AttributeTransfer.color(attr.getSelectionColor()));
			}
			if(AttributeValidator.color(attr.getSelectedTextColor())){
				comp.setSelectedTextColor(AttributeTransfer.color(attr.getSelectedTextColor()));
			}
			if(AttributeValidator.color(attr.getDisabledTextColor())){
				comp.setDisabledTextColor(AttributeTransfer.color(attr.getDisabledTextColor()));
			}
			if(AttributeValidator.bounds(attr.getMargin())){
				int[] arr = AttributeTransfer.bounds(attr.getMargin());
				comp.setMargin(new Insets(arr[0], arr[1], arr[2], arr[3]));
			}
		}else if("JTextArea".toLowerCase().equals(name.toLowerCase())){
			JTextArea comp = (JTextArea) c;
			if(AttributeValidator.color(attr.getCaretColor())){
				comp.setCaretColor(AttributeTransfer.color(attr.getCaretColor()));
			}
			if(AttributeValidator.color(attr.getSelectionColor())){
				comp.setSelectionColor(AttributeTransfer.color(attr.getSelectionColor()));
			}
			if(AttributeValidator.color(attr.getSelectedTextColor())){
				comp.setSelectedTextColor(AttributeTransfer.color(attr.getSelectedTextColor()));
			}
			if(AttributeValidator.color(attr.getDisabledTextColor())){
				comp.setDisabledTextColor(AttributeTransfer.color(attr.getDisabledTextColor()));
			}
			if(AttributeValidator.bounds(attr.getMargin())){
				int[] arr = AttributeTransfer.bounds(attr.getMargin());
				comp.setMargin(new Insets(arr[0], arr[1], arr[2], arr[3]));
			}
		}else if("JLabel".toLowerCase().equals(name.toLowerCase())){
			JLabel comp = (JLabel) c;
			if(!AttributeValidator.isBlank(attr.getIcon())){
				comp.setIcon(AttributeTransfer.icon(attr.getIcon()));
			}
			if(!AttributeValidator.isBlank(attr.getDisabledIcon())){
				comp.setDisabledIcon(AttributeTransfer.icon(attr.getDisabledIcon()));
			}
		}else if("JButton".toLowerCase().equals(name.toLowerCase())){
			JButton comp = (JButton) c;
			setAbstactButtonAttribute(comp, attr);
			
		}else if("JCheckBox".toLowerCase().equals(name.toLowerCase())){
			JCheckBox comp = (JCheckBox) c;
			setAbstactButtonAttribute(comp, attr);
		}else if("JRadioButton".toLowerCase().equals(name.toLowerCase())){
			JRadioButton comp = (JRadioButton) c;
			setAbstactButtonAttribute(comp, attr);
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}else if("".equals(name)){
			
		}
	}
	
}
