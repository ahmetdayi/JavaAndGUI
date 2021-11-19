package com.dersonbes;

import java.awt.Component;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPopupMenu;



public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPopupMenu p = new JPopupMenu("Menu");//b�r yere sag t�klad�g�nda c�kan menuyu olusturacag�z
		JMenuItem cut = new JMenuItem("Kes"); //o menude c�kacak �temler� olusturuyoruz
		JMenuItem copy = new JMenuItem("Kopyala");//bunlarda asl�nda b�r buton yan� actionlistener� kullanab�l�r�z
		JMenuItem paste = new JMenuItem("Yap�st�r");
		
		
		
		
		
		p.add(cut);
		p.add(copy);
		p.add(paste);
		
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {//mousen�n t�klanmas�n� �zl�yecez
				p.show(f, e.getX(), e.getY());
				
				
			}
		});
		
		
		cut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Kes butonuna bas�ld�.");
				
			}
			
		});
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
