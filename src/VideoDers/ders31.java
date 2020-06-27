package VideoDers;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ders31 extends JFrame {

	private JPanel contentPane;
	int x,y;
	int hizx = 1;
	int hizy = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders31 frame = new ders31();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ders31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("X");
		btn.setBounds(0, 0, 50, 50);
		contentPane.add(btn);
		
		Timer myTimer = new Timer();
		
		TimerTask gorev = new TimerTask() {
			
			@Override
			public void run() {
				x = (int) btn.getBounds().getX();
				y = (int) btn.getBounds().getY();
				x += hizx;
				y += hizy;
				
				btn.setBounds(x, y, 50, 50);
				
				if(x>=450 || x<=0) hizx = hizx * -1;		
				if(y>=200 || y<=0) hizy = hizy * -1;
			}
		};
		
		myTimer.schedule(gorev,0,5);
		
		
	}

}
