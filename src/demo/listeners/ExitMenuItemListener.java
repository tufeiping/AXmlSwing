package demo.listeners;

import java.awt.event.ActionEvent;

import org.arong.axmlswing.event.AbstractListener;
import org.arong.axmlswing.event.EventAnnotation;

@EventAnnotation("exitMenuItem")
public class ExitMenuItemListener extends AbstractListener{

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
