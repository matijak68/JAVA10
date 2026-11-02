package vjezbe5;

import java.util.Scanner;

public class BrojRijeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner(System.in);
		System.out.println("Unesi recenicu: ");
		String recenica = u.nextLine();
		
		int brojRijeci = 0;
		
		for(int i = 0; i<recenica.length(); i++) {
			if(recenica.charAt(i) != ' ') {
				if(i==0 || recenica.charAt(i-1) == ' ') {
					brojRijeci++;
				}
			}
		}
		System.out.println("Recenica ima " + brojRijeci + " rijeci");
		
		
		
		
	}

}
