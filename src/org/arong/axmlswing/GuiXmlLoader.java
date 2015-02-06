package org.arong.axmlswing;

import java.awt.Container;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JToolTip;
import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.JWindow;
import javax.swing.table.JTableHeader;

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
	
	public static void load(String path){
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
	
	public static void printListener(Class<?>... classes){
		Map<String, String> maps = new HashMap<String, String>();
		String key;
		int i = 0;
		for(Class<?> clazz : classes){
			Method[] methods = clazz.getMethods();
			for(Method method : methods){
				if(method.getName().startsWith("add") && method.getName().endsWith("Listener")){
					key = method.getName().substring(3, method.getName().length());
					if(!maps.containsKey(key)){
						System.out.println(key + ",");
						maps.put(key, key);
						i++;
					}
				}
			}
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		/*printListener(JFrame.class, JWindow.class, JDialog.class, JTextField.class, JButton.class, JTabbedPane.class, JEditorPane.class,
				JTable.class ,JLabel.class, JTextArea.class, JRadioButton.class, JRadioButtonMenuItem.class, JCheckBox.class, JCheckBoxMenuItem.class,
				JColorChooser.class, JComboBox.class, JDesktopPane.class, JFileChooser.class, JFormattedTextField.class,
				JInternalFrame.class,JLayeredPane.class,JList.class, JMenu.class, JMenuBar.class,JMenuItem.class, JPanel.class, JPasswordField.class,
				JPopupMenu.class, JProgressBar.class,JRootPane.class, JScrollBar.class, JScrollPane.class,JSeparator.class, JSlider.class,
				JSpinner.class, JSplitPane.class, JToggleButton.class, JToolBar.class, JToolTip.class, JTree.class, JViewport.class);*/
//		ListenerManager.setComponentListeners(JLabel.class, null);
	}
	
	@SuppressWarnings("unchecked")
	public static void parse(Container container, Element e, AttributeModel attr){
		try {
			Iterator<Element> it = e.elementIterator();
			String id;
			String tagName;
			while(it.hasNext()){
				e = it.next();
				attr = parseAttribute(e);
				id = attr.getId();
				tagName = e.getName().toLowerCase();
				EventListener l = ListenerManager.getListener(id);
				/**
				 * 元素的属性可以对应一个组件的javabean,使用反射一一对应
				 */
				if("jframe".equals(tagName)){
					JFrame comp = new JFrame();
					common(id, comp, attr, l, null, e);
				}else if("jwindow".equals(tagName)){
					JWindow comp = new JWindow();
					common(id, comp, attr, l, null, e);
				}else if("jdialog".equals(tagName)){
					JDialog comp = new JDialog();
					common(id, comp, attr, l, null, e);
				}else if("jtextfield".equals(tagName)){
					JTextField comp = new JTextField();
					common(id, comp, attr, l, container, e);
				}else if("jtextarea".equals(tagName)){
					JTextArea comp = new JTextArea();
					common(id, comp, attr, l, container, e);
				}else if("jlabel".equals(tagName)){
					JLabel comp = new JLabel();
					common(id, comp, attr, l, container, e);
				}else if("jbutton".equals(tagName)){
					JButton comp = new JButton();
					common(id, comp, attr, l, container, e);
				}else if("jtogglebutton".equals(tagName)){
					JToggleButton comp = new JToggleButton();
					common(id, comp, attr, l, container, e);
				}else if("jcheckbox".equals(tagName)){
					JCheckBox comp = new JCheckBox();
					common(id, comp, attr, l, container, e);
				}else if("jradiobutton".equals(tagName)){
					JRadioButton comp = new JRadioButton();
					common(id, comp, attr, l, container, e);
				}else if("jmenuitem".equals(tagName)){
					JMenuItem comp = new JMenuItem();
					common(id, comp, attr, l, container, e);
				}else if("jmenu".equals(tagName)){
					JMenu comp = new JMenu();
					common(id, comp, attr, l, container, e);
				}else if("jcheckboxmenuitem".equals(tagName)){
					JMenu comp = new JMenu();
					common(id, comp, attr, l, container, e);
				}else if("jradiobuttonmenuitem".equals(tagName)){
					JRadioButtonMenuItem comp = new JRadioButtonMenuItem();
					common(id, comp, attr, l, container, e);
				}else if("jmenubar".equals(tagName)){
					JMenuBar comp = new JMenuBar();
					common(id, comp, attr, l, container, e);
				}else if("jpanel".equals(tagName)){
					JPanel comp = new JPanel();
					common(id, comp, attr, l, container, e);
				}else if("jrootpane".equals(tagName)){
					JRootPane comp = new JRootPane();
					common(id, comp, attr, l, container, e);
				}else if("jscrollpane".equals(tagName)){
					JScrollPane comp = new JScrollPane();
					common(id, comp, attr, l, container, e);
				}else if("jscrollbar".equals(tagName)){
					JScrollBar comp = new JScrollBar();
					common(id, comp, attr, l, container, e);
				}else if("jcolorchooser".equals(tagName)){
					JColorChooser comp = new JColorChooser();
					common(id, comp, attr, l, container, e);
				}else if("jinternalframe".equals(tagName)){
					JInternalFrame comp = new JInternalFrame();
					common(id, comp, attr, l, container, e);
				}else if("jlayeredpane".equals(tagName)){
					JLayeredPane comp = new JLayeredPane();
					common(id, comp, attr, l, container, e);
				}else if("jlist".equals(tagName)){
					JList comp = new JList();
					common(id, comp, attr, l, container, e);
				}else if("jpopupmenu".equals(tagName)){
					JPopupMenu comp = new JPopupMenu();
					common(id, comp, attr, l, container, e);
				}else if("jprogressbar".equals(tagName)){
					JProgressBar comp = new JProgressBar();
					common(id, comp, attr, l, container, e);
				}else if("jseparator".equals(tagName)){
					JSeparator comp = new JSeparator();
					common(id, comp, attr, l, container, e);
				}else if("jslider".equals(tagName)){
					JSlider comp = new JSlider();
					common(id, comp, attr, l, container, e);
				}else if("jspinner".equals(tagName)){
					JSpinner comp = new JSpinner();
					common(id, comp, attr, l, container, e);
				}else if("jsplitpane".equals(tagName)){
					JSplitPane comp = new JSplitPane();
					common(id, comp, attr, l, container, e);
				}else if("jtabbedpane".equals(tagName)){
					JTabbedPane comp = new JTabbedPane();
					common(id, comp, attr, l, container, e);
				}else if("jtable".equals(tagName)){
					JTable comp = new JTable();
					common(id, comp, attr, l, container, e);
				}else if("jtableheader".equals(tagName)){
					JTableHeader comp = new JTableHeader();
					common(id, comp, attr, l, container, e);
				}else if("jtoolbar".equals(tagName)){
					JToolBar comp = new JToolBar();
					common(id, comp, attr, l, container, e);
				}else if("jtooltip".equals(tagName)){
					JToolTip comp = new JToolTip();
					common(id, comp, attr, l, container, e);
				}else if("jfilechooser".equals(tagName)){
					JFileChooser comp = new JFileChooser();
					common(id, comp, attr, l, container, e);
				}else if("jtree".equals(tagName)){
					JTree comp = new JTree();
					common(id, comp, attr, l, container, e);
				}else if("jviewport".equals(tagName)){
					JViewport comp = new JViewport();
					common(id, comp, attr, l, container, e);
				}
			}
		} catch (IllegalArgumentException e1) {
			//e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} finally{
			
		}
	}
	
	public static void common(String id, Container comp, AttributeModel attr, EventListener l, Container container, Element e){
		ComponentManager.putComponent(id, comp);
		//设置一些基本类型的值
		BeanUtil.apply(attr, comp);
		ComponentManager.setCommonAttribute(comp, attr);
		ComponentManager.setComponentSpecificAttribute(e.getName().toLowerCase(), comp, attr);
		if(l != null){
			ListenerManager.setComponentListeners(comp, l);
		}
		if(container != null){
			container.add(comp);
		}
		parse(comp, e, attr);
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
