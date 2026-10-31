package vjezbe3;

public class Blago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 9;
		int y1 = 2;
		
		int x2 = 7;
		int y2 = 8;
		
		int x3 = x2 + 2;
		int y3 = y2 - 3;
		
		System.out.println("Blago se nalazi na koordinatama : (" + x3 + "," + y3 + ")" );
		
		double rastojanje = Math.sqrt((Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2)));
		
		
		
		System.out.println("Rastojanje je:" + rastojanje);
		
		
		double rastojanjePrekoKuce = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))) + 
														 Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2))); 
		
		System.out.println("Rastojanje ako idemo oko kuce je:" + rastojanjePrekoKuce);
		
	}
	
}
