package com.dersonbir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Main {

	public static void main(String[] args) {
		// JList
		
		JFrame f = new JFrame("List Ornegi");
		
		DefaultListModel<String> l1 = new DefaultListModel<>();//arraylistlere benzer bir yapsý vardýr
		l1.addElement("C++");
		l1.addElement("JavaScript");
		l1.addElement("Java");
		l1.addElement("PHP");
		JList<String> list = new JList<>(l1);
		list.setBounds(100,100,75,75);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);//listeden sadece býr eleman secmemýze yarýyor
		
		DefaultListModel<String> l2 = new DefaultListModel<>();
		l2.addElement("Swing");
		l2.addElement("VueJs");
		l2.addElement("Bootstrap");
		l2.addElement("Laravel");
		
		JList<String> list2 = new JList<>(l2);
		list2.setBounds(100,200,75,85);
		
		JButton b1 = new JButton("Goster");
		b1.setBounds(200,150,80,30);
		
		b1.addActionListener( new ActionListener() {
			String txt = "";
			@Override
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex() != -1) {
					txt = "Secýlen programlama dýlý : " + list.getSelectedValue();
					
				}
				if(list2.getSelectedIndex() != -1) {
					txt += ", Secýlen framework :" ;
					for(Object item : list2.getSelectedValuesList()) {
						txt+=item+ " ";
					}
				}
			
			System.out.println(txt);
			}
			
		});
		
		f.add(list);
		f.add(list2);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
