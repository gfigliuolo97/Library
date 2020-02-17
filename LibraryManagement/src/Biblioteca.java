import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
	//Insieme dei libri presenti nella biblioteca
	private ArrayList<Libro> libriInBiblioteca;
	//Persone che hanno a che fare con la biblioteca, che siano clienti, proprietari o dipendenti
	private HashMap<String,Persona> persone;
	
	Biblioteca(){
		libriInBiblioteca = new ArrayList<>();
		persone = new HashMap<>();
	}
	
	public void aggiungiLibro(Libro l) {
		libriInBiblioteca.add(l);
	};
	
	public ArrayList<Libro> ricercaLibroDaTesto(String titolo_ricerca) {
		ArrayList<Libro> libriTrovati = new ArrayList<>();
		for(int i = 0; i<libriInBiblioteca.size(); i++) {
			if(libriInBiblioteca.get(i).getTitolo().contains(titolo_ricerca)) {
				libriTrovati.add(libriInBiblioteca.get(i));
			}
		}
		return libriTrovati;
	}
	public void aggiungiDipendente(Persona p) {
		persone.put(p.getCod_fiscale(),p);
	}
	public void stampaListaLibriPresentiInBiblioteca() {
		System.out.println(libriInBiblioteca);
	}
	
}
