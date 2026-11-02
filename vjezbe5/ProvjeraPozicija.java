package vjezbe5;

import java.util.Scanner;

public class ProvjeraPozicija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine();
		
				
		System.out.println("Unesi poziciju (od 0 do " + (tekst.length()-1) + " )");
		int pozicija = u.nextInt();
		
		if(pozicija > (tekst.length()-1)) {
			System.out.println("Unos je pogresan");
		}

		
		if(pozicija==0) {
			if( tekst.charAt(pozicija + 1) == '0') {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else if(pozicija == tekst.length()-1){
			if( tekst.charAt(tekst.length()-2) == '0') {
				System.out.println("1");
			}else {
				System.out.println("0");
		 }
		}else if(pozicija > 0 && pozicija < tekst.length()-1 ) {
			if(tekst.charAt(pozicija-1) == '0' && tekst.charAt(pozicija+1) == '0' ) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	
			
			
		
		

		
		
	}

}
