package org.arong.axmlswing;

import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.lang.reflect.Field;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;

import org.arong.axmlswing.attribute.AttributeModel;
import org.arong.axmlswing.attribute.AttributeTransfer;
import org.arong.axmlswing.attribute.AttributeValidator;
import org.arong.axmlswing.manager.ComponentManager;
import org.arong.axmlswing.manager.ListenerManager;
import org.arong.axmlswing.manager.VarsManager;
import org.arong.util.BeanUtil;
import org.arong.util.Dom4jUtil;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;

/**
 * 布局文件加载器
 * @author dipoo
 * @since 2015-01-28
 */
public class GuiXmlLoader {
	
	public static void loader(String path){
		Document doc = null;
		try {
			doc = Dom4jUtil.getDOM(path);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		AttributeModel attr;
		Element e = doc.getRootElement();
		try {
			attr = parseAttribute(e);
			/**
			 * JFrame
			 */
			JFrame window = new JFrame();
			ComponentManager.putComponent(attr.getId(), window);
			ComponentManager.setMainWindow(window);
			BeanUtil.apply(attr, window);
			window.setLayout(null);
			ComponentManager.setCommonAttribute(window, attr);
			if(AttributeValidator.bounds(attr.getMaximizedBounds())){
				int[] arr = AttributeTransfer.bounds(attr.getMaximizedBounds());
				window.setMaximizedBounds(new Rectangle(arr[0], arr[1], arr[2], arr[3]));
			}
			if(!AttributeValidator.isBlank(attr.getIconImage())){
				window.setIconImage(((ImageIcon)AttributeTransfer.icon(attr.getIconImage())).getImage());
			}
			if(!AttributeValidator.isBlank(attr.getLocationRelativeTo())){
				window.setLocationRelativeTo(ComponentManager.getComponent(attr.getLocationRelativeTo()));
			}
			parse(window, e, attr);
			
			window.setVisible(true);
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} finally{
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void parse(Container container, Element e, AttributeModel attr){
		try {
			Iterator<Element> it = e.elementIterator();
			while(it.hasNext()){
				e = it.next();
				attr = parseAttribute(e);
				String id = attr.getId();
				EventListener l = ListenerManager.getListener(id);
				/**
				 * 元素的属性可以对应一个组件的javabean,使用反射一一对应
				 */
				if("JTextField".equals(e.getName())){
					JTextField comp = new JTextField();
					ComponentManager.putComponent(id, comp);
					//设置一些基本类型的值
					BeanUtil.apply(attr, comp);
					ComponentManager.setCommonAttribute(comp, attr);
					
					if(l != null){
						comp.addMouseListener((MouseListener) l);
						comp.addMouseMotionListener((MouseMotionListener) l);
						comp.addMouseWheelListener((MouseWheelListener) l);
						comp.addActionListener((ActionListener) l);
						comp.addFocusListener((FocusListener) l);
						comp.addKeyListener((KeyListener) l);
						comp.addComponentListener((ComponentListener) l);
						comp.addContainerListener((ContainerListener) l);
						comp.addAncestorListener((AncestorListener) l);
						comp.addHierarchyBoundsListener((HierarchyBoundsListener) l);
						comp.addHierarchyListener((HierarchyListener) l);
						comp.addInputMethodListener((InputMethodListener) l);
					}
					container.add(comp);
					parse(comp, e, attr);
				}else if("JLabel".equals(e.getName())){
					JLabel comp = new JLabel();
					ComponentManager.putComponent(id, comp);
					//设置一些基本类型的值
					BeanUtil.apply(attr, comp);
					ComponentManager.setCommonAttribute(comp, attr);
					if(!AttributeValidator.isBlank(attr.getIcon())){
						comp.setIcon(AttributeTransfer.icon(attr.getIcon()));
					}
					if(!AttributeValidator.isBlank(attr.getDisabledIcon())){
						comp.setDisabledIcon(AttributeTransfer.icon(attr.getDisabledIcon()));
					}
					if(l != null){
						comp.addMouseListener((MouseListener) l);
						comp.addMouseMotionListener((MouseMotionListener) l);
						comp.addMouseWheelListener((MouseWheelListener) l);
						comp.addFocusListener((FocusListener) l);
						comp.addKeyListener((KeyListener) l);
						comp.addComponentListener((ComponentListener) l);
						comp.addContainerListener((ContainerListener) l);
						comp.addAncestorListener((AncestorListener) l);
						comp.addHierarchyBoundsListener((HierarchyBoundsListener) l);
						comp.addHierarchyListener((HierarchyListener) l);
						comp.addInputMethodListener((InputMethodListener) l);
					}
					container.add(comp);
					parse(comp, e, attr);
					
				}else if("JButton".equals(e.getName())){
					JButton comp = new JButton();
					ComponentManager.putComponent(id, comp);
					//设置一些基本类型的值
					BeanUtil.apply(attr, comp);
					ComponentManager.setCommonAttribute(comp, attr);
					//其他类型或者参数个数大于一个的需要手动设置
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
					if(l != null){
						comp.addMouseListener((MouseListener) l);
						comp.addMouseMotionListener((MouseMotionListener) l);
						comp.addMouseWheelListener((MouseWheelListener) l);
						comp.addActionListener((ActionListener) l);
						comp.addChangeListener((ChangeListener) l);
						comp.addFocusListener((FocusListener) l);
						comp.addKeyListener((KeyListener) l);
						comp.addComponentListener((ComponentListener) l);
						comp.addContainerListener((ContainerListener) l);
						comp.addAncestorListener((AncestorListener) l);
						comp.addHierarchyBoundsListener((HierarchyBoundsListener) l);
						comp.addHierarchyListener((HierarchyListener) l);
						comp.addInputMethodListener((InputMethodListener) l);
						comp.addItemListener((ItemListener) l);
					}
					container.add(comp);
					parse(comp, e, attr);
				}
			}
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} finally{
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private static AttributeModel parseAttribute(Element e) throws IllegalArgumentException, IllegalAccessException{
		List<Attribute> attrs = e.attributes();
		AttributeModel model = new AttributeModel();
		if(attrs != null && attrs.size() > 0){
			Field[] fields = model.getClass().getDeclaredFields();
			for(Attribute attr : attrs){
				for(Field field : fields){
					if(attr.getName().equals(field.getName())){
						BeanUtil.setProperty(model, attr.getName(), new String[]{VarsManager.transfer(attr.getText())});
					}
				}
			}
		}
		return model;
	}
	
}
