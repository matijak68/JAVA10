package vjezbe3;

import java.util.Scanner;

public class CijeliBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner (System.in);
		System.out.println("Unesite cijeli broj:");
		int broj = u.nextInt();

		boolean paran = true;
		boolean pozitivan = true;
		
		if(broj%2 != 0) {
			paran = false;
		}

		if(broj < 0) {
			pozitivan = false;
		}
	
	
		if(paran) {
			if(pozitivan) {
				System.out.println("Broj je paran / pozitivan");
				}else {
					System.out.println("Broj je paran / negativan");
				}
		}else {
			if(pozitivan) {
				System.out.println("Broj je neparan / pozitivan");
			}else {
				System.out.println("Broj je neparan / negativan");
			}
		}
	
	
	
	}

}
