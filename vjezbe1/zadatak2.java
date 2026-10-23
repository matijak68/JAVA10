package vjezbe1;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 //Unese se tri broja a b i cc. Program odredjuje koliko je pozitivnih a koliko negativnih projeva. 
	//Nule je pozitivan broj.
		
		int a, b, c;
		int brojPozitivnih = 0;
		
		Scanner u = new Scanner(System.in);
	
		System.out.println("Unesi a ");
		a = u.nextInt();
		System.out.println("Unesi b ");
		b = u.nextInt();
		System.out.println("Unesi c ");
		c = u.nextInt();
		
		if(a>=0) {
			brojPozitivnih++;
		}
		if(b>=0) {
			brojPozitivnih++;
		}
		if(c>=0) {
			brojPozitivnih++;
		}
		
		System.out.printf("Uneseno je %d pozitivnih i %d negativnih brojeva", brojPozitivnih, 3-brojPozitivnih);
		
		
    }
	
}