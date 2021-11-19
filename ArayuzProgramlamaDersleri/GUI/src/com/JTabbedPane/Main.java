package com.JTabbedPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main {

	public static void main(String[] args) {
		//chromdaký sekmeler gýbý býr sekme olusturacaz
		
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("Ýlk Alan");
		JPanel p1 = new JPanel();//panelýn ýcýne tabbedpaneyý atacaz.
		p1.add(l1);
		
		JLabel l2 = new JLabel("Ýkici Alan");
		JPanel p2 = new JPanel();//panelýn ýcýne tabbedpaneyý atacaz.
		p1.add(l1);
		
		JLabel l3 = new JLabel("Ucuncu Alan");
		JPanel p3 = new JPanel();//panelýn ýcýne tabbedpaneyý atacaz.
		p1.add(l1);
		p2.add(l2);
		p3.add(l3);
		
		
		JTabbedPane tb = new JTabbedPane();
		tb.setBounds(50,50,200,200);
		tb.add("ilk",p1);
		tb.add("ýkýncý",p2);
		tb.add("ucuncu",p3);
		
		
		f.add(tb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
