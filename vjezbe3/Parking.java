package vjezbe3;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner u = new Scanner(System.in);

        System.out.println("Unesi broj automobila:");
        int N = u.nextInt();
        int brojSati = 0;
        int ukupnaZarada = 0;
        
        for(int i = 1; i <= N; i++) {
        	
        	  System.out.println("Unesi broj sati automobila " + i + ":");
        	  brojSati = u.nextInt();
        	  
        	  if(brojSati <= 5) {
        		  ukupnaZarada = ukupnaZarada + brojSati*2;
        	  }else {
        		  ukupnaZarada = ukupnaZarada + (5*2 + (brojSati-5));
        	  }
        	
        	
        	  System.out.println("Ukupna zarada je:" + ukupnaZarada);
        	
        	
        	
        	
        	
        	
        }
		
		
		
		
		
		
		
	}

}
