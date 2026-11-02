package vjezbe5;

import java.util.Scanner;

public class ParanNeparan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine();
		
		System.out.println("Promijenjen tekst: ");
		
		for(int i = 0; i<tekst.length(); i++) {
			
			if(tekst.charAt(i) == '0' || tekst.charAt(i) == '2' ||
					tekst.charAt(i) == '4' || tekst.charAt(i) == '6' ||
					      tekst.charAt(i) == '8') {
				System.out.print("0");
			}else {
				System.out.print("1");
			}
			
			
		}
		
		
		
		
		
	}

}
