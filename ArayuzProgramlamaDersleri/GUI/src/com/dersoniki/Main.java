package com.dersoniki;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JOptionPane
		
		JFrame f = new JFrame();
		
		//JOptionPane.showMessageDialog(f,"Merhaba");//�lk parametre frame �n 2. �se yazacak yaz�d�r bu kod frame ac�lmadan once c�kar ve yaz�lan� b�r pencerede goster�r.
		//JOptionPane.showMessageDialog(f, "Abone oldun", "Abone ol", JOptionPane.WARNING_MESSAGE);//�lk sat�r frame 2.s�n� mesaj�m 3.su penceren�n basl�g�
		//4.sude b�ld�r�m�n turunu goster�yor warn�ng b�r b�ld�r�m dondurmes�n�� �sted�k
		String str = JOptionPane.showInputDialog(f,"Ad�n�z : ");//yaz�n�n alt�na b�r alan ac�yo ve o alana �sted�g�m�z� yazab�l�yoruz ben suan strine esitled�m s�tr�ng b�r deger g�r�lecek
		System.out.println(str);//yazd�g�m�z yaz�y� consola yazd�r�yoruz.
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
