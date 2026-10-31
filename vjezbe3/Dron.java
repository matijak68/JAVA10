package vjezbe3;

import java.util.Scanner;

public class Dron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner u = new Scanner(System.in);
		System.out.println("Unesi X koordinatu drona:");
		int x = u.nextInt();
		System.out.println("Unesi Y koordinatu drona:"); 
		int y = u.nextInt();
		
		System.out.println("Unesi broj paketa:");
		int N = u.nextInt();
		
		double ukupnaUdaljenost = 0;
		
		for(int i = 1; i<=N; i++) {
			System.out.println("Unesi X koordinatu paketa " + i);
			int x1 = u.nextInt();
			System.out.println("Unesi Y koordinatu paketa " + i); 
			int y1 = u.nextInt();
		
			if(x1>0 && y1>0) {
				
			ukupnaUdaljenost = ukupnaUdaljenost + Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
			double udaljenost = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));	
			System.out.println("Udaljenost do paketa " + i + " je: " + udaljenost);	
			
			}
			
			
			
		}
		
		System.out.println("Ukupna udaljenost je: " + ukupnaUdaljenost);
		
		
	}

}
