package vjezbe4;

import java.util.ArrayList;

public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Auto> lista = new ArrayList<>();
		
		Auto a1 = new Auto("Audi", 1976, 200, false, 2.0, true );
		Auto a2 = new Auto("Audi", 2020, 200, true, 3.0, false);
	    Auto a3 = new Auto("Golf", 1980, 75, false, 1.6, false);
	    Auto a4 = new Auto("Mercedes", 2015, 180, true, 2.2, true);
	    Auto a5 = new Auto("Opel", 1999, 90, false, 1.8, false);
		
	 
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		
		System.out.println("Svi automobili: ");
		for (int i = 0; i < lista.size(); i++) {
		    System.out.println(lista.get(i));
		}
		
		
		Auto.ispisiBrojProdatih();
		
		ArrayList<Auto> rezultat = Auto.autaZaRegistraciju(lista);

		System.out.println("Automobili za registraciju:");

		for (int i = 0; i < rezultat.size(); i++) {
		    System.out.println(rezultat.get(i));
		}
		System.out.println("Ukupna registracija: "
		        + Auto.iznosRegistracija(lista));
	}

}
