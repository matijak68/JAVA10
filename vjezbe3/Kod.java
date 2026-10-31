package vjezbe3;

import java.util.Scanner;

public class Kod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner (System.in);
		System.out.println("Unesite trocifreni broj:");
		int broj = u.nextInt();
		
		int cifra1 = broj/100;
		int cifra2 = (broj/10)%10;
		int cifra3 = broj%10;
		
		int kod = (cifra1 * cifra2* cifra3) - (cifra1 + cifra2 + cifra3);
		
		System.out.println("Kod za vrata je" + kod);

		
	}

}
