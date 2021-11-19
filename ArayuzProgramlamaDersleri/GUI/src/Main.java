import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//Swing arayuz gelsýtýrme aracý

		JFrame frame = new JFrame();//pencere olusturuyoruz
		frame.setSize(200,200);//boyutunu olsuturuyoruz
		
		JPanel panel = new JPanel();//panel urettýk
		
		
		JButton btn = new JButton("Buton");//buton olusturduk
		
		//frame.getContentPane().add(btn);//butonu framenýn ýcýne attýk penceremýzýn tamamýný kapsar boyle yaparsak
		panel.add(btn);//panelýn ýcýne butonu ekledýk
		
		frame.add(panel);//panelý framenýn ýcýne attýk bu sekýlde butonu sadece panel ýcýnde gosterdýk
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//gorulebilir yapýyor.
		
		
	}

}
