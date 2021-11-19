package com.dersalti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//JPasswordField
		
		JFrame f = new JFrame("PasswordField Orneg�");
		JLabel l1 = new JLabel("S�fre : ");
		l1.setBounds(20,20,100,30);
		
		JPasswordField p = new JPasswordField();//ne yazd�g�m�z gozukmeyen b�r yaz� alan� olusturuyoruz yan� s�fre k�sm�n�
		p.setBounds(20,50,100,30);
		JButton b1 = new JButton("Gonder");
		b1.setBounds(20,80,100,30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password = new String(p.getPassword());//getpassword methodu char sekl�nde get�r�yor b�z bunu str�nge cev�rd�k
				//burda getTextle get�rem�yoruz javan�n guvenl�k �c�n ald�g� b�r onlem
				l1.setText(l1.getText() + password);
				
				
			}
			
		});
		
		
		
		f.add(b1);
		f.add(l1);
		f.add(p);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
