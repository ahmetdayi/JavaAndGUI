package com.dersdokuz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JcomboBox

		JFrame f = new JFrame("ComboBox orneg�");
		String arr[] = {"C","C#","C++","Java","Python"};
		
		JComboBox cb = new JComboBox(arr);//b�r l�ste olusturuyor ve �c�nden sec�m yapmam�z� �st�yor
		cb.setBounds(50,100,90,20);
		JButton b1 = new JButton("Se�");
		b1.setBounds(50,150,80,20);
		b1.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "Sec�len proglamlama dili : " + cb.getSelectedItem();//dersek ney� sect�g�m�z� b�ze yazd�r�r
				//yada cb.getItemdAt(cb.SelectedIndex()) dersemde b�ze sec�len �ndex� dondurur sonra itemAtle sect�g�m�z deger� verir
				System.out.println(text);
			}
			
		});
		f.add(cb);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
