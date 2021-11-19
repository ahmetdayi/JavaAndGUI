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
		JMenuBar mb = new JMenuBar();//menulerý ýcýne koyacagýmýz barý olusturduk 
		
		JMenu m = new JMenu("Ana menu");//o barýn menu olacagýný soyledýk. Menunun ýsmýný belýrtmek zorundasýn
		JMenu subMenu = new JMenu("Alt Menuler");//mesala menu1 e geldýgýnde tekrar menu acýlacak.
		JMenuItem i1 = new JMenuItem("Menu 1");//itemlerimizi bara yerlestýrecegiz.
		JMenuItem i2 = new JMenuItem("Menu 2");
		JMenuItem i3 = new JMenuItem("Menu 3");
		JMenuItem i4 = new JMenuItem("Menu 4");
		
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Menu 1 e basýldý");
				
			}
			 
		});
		
		JMenuItem a1 = new JMenuItem("Alt Menu 1");
		JMenuItem a2 = new JMenuItem("Alt Menu 2");
		subMenu.add(a1);
		subMenu.add(a2);
				
		
		
		
		
 		
		m.add(i1);//menuye ýtemlerýmýzý ekledýk
		m.add(i2);
		m.add(i3);
		m.add(i4);
		m.add(subMenu);//dersek menu 4 un altýna Alt menuler dýye býr menu ekler ve onun ýcýnde de alt menu 1 le 2 olur. hangý menude submenu olmasýný ýstýyorsak ona gore bununla olusturmalýyýz

		mb.add(m);
		f.setJMenuBar(mb);//barý frame e ekledýk
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
