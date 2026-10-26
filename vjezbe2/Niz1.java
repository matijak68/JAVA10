package vjezbe2;

import java.util.Random;
import java.util.Scanner;

public class Niz1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Unesite duzinu niza");
		int n = u.nextInt();
		
		double niz[] = new double[n];
		
		for(int i=0; i<n;i++) {
			niz[i] = r.nextInt(10)+1;
		}
		
		System.out.println("Prije promjene");
		for(int i=0; i<n; i++ ) {
			System.out.println(niz[i]);
			
		}	
			
		for(int i=0; i<n;i++) {
		 if(niz[i]%2==0) {
			 niz[i] = -1*niz[i];
		 }else {
			 niz[i] = 1/niz[i];
		 }
		}
		System.out.println("Nakon promjene");
		for(int i=0; i<n; i++ ) {
			System.out.println(niz[i]);
		}
	}
}
