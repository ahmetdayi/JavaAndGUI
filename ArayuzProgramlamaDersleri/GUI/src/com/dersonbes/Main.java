package com.dersonbes;

import java.awt.Component;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPopupMenu;



public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPopupMenu p = new JPopupMenu("Menu");//býr yere sag týkladýgýnda cýkan menuyu olusturacagýz
		JMenuItem cut = new JMenuItem("Kes"); //o menude cýkacak ýtemlerý olusturuyoruz
		JMenuItem copy = new JMenuItem("Kopyala");//bunlarda aslýnda býr buton yaný actionlistenerý kullanabýlýrýz
		JMenuItem paste = new JMenuItem("Yapýstýr");
		
		
		
		
		
		p.add(cut);
		p.add(copy);
		p.add(paste);
		
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {//mousenýn týklanmasýný ýzlýyecez
				p.show(f, e.getX(), e.getY());
				
				
			}
		});
		
		
		cut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Kes butonuna basýldý.");
				
			}
			
		});
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
