package ortalama;

import java.util.Scanner;

public class Arrave {

	public static void main(String[] args) {

        double toplam = 0;
		int[] notlar = new int[5];
		Scanner scar = new Scanner(System.in);
		System.out.println("Sýrasýyla notlarýnýzý gýrýnýz : ");
		System.out.print("Matematik : ");
		notlar[0] = scar.nextInt();
		System.out.print("Turkce : ");
		notlar[1] = scar.nextInt();
		System.out.print("beden : ");
		notlar[2] = scar.nextInt();
		System.out.print("Kimya : ");
		notlar[3] = scar.nextInt();
		System.out.print("Fizik : ");
		notlar[4] = scar.nextInt();
		
		for(int not : notlar) {
			toplam += not;
		}
		System.out.println("Ortalama :" + toplam/notlar.length);
		
	}

}
