package com.Layout;

import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayout1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2));//istedigimiz containeri isted�g�m�z say�ya boluyor yan� 3 e 2 l�k parcalara bolecek
		
		
		p.add(b1); 
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		
		
		
		
		f.add(p);
		//f.pack();//degerler nekadar boyuta s�g�yosa pencerey� o boyutta ac�yor.
		f.setSize(400,400);
		f.setVisible(true);

	}

}
