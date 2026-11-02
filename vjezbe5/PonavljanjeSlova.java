package vjezbe5;

import java.util.Scanner;

public class PonavljanjeSlova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine().toLowerCase();
		
		for(int i = 0; i<tekst.length()-1;i++) {
			
			char slovo = tekst.charAt(i);
			char slovo1 = tekst.charAt(i+1); 
			
			if(slovo == slovo1) {
				
				System.out.println("Ponavlja se slovo: " + slovo);
				
				
			}
			
			
		}
		
		
		
		
	}

}
