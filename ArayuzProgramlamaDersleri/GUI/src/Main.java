import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//Swing arayuz gels�t�rme arac�

		JFrame frame = new JFrame();//pencere olusturuyoruz
		frame.setSize(200,200);//boyutunu olsuturuyoruz
		
		JPanel panel = new JPanel();//panel urett�k
		
		
		JButton btn = new JButton("Buton");//buton olusturduk
		
		//frame.getContentPane().add(btn);//butonu framen�n �c�ne att�k pencerem�z�n tamam�n� kapsar boyle yaparsak
		panel.add(btn);//panel�n �c�ne butonu ekled�k
		
		frame.add(panel);//panel� framen�n �c�ne att�k bu sek�lde butonu sadece panel �c�nde gosterd�k
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//gorulebilir yap�yor.
		
		
	}

}
