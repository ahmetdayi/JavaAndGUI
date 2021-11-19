package com.dersyedi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.*;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		//JCheckBox
		
		JFrame f = new JFrame("JCheckBox orneg�");
		JLabel l1 = new JLabel("Sec�m yap�n");
		l1.setBounds(100,50,300,50);
		
		JCheckBox c1 = new JCheckBox("C++");
		c1.setBounds(100,100,250,50);
		JCheckBox c2 = new JCheckBox("Java");//kutucuk olusturuyo �saretl�yeb�leceg�m�z
		c2.setBounds(100,150,250,50);

		c1.addItemListener((ItemListener) new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {//checkboxun deg�sme durumlar�n� �nceled�g�m�z yer
				
				l1.setText("C++ kutusu " +  (e.getStateChange() == 1? "Sec�ld�" : "Sec�lmed�"));//metod sec�l�p sec�lmed�g�ne bak�yor
				
				
			}
			
		});
		
		
		c2.addItemListener((ItemListener) new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {//checkboxun deg�sme durumlar�n� �nceled�g�m�z yer
				
				l1.setText("Java kutusu " +  (e.getStateChange() == 1? "Sec�ld�" : "Sec�lmed�"));//metod sec�l�p sec�lmed�g�ne bak�yor
				
				
			}
			
		});
		
		
	
		/*JButton b1 = new JButton("Kontrol");
		b1.setBounds(150,200,100,30);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(c1.isSelected()) {
					System.out.println(c1.getText() + " Sec�ld�");
				}
			
				if(c2.isSelected()) {
					System.out.println(c2.getText() + " Sec�ld�");
				}
				
			}
			
		});*/
		
		f.add(l1);
		f.add(c1);
		f.add(c2);
		//f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
