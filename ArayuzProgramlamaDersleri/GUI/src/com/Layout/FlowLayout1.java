package com.Layout;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout1 {

	public static void main(String[] args) {
		// nesnelerýmýzý soldan saga sýralar ve onun ne taraftan baslýyacagýný secerýz sagdan mý soldanmý
		
		JFrame f = new JFrame();
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));//default olarak ortalayarak gosterýr býze eger right ya da left yazmassak
		p.add(b1); 
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		
		f.add(p);
		//f.pack();//degerler nekadar boyuta sýgýyosa pencereyý o boyutta acýyor.
		f.setSize(400,400);
		f.setVisible(true);

	}

}
