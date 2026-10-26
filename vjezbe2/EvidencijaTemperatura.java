package vjezbe2;


public class EvidencijaTemperatura {
	
	
	private double temperature[];
	
	
	
	
	public EvidencijaTemperatura(double[] temperature) {
	
		this.temperature = temperature;
	}

	


	public double[] getTemperature() {
		return temperature;
	}




	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
	}



	public void ispisi(double niz []) {
		System.out.println("Duzina niza je " +niz.length);
		System.out.println("Temperature su: ");
		for(int i=0; i<niz.length; i++) {
			System.out.println(niz[i]);
			
	}
		
	
		}
	
	public void provjera(double niz[], double temperatura) {
	
		boolean provjera = false;
		int broj = 0;
		
		for(int i = 0; i<niz.length; i++){
			if(temperatura == niz[i]) {
				provjera = true;
				broj++;
			}
		}
		
		if(provjera) {
			System.out.println("Temperatura se nalazi u nizu.");
		}else {
			System.out.println("Temperatura se ne nalazi u nizu.");
		}
		double[] noviNiz = new double[niz.length-broj];
		int j = 0;
		
		if(broj !=0) {
			for(int i =0; i<niz.length; i++) {
				if(niz[i] != temperatura) {
					noviNiz[j] = niz[i];
					j++;
						
		    }
	    }
	  }
		if(broj!=0) {
		System.out.println("Azurirani niz: ");
		for(int i = 0; i<noviNiz.length;i++) {
			System.out.print(noviNiz[i] + " ");
		}
		}
	}
	
	
	public double prosjecnaTemperatura(double[] niz) {
		
		double suma = 0;
		for(int i = 0; i<niz.length; i++) {
			
			suma = suma + niz[i];
			
		}
		
		double prosjek = suma / niz.length;
		return prosjek;
		
	}
	
	public double maksimalnaTemperatura(double [] niz) {
		
		double max = niz[0];
		
		for(int i = 1; i<niz.length; i++) {
			if(max<niz[i]) {
				max = niz[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	}

}
