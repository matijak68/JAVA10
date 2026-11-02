package vjezbe5;

import java.util.Scanner;

public class BrojSuglasnikaSamoglasnika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner u = new Scanner(System.in);

	        System.out.println("Unesi rijec:");
	        String rijec = u.nextLine().toLowerCase();

	        int samoglasnici = 0;
	        int suglasnici = 0;

	        for (int i = 0; i < rijec.length(); i++) {

	            char slovo = rijec.charAt(i);

	            if (slovo == 'a' || slovo == 'e' ||
	                slovo == 'i' || slovo == 'o' ||
	                slovo == 'u') {

	                samoglasnici++;

	           } else {
               //ako bi mogla da se unese recenica onda bi
	          //  }else if (Character.isLetter(slovo)) {
	                suglasnici++;
	            }
	        }

	        System.out.println("Broj samoglasnika: " + samoglasnici);
	        System.out.println("Broj suglasnika: " + suglasnici);
	}

}
