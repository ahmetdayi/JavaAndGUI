package com.dersiki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// btn.setBounds(x,y,weight,height);

		JFrame f = new JFrame("buton orneg�");// bunun ozell�kler�n� en assag�da b�rak�yoruz
		// �c�ne yazd�g�m�z str�ng penceren�n ad�n� bel�rt�yor

		JButton b = new JButton("g�nder");// butonun uzer�nde yazan yaz�y� bel�rt�yo
		//b.setText(); d�yerek bunun �c�nde de tan�ml�yab�l�r�z butonda ne yazacag�n�
		b.setBounds(100, 100, 100, 30);
		
		b.addActionListener(new ActionListener() {//butona t�klama olay�n� yakalay�p butona t�kland�g�nda ne olacagan� yaz�yoruz

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona t�kland�");
				
			}
			
		});
		f.add(b);

		f.setSize(400, 400);
		f.setLayout(null);// layout null oldugu �c�n butonun nerde gozukmes�n� gerekt�g�ne karar verecez
		f.setVisible(true);//bu pencerem�z� gorunur yapt�g� �c�n ne yap�yorsak bunun ustunde yapmal�y�z.

	}

}
