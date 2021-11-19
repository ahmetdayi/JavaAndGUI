package com.dersbes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//JTextArea
		
		JFrame f = new JFrame();
		JLabel l1,l2;
		JTextArea t1;
		JButton b1;
		
		l1 = new JLabel();
		l1.setBounds(50,25,100,30);
		
		l2 = new JLabel();
		l2.setBounds(160,25,120,30);
		
		t1 = new JTextArea();
		t1.setBounds(20,75,250,200);
		b1 = new JButton("Hesapla");
		b1.setBounds(100,300,120,30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = t1.getText();//areanýn ýcýne yazýlaný alýyoruz.
				String[] words = txt.split("\\s");//split býr seylerý bolmek ayýrmak ýcýn kullanýlýr.\\s dýyerekte kelýmelerý aldýk
				l1.setText("Kelime sayýsý : " + words.length);
				l2.setText("Karakter sayýsý : " + txt.length());//strýng sýnýfýndan yararlanarak dýrek karakter sayýsýný bulabýlýyoruz
				
				
			}
			
		});
		
		
		
		f.add(b1);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
