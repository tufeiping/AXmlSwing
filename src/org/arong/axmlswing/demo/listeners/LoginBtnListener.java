package org.arong.axmlswing.demo.listeners;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.arong.axmlswing.AbstractListener;
import org.arong.axmlswing.ComponentManager;
import org.arong.axmlswing.EventAnnotation;
@EventAnnotation("loginBtn")
public class LoginBtnListener extends AbstractListener{

	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		JFrame mainWindow = (JFrame) ComponentManager.getMainWindow();
		JOptionPane.showMessageDialog(null, "你好, 主窗口名称为：" + mainWindow.getTitle() + ",按钮text:" + btn.getText());
	}

}
