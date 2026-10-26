package vjezbe2;

public class Televizor {
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	
	
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaTona = jacinaTona;
	}
	
	
	public int getBrojKanala() {
		return brojKanala;
	}


	public void setBrojKanala(int brojKanala) {
		if(brojKanala > 0  )
		this.brojKanala = brojKanala;
	}
	


	public String getNazivKanala() {
		return nazivKanala;
	}


	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}


	public int getJacinaTona() {
		return jacinaTona;
	}


	public void setJacinaTona(int jacinaTona) {
		if(jacinaTona >= 0 && jacinaTona<= 10)
		this.jacinaTona = jacinaTona;
	}
	
	public void pojacajTon() {
		if(jacinaTona < 10) {
			jacinaTona++;
		}
	}
	
	public void ispisi() {
		
		System.out.println("Broj kanala " + brojKanala );
		System.out.println("Naziv kanala " + nazivKanala);
		System.out.println("Jacina tona " + jacinaTona);
		
	}

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
