package vjezbe5;

import java.util.Scanner;

public class NegativniJednocifreni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine();
		
		int brojac = 0;
		
		for(int i = 0; i<tekst.length(); i++) {
			
			if(tekst.charAt(i) == '-') {
				
				if ((i+2 < tekst.length() &&
					    (tekst.charAt(i+2) == '+' || tekst.charAt(i+2) == '-'))
					    || i+2 == tekst.length()) {

					    brojac++;
					}
			}
			
			
		}
		
		System.out.println(brojac);
		
		
		
	}

}
