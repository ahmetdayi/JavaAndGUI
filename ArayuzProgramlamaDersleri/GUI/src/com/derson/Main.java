package com.derson;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		//JTable

		JFrame f = new JFrame("JTable Ornegi");
		
		String d[][] = {{"1" , "Mat" , "85"} , {"2" , "Fen" , "50"} , {"3" , "Turkce" , "100"}};
		String[] baslik = {"ID" , "Ders" , "Not"};
		JTable t1 = new JTable(d,baslik);
		t1.setBounds(30,40,200,300);
		
		JScrollPane sp = new JScrollPane(t1);//kaydýrma cubugu olusturuyoruz baslýklarý goruntulemeye de yarýyor
		
		f.add(sp);
		f.setSize(400,400);
		//f.setLayout(null); caslýsmasý ýcýn bunun olmamasý lazým cunku layotlarla ýc ýce calýsýyor
		f.setVisible(true);
	}

}
