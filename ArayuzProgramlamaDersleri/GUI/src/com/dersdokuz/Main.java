package com.dersdokuz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JcomboBox

		JFrame f = new JFrame("ComboBox ornegý");
		String arr[] = {"C","C#","C++","Java","Python"};
		
		JComboBox cb = new JComboBox(arr);//býr lýste olusturuyor ve ýcýnden secým yapmamýzý ýstýyor
		cb.setBounds(50,100,90,20);
		JButton b1 = new JButton("Seç");
		b1.setBounds(50,150,80,20);
		b1.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "Secýlen proglamlama dili : " + cb.getSelectedItem();//dersek neyý sectýgýmýzý býze yazdýrýr
				//yada cb.getItemdAt(cb.SelectedIndex()) dersemde býze secýlen ýndexý dondurur sonra itemAtle sectýgýmýz degerý verir
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
