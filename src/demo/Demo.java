package demo;

import javax.swing.UIManager;

import org.arong.axmlswing.GuiXmlLoader;
import org.arong.axmlswing.manager.ComponentManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import demo.listeners.SwingGenerateListeners;

public class Demo {
	public static void main(String[] args) throws Exception {
		try {
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
			BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
//			WebLookAndFeel.install();
		} catch (Exception e) {

		}
		long s = System.currentTimeMillis();
		//加载布局文件
		//GuiXmlLoader.load(Demo.class.getResource("/").getPath() + "layout/demo.xml");
		//GuiXmlLoader.load(Demo.class.getResource("/").getPath() + "layout/demo2.xml");
		
		GuiXmlLoader.load(Demo.class.getResource("/").getPath() + "layout/swing-generate.xml");
		new SwingGenerateListeners();//注册监听器
		
		System.out.println("渲染时间："+ (System.currentTimeMillis() - s));
	}
}