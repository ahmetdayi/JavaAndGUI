package com.Layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// 
		
		JFrame f = new JFrame();
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(b1,BorderLayout.NORTH);//border layout b�z�m container�m�z�(frame yada label) 5 parcaya ay�r�r kuzey guney dogu bat� ve merkez 
		p.add(b2,BorderLayout.SOUTH);
		p.add(b3,BorderLayout.WEST);
		p.add(b4,BorderLayout.EAST);
		p.add(b5,BorderLayout.CENTER);
		
		f.add(p);
		//f.pack();//degerler nekadar boyuta s�g�yosa pencerey� o boyutta ac�yor.
		f.setSize(400,400);
		f.setVisible(true);

	}

}
