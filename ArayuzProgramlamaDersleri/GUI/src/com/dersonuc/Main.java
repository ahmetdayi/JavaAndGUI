package com.dersonuc;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class Main {

	public static void main(String[] args) {
		// JScroolBar
		
		JFrame f = new JFrame();
		JLabel l = new JLabel();//bunun sayes�nde scrollun nekadar �nd�g�n� frame yazdr�acaz
		l.setBounds(100,50,300,30);
		
		JScrollBar s = new JScrollBar(JScrollBar.VERTICAL,0,10,0,100);//nas�l b�r scroll olusturacag�m�z� yazd�k vertical m� horizontal m�
		//parametredek� d�ger degerler 1.s� scrollun hang� degerden basl�ayacag�n� goster�yor 2.si esnekl�k pay� d�ye gec�yor 
		//scrollun boyundan okadar kucultuluyor 4. degerde scrollun boyu.
		s.setBounds(100,100,50,100);
		
		s.addAdjustmentListener( new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l.setText("scroll degeri : " + (s.getValue()));
			}
			
		});
		
		
		f.add(l);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
