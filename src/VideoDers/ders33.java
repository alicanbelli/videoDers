package VideoDers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class ders33 extends JFrame {

	private JPanel contentPane;
	
	static int i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders33 frame = new ders33();
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
	public ders33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 77, 209, 163);
		contentPane.add(textPane);
		
		JButton bblue = new JButton("mavi");
		bblue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
			}
		});
		bblue.setBounds(12, 30, 84, 25);
		contentPane.add(bblue);
		
		JButton bred = new JButton("k\u0131rm\u0131z\u0131");
		bred.setBounds(125, 30, 96, 25);
		contentPane.add(bred);
		
		Thread t1 = new Thread() {
			public void run() {
				do {
			  	bblue.setBackground(Color.BLUE);
			  	bred.setBackground(Color.GRAY);
			  	textPane.setText(textPane.getText()+"\nMavi");
			  	}while(true);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				do {
				bblue.setBackground(Color.GRAY);
			  	bred.setBackground(Color.RED);	
			  	textPane.setText(textPane.getText()+"\nKýrmýzý");
				}while(true);
			}
		};
		
		t1.start();
		t2.start();
		
		
	}
}
