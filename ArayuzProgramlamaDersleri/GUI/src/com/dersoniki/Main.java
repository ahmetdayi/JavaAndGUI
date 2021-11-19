package com.dersoniki;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JOptionPane
		
		JFrame f = new JFrame();
		
		//JOptionPane.showMessageDialog(f,"Merhaba");//ýlk parametre frame ýn 2. ýse yazacak yazýdýr bu kod frame acýlmadan once cýkar ve yazýlaný býr pencerede gosterýr.
		//JOptionPane.showMessageDialog(f, "Abone oldun", "Abone ol", JOptionPane.WARNING_MESSAGE);//ýlk satýr frame 2.sýný mesajým 3.su pencerenýn baslýgý
		//4.sude býldýrýmýn turunu gosterýyor warnýng býr býldýrým dondurmesýnýý ýstedýk
		String str = JOptionPane.showInputDialog(f,"Adýnýz : ");//yazýnýn altýna býr alan acýyo ve o alana ýstedýgýmýzý yazabýlýyoruz ben suan strine esitledým sýtrýng býr deger gýrýlecek
		System.out.println(str);//yazdýgýmýz yazýyý consola yazdýrýyoruz.
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
