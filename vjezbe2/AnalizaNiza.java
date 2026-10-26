package vjezbe2;

import java.util.Scanner;

public class AnalizaNiza {

	 public double nadjiParniPozitivniProsjek(int niz[]) {
		 int suma = 0;
		 int broj = 0;
		 
		 for(int i = 0; i<niz.length; i++) {
			 if(niz[i]%2==0 && niz[i]>0) {
				 suma = suma + niz[i];
				 broj++;
			 }
		 }
		 if(broj==0) {
			 return 0;
		 }
		 double prosjek = (double) suma / broj;
		 return prosjek;
	 }
	 
	    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		
		
	}

}
