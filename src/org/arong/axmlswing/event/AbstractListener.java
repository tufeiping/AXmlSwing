package org.arong.axmlswing.event;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.ExpandVetoException;
/**
 * 抽象事件监听器，所有控件的事件实现类应该要继承这个类，然后按需重写方法
 * @author dipoo
 * @since 2015-01-27
 */
public class AbstractListener implements 
	MouseListener, //鼠标监听，包括点击、进入、移出、按下、弹起
	MouseMotionListener,//鼠标拖动及移动
	MouseWheelListener, //鼠标滚轮旋转时调用 
	KeyListener, //按键及按键弹起
	ActionListener, //动作
	WindowStateListener, //窗口状态改变
	WindowFocusListener,//窗口焦点变化
	WindowListener, //窗口打开、关闭、最小化（恢复）、活动
	FocusListener, //焦点变化
	ChangeListener, //状态改变
	ComponentListener, //控件大小变化、隐藏、显示
	ContainerListener, //添加、移除组件
	AncestorListener, //JComponent 或其祖先之一发生更改时进行通知。这些更改包括移动和组件变得可见或不可见时（通过 setVisible() 方法，或者将组件添加到组件层次结构中或从中移除）。 
	HierarchyBoundsListener, //祖先的移动和大小调整事件
	HierarchyListener, //层次结构变化
	InputMethodListener, //文本变化
	ItemListener, //已选定或取消选定某项
	CaretListener,//文本组件插入符的位置更改
	HyperlinkListener,//更新超文本链接
	MenuDragMouseListener,//菜单鼠标拖动
	MenuKeyListener,//菜单按键
	PopupMenuListener,//弹出菜单侦听器 
	InternalFrameListener,
	ListSelectionListener,//选择值发生更改
	MenuListener,//菜单事件侦听器
	AdjustmentListener,//调整事件的侦听器
	TreeExpansionListener,//树扩展或折叠某一节点
	TreeSelectionListener,//TreeSelectionModel 中的选择发生更改时
	TreeWillExpandListener,//当树扩展或折叠某一节点
	VetoableChangeListener,
	PropertyChangeListener
{
	//初始化
	public void init(Container c){}
	//--------------MouseListener---------------
	/**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     */
	public void mouseClicked(MouseEvent e) {}
	 /**
     * Invoked when the mouse enters a component.
     */
	public void mouseEntered(MouseEvent e) {}
	/**
     * Invoked when the mouse exits a component.
     */
	public void mouseExited(MouseEvent e) {}
	/**
     * Invoked when a mouse button has been pressed on a component.
     */
	public void mousePressed(MouseEvent e) {}
	/**
     * Invoked when a mouse button has been released on a component.
     */
	public void mouseReleased(MouseEvent e) {}
	
	//--------------MouseMotionListener---------------
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	
	
	//--------------MouseWheelListener---------------
	/**
     * Invoked when the mouse wheel is rotated.
     * @see MouseWheelEvent
     */
	public void mouseWheelMoved(MouseWheelEvent e) {}
	
	
	//--------------KeyListener---------------
	/**
     * Invoked when a key has been pressed. 
     * See the class description for {@link KeyEvent} for a definition of 
     * a key pressed event.
     */
	public void keyPressed(KeyEvent e) {}
	/**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of 
     * a key released event.
     */
	public void keyReleased(KeyEvent e) {}
	/**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of 
     * a key typed event.
     */
	public void keyTyped(KeyEvent e) {}
	
	
	//--------------ActionListener---------------
	 /**
     * Invoked when an action occurs.
     */
	public void actionPerformed(ActionEvent e) {}
	
	
	//--------------WindowStateListener---------------
	/**
     * Invoked when window state is changed.
     */
	public void windowStateChanged(WindowEvent e) {}
	
	
	//--------------WindowFocusListener---------------
	public void windowGainedFocus(WindowEvent e) {}
	public void windowLostFocus(WindowEvent e) {}
	
	
	//--------------WindowListener---------------
	/**
     * Invoked when the Window is set to be the active Window. Only a Frame or
     * a Dialog can be the active Window. The native windowing system may
     * denote the active Window or its children with special decorations, such
     * as a highlighted title bar. The active Window is always either the
     * focused Window, or the first Frame or Dialog that is an owner of the
     * focused Window.
     */
	public void windowActivated(WindowEvent e) {}//变为活动窗口
	/**
     * Invoked when a window has been closed as the result
     * of calling dispose on the window.
     */
	public void windowClosed(WindowEvent e) {}//窗口被关闭
	/**
     * Invoked when the user attempts to close the window
     * from the window's system menu.
     */
	public void windowClosing(WindowEvent e) {}//窗口被关闭中
	/**
     * Invoked when a Window is no longer the active Window. Only a Frame or a
     * Dialog can be the active Window. The native windowing system may denote
     * the active Window or its children with special decorations, such as a
     * highlighted title bar. The active Window is always either the focused
     * Window, or the first Frame or Dialog that is an owner of the focused
     * Window.
     */
	public void windowDeactivated(WindowEvent e) {}//变为不活动窗口
	/**
     * Invoked when a window is changed from a minimized
     * to a normal state.
     */
	public void windowDeiconified(WindowEvent e) {}//窗口由最小化恢复
	/**
     * Invoked when a window is changed from a normal to a
     * minimized state. For many platforms, a minimized window 
     * is displayed as the icon specified in the window's 
     * iconImage property.
     * @see java.awt.Frame#setIconImage
     */
	public void windowIconified(WindowEvent e) {}//窗口最小化
	/**
     * Invoked the first time a window is made visible.
     */
	public void windowOpened(WindowEvent e) {}//窗口打开
	
	
	//--------------FocusListener---------------
	/**
     * Invoked when a component gains the keyboard focus.
     */
	public void focusGained(FocusEvent e) {}
	/**
     * Invoked when a component loses the keyboard focus.
     */
	public void focusLost(FocusEvent e) {}
	
	
	//--------------ChangeListener---------------
	/**
     * Invoked when the target of the listener has changed its state.
     */
	public void stateChanged(ChangeEvent e) {}
	
	
	//--------------ComponentListener---------------
	public void componentHidden(ComponentEvent e) {}
	public void componentMoved(ComponentEvent e) {}
	public void componentResized(ComponentEvent e) {}
	public void componentShown(ComponentEvent e) {}

	
	//--------------ContainerListener---------------
	/**
     * Invoked when a component has been added to the container.
     */
    public void componentAdded(ContainerEvent e){}
    /**
     * Invoked when a component has been removed from the container.
     */    
    public void componentRemoved(ContainerEvent e){}
    
    
    //--------------AncestorListener---------------
    /**
     * Called when the source or one of its ancestors is made visible
     * either by setVisible(true) being called or by its being
     * added to the component hierarchy.  The method is only called
     * if the source has actually become visible.  For this to be true
     * all its parents must be visible and it must be in a hierarchy
     * rooted at a Window
     */
    public void ancestorAdded(AncestorEvent event){}

    /**
     * Called when the source or one of its ancestors is made invisible
     * either by setVisible(false) being called or by its being
     * remove from the component hierarchy.  The method is only called
     * if the source has actually become invisible.  For this to be true
     * at least one of its parents must by invisible or it is not in
     * a hierarchy rooted at a Window
     */
    public void ancestorRemoved(AncestorEvent event){}

    /**
     * Called when either the source or one of its ancestors is moved.
     */
    public void ancestorMoved(AncestorEvent event){}
    
    
    //--------------HierarchyBoundsListener---------------
    /**
     * Called when an ancestor of the source is moved.
     */
    public void ancestorMoved(HierarchyEvent e){}

    /**
     * Called when an ancestor of the source is resized.
     */
    public void ancestorResized(HierarchyEvent e){}
    
    
    //--------------HierarchyListener---------------
    /**
     * Called when the hierarchy has been changed. To discern the actual
     * type of change, call <code>HierarchyEvent.getChangeFlags()</code>.
     *
     * @see HierarchyEvent#getChangeFlags()
     */
    public void hierarchyChanged(HierarchyEvent e){}
    
    
    //--------------HierarchyListener---------------
    /**
     * Invoked when the text entered through an input method has changed.
     */
    public void inputMethodTextChanged(InputMethodEvent event){}

    /**
     * Invoked when the caret within composed text has changed.
     */
    public void caretPositionChanged(InputMethodEvent event){}
    
    
    //--------------ItemListener---------------
    /**
     * Invoked when an item has been selected or deselected by the user.
     * The code written for this method performs the operations
     * that need to occur when an item is selected (or deselected).
     */    
    public void itemStateChanged(ItemEvent e){}
    
    
    //--------------CaretListener---------------
    /**
     * Called when the caret position is updated.
     */
	public void caretUpdate(CaretEvent e) {}
	
	public void hyperlinkUpdate(HyperlinkEvent e) {}
	public void menuDragMouseDragged(MenuDragMouseEvent e) {}
	public void menuDragMouseEntered(MenuDragMouseEvent e) {}
	public void menuDragMouseExited(MenuDragMouseEvent e) {}
	public void menuDragMouseReleased(MenuDragMouseEvent e) {}
	public void menuKeyPressed(MenuKeyEvent e) {}
	public void menuKeyReleased(MenuKeyEvent e) {}
	public void menuKeyTyped(MenuKeyEvent e) {}
	public void popupMenuCanceled(PopupMenuEvent e) {}
	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}
	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
	public void internalFrameActivated(InternalFrameEvent e) {}
	public void internalFrameClosed(InternalFrameEvent e) {}
	public void internalFrameClosing(InternalFrameEvent e) {}
	public void internalFrameDeactivated(InternalFrameEvent e) {}
	public void internalFrameDeiconified(InternalFrameEvent e) {}
	public void internalFrameIconified(InternalFrameEvent e) {}
	public void internalFrameOpened(InternalFrameEvent e) {}
	public void valueChanged(ListSelectionEvent e) {}
	public void menuCanceled(MenuEvent e) {}
	public void menuDeselected(MenuEvent e) {}
	public void menuSelected(MenuEvent e) {}
	public void adjustmentValueChanged(AdjustmentEvent e) {}
	public void treeCollapsed(TreeExpansionEvent event) {}
	public void treeExpanded(TreeExpansionEvent event) {}
	public void valueChanged(TreeSelectionEvent e) {}
	public void treeWillCollapse(TreeExpansionEvent event) throws ExpandVetoException {}
	public void treeWillExpand(TreeExpansionEvent event) throws ExpandVetoException {}
	public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {}
	public void propertyChange(PropertyChangeEvent evt) {}
}
