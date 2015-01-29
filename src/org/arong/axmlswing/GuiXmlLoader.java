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
	public static void loader(String path) throws Exception{
		Document doc = Dom4jUtil.getDOM(path);
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
			AttributeModel attr = parseAttribute(e);
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
				BeanUtil.apply(attr, btn);
				btn.setBounds(attr.getX(), attr.getY(), attr.getWidth(), attr.getHeight());
				if(attr.getBackground() != null){
					btn.setBackground(ColorManager.parseHex(attr.getBackground()));
				}
				if(attr.getForeground() != null){
					btn.setForeground(ColorManager.parseHex(attr.getForeground()));
				}
				if(attr.getBounds() != null){
					
				}
				
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
						BeanUtil.setProperty(model, attr.getName(), new String[]{attr.getText()});
					}
				}
			}
		}
		return model;
	}
	
}
