package com.dersekiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main {

	public static void main(String[] args) {
		// JRadioButton--> butonlardan býrýný ýsaretlýyebýlýyosun

		JFrame f = new JFrame("RadioButton Ornegi");
		JRadioButton r1 = new JRadioButton("Kadýn",true);//eger yanýna true yazarsak pencere acýldýgýnda o deger secýlý gelýr bu checkboxlarda da gecerlý.
		JRadioButton r2 = new JRadioButton("Erkek");
		r1.setBounds(100,50,100,30);
		r2.setBounds(100,100,100,30);
		JRadioButton r3 = new JRadioButton("Istemiyorum");
		r3.setBounds(100,150,100,30);
		r1.setActionCommand("k");//butonlar secýldýgýnde ne yazacagýný secýyoruz
		r2.setActionCommand("E");
		r3.setActionCommand("I");
		
		ButtonGroup bg = new ButtonGroup();//burda býr button grubu kuruyoruz ve ayný anda basýlmamasý gerektýgýný belýrtýyoruz cunku ayný gruptalar
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		JButton b1 = new JButton("Kontrol");
		b1.setBounds(100,200,100,30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(bg.getSelection().getActionCommand());//sectigimiz kutunun action commandýný getýrýyo
				//istiyorsak if(r1.isSelected()){syso(r1.getText() + "secýldý ")} yazarak tek tek ne yazmasý gerektýgýný de ayarlýyabýlýrýz.
			}
			
		});
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
