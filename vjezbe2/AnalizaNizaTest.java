package vjezbe2;

import java.util.Scanner;

public class AnalizaNizaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner u = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n = u.nextInt();
		
		int niz[] = new int[n];
		
		for(int i = 0; i<niz.length; i++) {
			System.out.println("Unesite element "+(i+1) );
			niz[i] = u.nextInt();
			
		}
		
	
		
		AnalizaNiza a = new AnalizaNiza();
		
		double prosjek = a.nadjiParniPozitivniProsjek(niz);
		
		System.out.println("Prosjek je: " +prosjek);
	}
}
