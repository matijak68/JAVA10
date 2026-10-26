package vjezbe2;

import java.util.Scanner;

public class EvidencijaTemperaturaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner u = new Scanner(System.in);
				
		double[] niz = new double[5];
		
		System.out.println("Unesi elemente niza:");
		for(int i = 0; i<niz.length; i++) {
			niz[i] = u.nextInt();
		}
		
		
		 EvidencijaTemperatura t = new EvidencijaTemperatura(niz);
		
		 t.ispisi(niz);
		
		 System.out.println("Unesi temperaturu za provjeru");
			double temperatura = u.nextDouble();
			
		t.provjera(niz, temperatura);
		
		double prosjek = t.prosjecnaTemperatura(niz);
		System.out.println("Prosjecna temperatura je: " + prosjek);
		
		double max = t.maksimalnaTemperatura(niz);
		System.out.println("Maksimalna temperatura je: " + max);
		
	}

}
