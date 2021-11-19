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
		
		JFrame f = new JFrame("JCheckBox ornegý");
		JLabel l1 = new JLabel("Secým yapýn");
		l1.setBounds(100,50,300,50);
		
		JCheckBox c1 = new JCheckBox("C++");
		c1.setBounds(100,100,250,50);
		JCheckBox c2 = new JCheckBox("Java");//kutucuk olusturuyo ýsaretlýyebýlecegýmýz
		c2.setBounds(100,150,250,50);

		c1.addItemListener((ItemListener) new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {//checkboxun degýsme durumlarýný ýnceledýgýmýz yer
				
				l1.setText("C++ kutusu " +  (e.getStateChange() == 1? "Secýldý" : "Secýlmedý"));//metod secýlýp secýlmedýgýne bakýyor
				
				
			}
			
		});
		
		
		c2.addItemListener((ItemListener) new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {//checkboxun degýsme durumlarýný ýnceledýgýmýz yer
				
				l1.setText("Java kutusu " +  (e.getStateChange() == 1? "Secýldý" : "Secýlmedý"));//metod secýlýp secýlmedýgýne bakýyor
				
				
			}
			
		});
		
		
	
		/*JButton b1 = new JButton("Kontrol");
		b1.setBounds(150,200,100,30);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(c1.isSelected()) {
					System.out.println(c1.getText() + " Secýldý");
				}
			
				if(c2.isSelected()) {
					System.out.println(c2.getText() + " Secýldý");
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
