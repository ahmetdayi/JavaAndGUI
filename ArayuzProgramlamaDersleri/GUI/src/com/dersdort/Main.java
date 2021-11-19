package com.dersdort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// JTextField --> metin alanlar�

		JFrame f = new JFrame("Text Field ornegi");

		JLabel l1, l2, l3;

		JTextField t1, t2, t3;
		JButton b;

		l1 = new JLabel("�lk say�");
		l1.setBounds(50, 20, 100, 30);
		t1 = new JTextField();
		t1.setBounds(50, 50, 200, 30);

		l2 = new JLabel("�kinci say�");
		l2.setBounds(50, 80, 100, 30);
		t2 = new JTextField();
		t2.setBounds(50, 110, 200, 30);

		l3 = new JLabel("Toplam");
		l3.setBounds(50, 140, 100, 30);
		t3 = new JTextField();
		t3.setBounds(50, 170, 200, 30);
		t3.setEditable(false);//yaz� yazmay� engeller.
		b = new JButton("Toplam");
		b.setBounds(50, 230, 200, 30);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t2.getText());// sitring b�r deger donduruyo normalde get text onu �ntegera
														// dondurduk
				int b = Integer.parseInt(t1.getText());
				int c = a + b;
				String toplam = String.valueOf(c);// c �ntegerd� onu da str�nge dondurduk

				t3.setText(toplam);
			}

		});
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	
}
}
