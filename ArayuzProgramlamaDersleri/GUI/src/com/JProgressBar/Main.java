package com.JProgressBar;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
	//yukleme cubugudur 
		JFrame f = new JFrame();
		JProgressBar jb = new JProgressBar(0,2000);//2000 e kadar yukleme yapacag�n� goster�yor.
		jb.setBounds(40,40,160,30);
		jb.setValue(0);//bunu 0 la yukleme cubugu 0 dan baslar bunu deg�st�rerek yuklemey� tamaml�yacaz.
		jb.setStringPainted(true);//daha guzel b�r arayuz �c�n
		
		
		
		f.add(jb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		int i = 0;
		while(i<=2000) {//while dongusuyle deger� artt�r�yoruz
			jb.setValue(i);
			i = i+20; 
		try {
			Thread.sleep(500);//cubugun dolma sures�n� yavaslatt�k
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	}

}
