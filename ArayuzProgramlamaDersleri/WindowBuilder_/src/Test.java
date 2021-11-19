import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("gir");
		lbl1.setToolTipText("git\r\n");
		lbl1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lbl1.setBounds(144, 35, 163, 42);
		contentPane.add(lbl1);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tf1.setToolTipText("gir");
		tf1.setBounds(144, 87, 163, 33);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton btn1 = new JButton("Gonder");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(tf1.getText());
				
			}
		});
		btn1.setFont(new Font("Sitka Text", Font.BOLD, 14));
		btn1.setBounds(144, 125, 163, 42);
		contentPane.add(btn1);
	}
}
