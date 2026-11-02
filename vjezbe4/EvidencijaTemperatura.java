package vjezbe4;

import java.util.Scanner;

public class EvidencijaTemperatura {

	
	private double [] temperature;
	
	
	public EvidencijaTemperatura(double[] temperature) {
		this.temperature = temperature;
	}

	
	public double[] getTemperature() {
		return temperature;
	}


	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
	}

	public static void ispisi( double []temperature) {
		
		System.out.println("Duzina niza je "+ temperature.length);
		System.out.println("Temperature su: ");
		for(int i=0; i<temperature.length; i++) {
			System.out.println(temperature[i]+ " ");
			
		}
		
	}
	
	public static void provjera( double []temperature) {
		Scanner u = new Scanner(System.in);
		System.out.println("Unesi tamperaturu za provjeru: ");
		double provjera = u.nextDouble();
		boolean provjera1 = false;
		int brojac = 0;
		for(int i =0; i<temperature.length; i++) {
			
			if(temperature[i] == provjera) {
				provjera1=true;
				brojac++;
				
			}
		}
			
			if(provjera1) {
				
				System.out.println("Temperatura se nalazi u nizu.");
				System.out.println("Novi niz je: ");
				
				double [] noviNiz = new double[temperature.length-brojac];
				int j = 0;
				
				for(int i = 0; i<temperature.length; i++) {
					
					if(temperature[i]!=provjera) {
						noviNiz[j] = temperature[i];
						j++;
					}
					
						
			}
				
				for(int i = 0; i<noviNiz.length; i++)
					
					System.out.println(noviNiz[i] + " " );
				
				
			}else {
				System.out.println("Temperatura se ne nalazi u nizu.");
			}
			
		
			
		
				
		}
		
	public static double prosjecnaTemperature(double[] temperature) {
		double prosjek = 0;
		double suma = 0;
		for(int i = 0; i<temperature.length; i++) {
			suma = suma + temperature[i];
	
		}
		prosjek = suma / temperature.length;
		return prosjek;
		
	}
	
	public static double maksimalnaTemperatura (double[] temperature) {
		
		double max = temperature[0];
		
		for(int i = 1; i<temperature.length; i++) {
			if(temperature[i] > max) {
				max = temperature[i];
			}
		}
	return max;	
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
	}

}
