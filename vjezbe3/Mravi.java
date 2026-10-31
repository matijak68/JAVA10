package vjezbe3;

import java.util.Scanner;

public class Mravi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner u = new Scanner(System.in);
		
		    System.out.println("Unesi X donje lijeve tacke:");
	        int x1 = u.nextInt();
	        System.out.println("Unesi Y donje lijeve tacke:");
	        int y1 = u.nextInt();
	        System.out.println("Unesi X gornje desne tacke:");
	        int x2 = u.nextInt();
	        System.out.println("Unesi Y gornje desne tacke:");
	        int y2 = u.nextInt();

	        System.out.println("Unesi broj mrava:");
	        int N = u.nextInt();
	        
	        int brojMravaNaIvici = 0;
	        
	        for(int i = 0; i<N; i++) {
	        	
	        	 System.out.println("Unesi X koordinatu mrava:");
	 	         int xm = u.nextInt();
	 	         System.out.println("Unesi Y koordinatu mrava:");
	 	         int ym = u.nextInt();
	 	         
	 	         if(xm==x1 && ym>=y1 && ym<=y2 ||
	 	        		 xm==x2 && ym>=y1 && ym<=y2 ||
	 	        		 	ym==y1 && xm>=x1 && xm<=x2 ||
	 	        		 		ym==y2 && xm>=x1 && xm<=x2) {
	 	        	 
	 	        	 brojMravaNaIvici++;
	 	        	 
	 	        	 
	 	         }
	 	        		 
	 	        		 
	 	        		 
	 	        		 
	 	         
	        
	        }
		
		
		
	        System.out.println("Broj mrava na ivicama stola: " + brojMravaNaIvici);
		
		
		
		
		
		
		
		
		
		
		
	}

}
