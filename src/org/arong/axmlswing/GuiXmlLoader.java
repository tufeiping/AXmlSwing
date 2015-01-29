package org.arong.axmlswing;

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;

import org.arong.axmlswing.attribute.AttributeModel;
import org.arong.axmlswing.attribute.AttributeTransfer;
import org.arong.axmlswing.attribute.AttributeValidator;
import org.arong.axmlswing.manager.ComponentManager;
import org.arong.axmlswing.manager.ListenerManager;
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
	
	@SuppressWarnings("unchecked")
	public static void loader(String path){
		Document doc = null;
		try {
			doc = Dom4jUtil.getDOM(path);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String title = doc.getRootElement().attributeValue("title");
		String width = doc.getRootElement().attributeValue("width");
		String height = doc.getRootElement().attributeValue("height");
		JFrame window = new JFrame(title);
		ComponentManager.setMainWindow(window);
		ComponentManager.putComponent(doc.getRootElement().attributeValue("id"), window);
		window.setSize(Integer.parseInt(width), Integer.parseInt(height));
		window.setLocationRelativeTo(null);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Iterator<Element> it = doc.getRootElement().elementIterator();
		Element e;
		while(it.hasNext()){
			e = it.next();
			AttributeModel attr;
			try {
				attr = parseAttribute(e);
				String id = attr.getId();
				EventListener l = ListenerManager.getListener(id);
				/**
				 * 元素的属性可以对应一个组件的javabean,使用反射一一对应
				 */
				if("JButton".equals(e.getName())){
					/**
					 * JButton属性{
					 * 		id
					 * 		width
					 * 		height
					 * 		x
					 * 		y
					 * 		visible
					 * 		
					 * }
					 */
					JButton btn = new JButton();
					ComponentManager.putComponent(id, btn);
					//设置一些基本类型的值
					BeanUtil.apply(attr, btn);
					//其他类型或者参数个数大于一个的需要手动设置
					btn.setBounds(attr.getX(), attr.getY(), attr.getWidth(), attr.getHeight());
					if(AttributeValidator.color(attr.getBackground())){
						btn.setBackground(AttributeTransfer.color(attr.getBackground()));
					}
					if(AttributeValidator.color(attr.getForeground())){
						btn.setForeground(AttributeTransfer.color(attr.getForeground()));
					}
					if(attr.getBounds() != null && AttributeValidator.bounds(attr.getBounds())){
						int[] arr = AttributeTransfer.bounds(attr.getBounds());
						btn.setBounds(arr[0], arr[1], arr[2], arr[3]);
					}
					if(!AttributeValidator.isBlank(attr.getDisabledIcon())){
						btn.setDisabledIcon(AttributeTransfer.icon(attr.getDisabledIcon()));
					}
					if(!AttributeValidator.isBlank(attr.getIcon())){
						btn.setIcon(AttributeTransfer.icon(attr.getIcon()));
					}
					if(AttributeValidator.cursor(attr.getCursor())){
						btn.setCursor(AttributeTransfer.cursor(attr.getCursor()));
					}
					//
					if(l != null){
						btn.addMouseListener((MouseListener) l);
						btn.addMouseMotionListener((MouseMotionListener) l);
						btn.addMouseWheelListener((MouseWheelListener) l);
						btn.addActionListener((ActionListener) l);
						btn.addChangeListener((ChangeListener) l);
						btn.addFocusListener((FocusListener) l);
						btn.addKeyListener((KeyListener) l);
						btn.addComponentListener((ComponentListener) l);
						btn.addContainerListener((ContainerListener) l);
						btn.addAncestorListener((AncestorListener) l);
						btn.addHierarchyBoundsListener((HierarchyBoundsListener) l);
						btn.addHierarchyListener((HierarchyListener) l);
						btn.addInputMethodListener((InputMethodListener) l);
						btn.addItemListener((ItemListener) l);
					}
					window.getContentPane().add(btn);
				}
				window.setVisible(true);
			} catch (IllegalArgumentException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
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
						BeanUtil.setProperty(model, attr.getName(), new String[]{AttributeTransfer.transfer(attr.getText())});
					}
				}
			}
		}
		return model;
	}
	
}
