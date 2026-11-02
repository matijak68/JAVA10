package vjezbe5;

import java.util.Scanner;

public class ObrnutaRecenica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner u = new Scanner (System.in);
		System.out.println("Unesi recenicu: ");
		String recenica = u.nextLine();
		
		String [] rijeci = recenica.split(" ");
		
		System.out.println("Promijenjena recenica je: ");

		
		for(int i = 0; i<rijeci.length; i++) {
			
			StringBuilder sb = new StringBuilder(rijeci[i]);
			
			String pomocna = sb.reverse().toString();
			//moze samo System.out.print(sb.reverse() + " "); bez pomocne i toString();
			System.out.print(pomocna + " ");
			
			
			
			
		}
		
		
		
	}

}
