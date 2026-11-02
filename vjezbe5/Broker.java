package vjezbe5;

import java.util.Scanner;

public class Broker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner u = new Scanner (System.in);
		System.out.println("Unesi tekst: ");
		String tekst = u.nextLine();
		
		String[] tekst1 = tekst.split(" ");
		
		int suma = 0;
		
		for(int i = 0; i<tekst1.length; i++) {
			
			String rijec = tekst1[i];
			
			int broj = Integer.parseInt(rijec.substring(1));
			
			if(rijec.charAt(0) == 'S') {
				suma = suma + broj;
			}else {
				suma = suma - broj;
			}
			
		}
		
		
		
		System.out.println("Suma dobitaka i gubitaka je: "+suma);
		
		
		
	}

}
