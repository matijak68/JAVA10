package vjezbe5;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine().toLowerCase();
		
		StringBuilder sb = new StringBuilder(tekst);
		
		String obrnuti = sb.reverse().toString();
		
		tekst = tekst.replace(" ", "");
		obrnuti = obrnuti.replace(" ", "");
		
		if(tekst.equals(obrnuti)) {
			System.out.println("Da");
		}else {
			System.out.println("Ne");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
