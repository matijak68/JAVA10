package vjezbe3;

import java.util.Scanner;

public class ProzorZavjesa {

    public static void main(String[] args) {

        Scanner u = new Scanner(System.in);

        System.out.println("Unesi koordinate zavjese:");

        int x1 = u.nextInt();
        int y1 = u.nextInt();
        int x2 = u.nextInt();
        int y2 = u.nextInt();

        System.out.println("Unesi koordinate prozora:");

        int x3 = u.nextInt();
        int y3 = u.nextInt();
        int x4 = u.nextInt();
        int y4 = u.nextInt();
        
        int sirinaZavjese = Math.abs(x2 - x1);
        int visinaZavjese = Math.abs(y2 - y1);
        
        
        int sirinaProzora = Math.abs(x4 - x3);
        int visinaProzora = Math.abs(y4 - y3);
        
        if(sirinaZavjese>=sirinaProzora && visinaZavjese>=visinaProzora) {
        	System.out.println("Zavjesa odgovara prozoru");
        }else {
        	System.out.println("Zavjesa ne odgovara prozoru");
        }
        

       
    }
}