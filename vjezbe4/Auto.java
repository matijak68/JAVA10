package vjezbe4;

import java.util.ArrayList;

public class Auto {

	private String markaAuta;
	private int godisteAuta;
	private double snagaMotora;
	private boolean prodato;
	private double kubikazaMotora;
	private boolean registrovan;
	private static int brojProdatih = 0;
	
	
	
	
	
	
	
	
	
	
	public Auto(String markaAuta, int godisteAuta, double snagaMotora, boolean prodato, double kubikazaMotora,
			boolean registrovan) {
	
		this.markaAuta = markaAuta;
		this.godisteAuta = godisteAuta;
		this.snagaMotora = snagaMotora;
		this.prodato = prodato;
		if(prodato == true) {
			brojProdatih++;
		}
		this.kubikazaMotora = kubikazaMotora;
		
		if(this.godisteAuta < 1985) {
			this.registrovan = false;
		}else {
			this.registrovan = registrovan;
		}
	}




    @Override
	public String toString() {
		return "Auto [markaAuta=" + markaAuta + ", godisteAuta=" + godisteAuta + ", snagaMotora=" + snagaMotora
				+ ", prodato=" + prodato + ", kubikazaMotora=" + kubikazaMotora + ", registrovan=" + registrovan + "]";
	}



    







	public String getMarkaAuta() {
		return markaAuta;
	}











	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}











	public int getGodisteAuta() {
		return godisteAuta;
	}











	public void setGodisteAuta(int godisteAuta) {
		this.godisteAuta = godisteAuta;
	}











	public double getSnagaMotora() {
		return snagaMotora;
	}











	public void setSnagaMotora(double snagaMotora) {
		this.snagaMotora = snagaMotora;
	}











	public boolean isProdato() {
		return prodato;
	}











	public void setProdato(boolean prodato) {
		this.prodato = prodato;
	}











	public double getKubikazaMotora() {
		return kubikazaMotora;
	}











	public void setKubikazaMotora(double kubikazaMotora) {
		this.kubikazaMotora = kubikazaMotora;
	}











	public boolean isRegistrovan() {
		return registrovan;
	}











	public void setRegistrovan(boolean registrovan) {
		if(this.godisteAuta < 1985) {
			this.registrovan = false;
		}else {
			this.registrovan = registrovan;
		}
	}   





	public static void ispisiBrojProdatih() {
		System.out.println("Broj prodatih je " +brojProdatih);
	}

	 public static ArrayList<Auto> autaZaRegistraciju(ArrayList<Auto> lista){
		   
		 ArrayList<Auto> novaLista = new ArrayList<>();
		 
		 for(int i = 0; i<lista.size(); i++) {
			if( lista.get(i).getGodisteAuta()>1985 && lista.get(i).registrovan==false ) {
				novaLista.add(lista.get(i));
			}
			 
		 }
		 
		 return novaLista;
	 }
    public static double iznosRegistracija(ArrayList <Auto> lista) {
    	
    	double ukupno = 0;
    	
    	for(int i = 0; i<lista.size(); i++) {
    		double koeficijent = 0;
			if( lista.get(i).getGodisteAuta()>1985 && lista.get(i).registrovan==false ) {
				if(lista.get(i).godisteAuta < 2001) {
					 koeficijent = 3.0;
				}else if(lista.get(i).getGodisteAuta() > 2010){
					 koeficijent = 1.5;
				}else {
					 koeficijent = 2.0;
				}
				
				double cijena = koeficijent * lista.get(i).kubikazaMotora*lista.get(i).snagaMotora;
				ukupno = ukupno + cijena;
			}
     
    	}
    	return ukupno;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
