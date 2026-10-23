package vjezbe1;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Unose se 3 cijela broja a b i c i program odredjuje koji je najmanji a koji najveci
		
		int a, b, c, najmanji, najveci;
		Scanner u = new Scanner(System.in);
		
		System.out.println("Unesi a: ");
		a = u.nextInt();
		System.out.println("Unesi b: ");
		b = u.nextInt();
		System.out.println("Unesi c: ");
		c = u.nextInt();
		
		najmanji = a;
		najveci = a;
		if(najmanji>b) {
			najmanji=b;
			
		}
		if(najmanji>c) {
			najmanji=c;
			
		}
		if(najveci<b) {
			najveci=b;
			
		}
		if(najveci<c) {
			najveci=c;
			
		}
		
		System.out.printf("Najmanji broj je %d, a najveci je %d", najmanji , najveci);
	
	
	
	
	
	
	
	
	
	
	}
		
	
}
