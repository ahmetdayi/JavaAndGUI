package com.dersiki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// btn.setBounds(x,y,weight,height);

		JFrame f = new JFrame("buton ornegý");// bunun ozellýklerýný en assagýda býrakýyoruz
		// ýcýne yazdýgýmýz strýng pencerenýn adýný belýrtýyor

		JButton b = new JButton("gönder");// butonun uzerýnde yazan yazýyý belýrtýyo
		//b.setText(); dýyerek bunun ýcýnde de tanýmlýyabýlýrýz butonda ne yazacagýný
		b.setBounds(100, 100, 100, 30);
		
		b.addActionListener(new ActionListener() {//butona týklama olayýný yakalayýp butona týklandýgýnda ne olacaganý yazýyoruz

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona týklandý");
				
			}
			
		});
		f.add(b);

		f.setSize(400, 400);
		f.setLayout(null);// layout null oldugu ýcýn butonun nerde gozukmesýný gerektýgýne karar verecez
		f.setVisible(true);//bu penceremýzý gorunur yaptýgý ýcýn ne yapýyorsak bunun ustunde yapmalýyýz.

	}

}
