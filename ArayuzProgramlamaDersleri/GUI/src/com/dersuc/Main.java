package com.dersuc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		//JLabel
		
		JFrame f = new JFrame("Label Orneg�");
		JLabel l1 = new JLabel("Yaz� k�sm�");//pencerede gozukecek ve t�klanma g�b� �slev� olmayan sadece b�r yaz� olusturuyozruz
		//l1.setText("") d�yerek de yaz�y� yazab�l�r�z
		l1.setBounds(100,100,120,30);
		JButton b = new JButton("deg�st�r");
		b.setBounds(100,200,100,30);
		
		b.addActionListener(new ActionListener() {

			int c = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
			
				l1.setText("Butona T�kland� " + c++);
				
			}
			
		});
		
		f.add(b);
		
		f.add(l1);
		
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
