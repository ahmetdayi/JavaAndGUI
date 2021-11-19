package com.dersalti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//JPasswordField
		
		JFrame f = new JFrame("PasswordField Ornegý");
		JLabel l1 = new JLabel("Sýfre : ");
		l1.setBounds(20,20,100,30);
		
		JPasswordField p = new JPasswordField();//ne yazdýgýmýz gozukmeyen býr yazý alaný olusturuyoruz yaný sýfre kýsmýný
		p.setBounds(20,50,100,30);
		JButton b1 = new JButton("Gonder");
		b1.setBounds(20,80,100,30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password = new String(p.getPassword());//getpassword methodu char seklýnde getýrýyor býz bunu strýnge cevýrdýk
				//burda getTextle getýremýyoruz javanýn guvenlýk ýcýn aldýgý býr onlem
				l1.setText(l1.getText() + password);
				
				
			}
			
		});
		
		
		
		f.add(b1);
		f.add(l1);
		f.add(p);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
