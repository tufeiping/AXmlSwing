package demo.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.arong.axmlswing.manager.ComponentManager;

public class SwingGenerateListeners {
	public SwingGenerateListeners(){
		JButton testBtn = (JButton) ComponentManager.getComponent("testBtn");
		if(testBtn != null){
			testBtn.addMouseListener(new MouseListener() {
				public void mouseReleased(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {
					JComboBox driver_ = (JComboBox) ComponentManager.getComponent("driver");
					JTextField username_ = (JTextField) ComponentManager.getComponent("username");
					JTextField pwd_ = (JTextField) ComponentManager.getComponent("pwd");
					JTextField url_ = (JTextField) ComponentManager.getComponent("url");
					if(driver_.getSelectedItem() == null){
						JOptionPane.showMessageDialog(null, "数据库连接不能为空");
					}else if("".equals(username_.getText())){
						JOptionPane.showMessageDialog(null, "用户名不能为空");
					}else if("".equals(pwd_.getText())){
						JOptionPane.showMessageDialog(null, "密码不能为空");
					}else if("".equals(url_.getText())){
						JOptionPane.showMessageDialog(null, "数据库URL不能为空");
					}else{
					}
				}
			});
		}
	}
}
