# AXmlSwing
使用xml简化swing开发
######文档
[wiki](https://github.com/dipoo/AXmlSwing/wiki)
#####1、配置文件axmlswing.cfg.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuation>
	<!-- 配置扫描事件监听器的包名 -->
	<scan-package>demo.listeners</scan-package>
	<!-- 自定义属性，可用于布局文件中：如${title}，或者通过VarsManage.getValues(name)获取值 -->
	<properties>
		<property name="title">虾片神器</property>
		<property name="alert">下载地址不能为空</property>
	</properties>
</configuation>
```
#####布局文件demo.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- 
	${rootPath}:项目根目录src(内置变量)
 -->
<JFrame id="mainWindow" title="${title}" width="300" height="200"
	locationRelativeTo="null" defaultCloseOperation="3" 
	iconImage="${rootPath}/anchor.gif" layout="0">
	<JMenuBar bounds="5, 0, 280, 25" cursor="HAND_CURSOR">
		<JMenu text="任务">
			<JMenuItem text="打开"/>
			<JMenuItem text="保存"/>
			<JMenuItem text="另存为"/>
			<JMenuItem text="退出"/>
		</JMenu>
		<JMenu text="编辑">
			<JMenuItem text="新建"/>
			<JMenuItem text="删除"/>
		</JMenu>
		<JMenu text="搜索"/>
		<JMenu text="帮助"/>
	</JMenuBar>
	<JLabel text="地址" bounds="10, 50, 60, 30" foreground="blue"
		icon="${rootPath}/anchor.gif" />
	<JTextField id="loginUsernameField" text="逗比"
		bounds="60, 50, 220, 30" />
	<JButton id="loginBtn" text="下载" icon="${rootPath}/anchor.gif"
		toolTipText="按钮提示" bounds="100, 100, 100, 30"
		foreground="red" cursor="HAND_CURSOR" font="微软染黑,0,12"/>
</JFrame>
```
#####事件处理LoginBtnListener.java
```java
    package demo.listeners;
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
```  
#####加载布局文件demo.java
```java
    package demo;	
    public class Demo {
        public static void main(String[] args) throws Exception {
		  //加载布局文件
		  GuiXmlLoader.load("demo.xml");
		}
    }
```
