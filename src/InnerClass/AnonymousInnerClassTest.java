package InnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousClock clock = new AnonymousClock();
		clock.start(1000, true);
		JOptionPane.showMessageDialog(null, "quit program?");
		System.exit(0);
	}

}

class AnonymousClock{
	public void start(int interval,boolean beep){
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("at the tone,the time is "+new Date());
				if(beep) Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
		
	}
	
}