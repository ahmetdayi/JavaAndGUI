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
		JLabel l = new JLabel();//bunun sayesýnde scrollun nekadar ýndýgýný frame yazdrýacaz
		l.setBounds(100,50,300,30);
		
		JScrollBar s = new JScrollBar(JScrollBar.VERTICAL,0,10,0,100);//nasýl býr scroll olusturacagýmýzý yazdýk vertical mý horizontal mý
		//parametredeký dýger degerler 1.sý scrollun hangý degerden baslýayacagýný gosterýyor 2.si esneklýk payý dýye gecýyor 
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
