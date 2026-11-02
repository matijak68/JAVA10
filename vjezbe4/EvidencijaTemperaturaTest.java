package vjezbe4;

import java.util.Scanner;

public class EvidencijaTemperaturaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner u = new Scanner (System.in);
		
		double [] temperature = new double [5]; 
		
		for(int i = 0; i<temperature.length; i++) {
			
			System.out.println("Unesi temperaturu " + (i+1) + ": ");
			temperature [i] = u.nextDouble();
		}
		
		EvidencijaTemperatura e = new EvidencijaTemperatura(temperature);
		
		e.ispisi(temperature);
		e.provjera(temperature);
		System.out.println("Prosjecna temperatura je: " + e.prosjecnaTemperature(temperature));
		System.out.println("Maksimalna temperatura je: " +e.maksimalnaTemperatura(temperature));
		
	}

}
