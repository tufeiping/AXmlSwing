# AXmlSwing
使用xml简化swing开发
###demo.xml

    <?xml version="1.0" encoding="UTF-8"?>
    <!-- 
    	${rootPath}:项目根目录src
     -->
    <JFrame id="mainWindow" title="主窗口" width="300" height="200" 
            locationRelativeTo="null" defaultCloseOperation="3" 
            iconImage="${rootPath}/anchor.gif">
    	<JLabel text="用户名" bounds="10, 30, 60, 30" foreground="blue" 
            icon="${rootPath}/anchor.gif" />
    	<JTextField id="loginUsernameField" text="张绍荣" bounds="80, 30, 180, 30" />
    	<JButton id="loginBtn" text="登陆按钮" icon="${rootPath}/anchor.gif"
            toolTipText="按钮提示" bounds="100, 100, 100, 30" foreground="red"
            cursor="HAND_CURSOR" font="微软染黑,0,12" />
    </JFrame>

###LoginBtnListener.java

    @EventAnnotation("loginBtn")
    public class LoginBtnListener extends AbstractListener{
        public void mouseClicked(MouseEvent e) {
			JButton btn = (JButton) e.getSource();
			JFrame mainWindow = (JFrame) ComponentManager.getMainWindow();
			JOptionPane.showMessageDialog(null, "你好, 主窗口名称为：" + 
			     mainWindow.getTitle() + ",按钮text:" + btn.getText());
			JTextField field=(JTextField)ComponentManager.getComponent("loginUsernameField");
			JOptionPane.showMessageDialog(null, field.getText());
		}
    }
    
###demo.java
    public class Demo {
      public static void main(String[] args) throws Exception {
		    //加载布局文件
		  GuiXmlLoader.load("demo.xml");
	    }
    }
