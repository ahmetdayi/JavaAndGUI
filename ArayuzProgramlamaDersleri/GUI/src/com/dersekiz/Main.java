package com.dersekiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main {

	public static void main(String[] args) {
		// JRadioButton--> butonlardan b�r�n� �saretl�yeb�l�yosun

		JFrame f = new JFrame("RadioButton Ornegi");
		JRadioButton r1 = new JRadioButton("Kad�n",true);//eger yan�na true yazarsak pencere ac�ld�g�nda o deger sec�l� gel�r bu checkboxlarda da gecerl�.
		JRadioButton r2 = new JRadioButton("Erkek");
		r1.setBounds(100,50,100,30);
		r2.setBounds(100,100,100,30);
		JRadioButton r3 = new JRadioButton("Istemiyorum");
		r3.setBounds(100,150,100,30);
		r1.setActionCommand("k");//butonlar sec�ld�g�nde ne yazacag�n� sec�yoruz
		r2.setActionCommand("E");
		r3.setActionCommand("I");
		
		ButtonGroup bg = new ButtonGroup();//burda b�r button grubu kuruyoruz ve ayn� anda bas�lmamas� gerekt�g�n� bel�rt�yoruz cunku ayn� gruptalar
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		JButton b1 = new JButton("Kontrol");
		b1.setBounds(100,200,100,30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(bg.getSelection().getActionCommand());//sectigimiz kutunun action command�n� get�r�yo
				//istiyorsak if(r1.isSelected()){syso(r1.getText() + "sec�ld� ")} yazarak tek tek ne yazmas� gerekt�g�n� de ayarl�yab�l�r�z.
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
