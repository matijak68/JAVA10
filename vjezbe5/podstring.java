package vjezbe5;

import java.util.Scanner;

public class podstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine();
		System.out.println("Unesi tekst za provjeru podstringa: ");
		String tekstProvjera = u.nextLine();
		
		if(tekst.contains(tekstProvjera)) {
			System.out.println("Jeste");
				
		}else {
			System.out.println("Nije");
		}
		
		
		
		
		
		
		
	}

}
