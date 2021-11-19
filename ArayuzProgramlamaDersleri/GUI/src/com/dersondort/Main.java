package com.dersondort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JMenu
		
		JFrame f = new JFrame();
		JMenuBar mb = new JMenuBar();//menuler� �c�ne koyacag�m�z bar� olusturduk 
		
		JMenu m = new JMenu("Ana menu");//o bar�n menu olacag�n� soyled�k. Menunun �sm�n� bel�rtmek zorundas�n
		JMenu subMenu = new JMenu("Alt Menuler");//mesala menu1 e geld�g�nde tekrar menu ac�lacak.
		JMenuItem i1 = new JMenuItem("Menu 1");//itemlerimizi bara yerlest�recegiz.
		JMenuItem i2 = new JMenuItem("Menu 2");
		JMenuItem i3 = new JMenuItem("Menu 3");
		JMenuItem i4 = new JMenuItem("Menu 4");
		
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Menu 1 e bas�ld�");
				
			}
			 
		});
		
		JMenuItem a1 = new JMenuItem("Alt Menu 1");
		JMenuItem a2 = new JMenuItem("Alt Menu 2");
		subMenu.add(a1);
		subMenu.add(a2);
				
		
		
		
		
 		
		m.add(i1);//menuye �temler�m�z� ekled�k
		m.add(i2);
		m.add(i3);
		m.add(i4);
		m.add(subMenu);//dersek menu 4 un alt�na Alt menuler d�ye b�r menu ekler ve onun �c�nde de alt menu 1 le 2 olur. hang� menude submenu olmas�n� �st�yorsak ona gore bununla olusturmal�y�z

		mb.add(m);
		f.setJMenuBar(mb);//bar� frame e ekled�k
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
