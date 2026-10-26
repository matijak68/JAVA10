package vjezbe2;


public class Zaposleni {

	private String ime;
	private String prezime;
	private int godineStaza;
	private float plata;

	
	
	public Zaposleni(String ime, String prezime, int godineStaza, float plata) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza;
		this.plata = plata;
	}

	





	public String getIme() {
		return ime;
	}







	public void setIme(String ime) {
		this.ime = ime;
	}







	public String getPrezime() {
		return prezime;
	}







	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}







	public int getGodineStaza() {
		return godineStaza;
	}







	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}







	public float getPlata() {
		return plata;
	}







	public void setPlata(float plata) {
		this.plata = plata;
	}


	public void ispisi() {
		System.out.println("Ime zaposlenog je: " + ime);
		System.out.println("Prezime zaposlenog je: " + prezime);
		System.out.println("Godine staza zaposlenog: " + godineStaza);
		System.out.println("Plata zaposlenog je: " + plata);
	}

	public double provjeraPlate() {
		if(plata<800 && godineStaza>10) {
			plata = (float)(plata * 1.06);
		}
		return plata;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zaposleni z1 = new Zaposleni("Jovan", "Perovic" ,12, 700);
		Zaposleni z2 = new Zaposleni("Milica", "Bjelisic" ,12, 700);
		Zaposleni z3 = new Zaposleni("Nela", "Markovic" ,12, 700);
		
		z1.provjeraPlate();
		z2.provjeraPlate();
		z3.provjeraPlate();
		
		
		z1.ispisi();
		z2.ispisi();
		z3.ispisi();
		
		
	}

}
