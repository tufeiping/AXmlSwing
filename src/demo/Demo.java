package demo;

import javax.swing.UIManager;

import org.arong.axmlswing.GuiXmlLoader;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

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
		GuiXmlLoader.load(Demo.class.getResource("/").getPath() + "/demo.xml");
		System.out.println("渲染时间："+ (System.currentTimeMillis() - s));
	}
}