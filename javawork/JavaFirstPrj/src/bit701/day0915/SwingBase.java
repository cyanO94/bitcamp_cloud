package bit701.day0915;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBase extends JFrame{

	public SwingBase() {
		this.setLocation(300, 100);
		this.setSize(300, 300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(SwingBase.this, "프레임을 종료합니다");
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new SwingBase();

	}

}
