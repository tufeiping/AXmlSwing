package demo.listeners;

import java.awt.Container;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.arong.axmlswing.event.AbstractListener;
import org.arong.axmlswing.event.EventAnnotation;
import org.arong.axmlswing.manager.ComponentManager;
@EventAnnotation("loginBtn")
public class LoginBtnListener extends AbstractListener{

	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		JFrame mainWindow = (JFrame) ComponentManager.getMainWindow();
		JOptionPane.showMessageDialog(null, "你好, 主窗口名称为：" + mainWindow.getTitle() + ",按钮text:" + btn.getText());
		JTextField field = (JTextField) ComponentManager.getComponent("loginUsernameField");
		JOptionPane.showMessageDialog(null, field.getText());
	}

	public void init(Container c) {
		JButton btn = (JButton)c;
		System.out.println("初始化：" + btn.getText());
	}
}