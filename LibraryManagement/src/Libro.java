import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Libro {
	private Integer isbn;
	private String titolo;
	private ArrayList<Persona> autori;
	private GregorianCalendar edizione;
	private boolean possibilePrestarlo = true;
	
	Libro(){
		autori = new ArrayList<>();
	}
	Libro(Integer isbn, String titolo, ArrayList<Persona> autori, GregorianCalendar edizione){
		this.isbn = isbn;
		this.titolo = titolo;
		this.autori = autori;
		this.edizione = edizione;
	}
	
	public ArrayList<Persona> getAutori() {
		return autori;
	}
	public void inserisciAutore(Persona autore) {
		autori.add(autore);
	}
	public Integer getISBN() {
		return isbn;
	}
	public void setISBN(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public GregorianCalendar getEdizione() {
		return edizione;
	}
	public void setEdizione(GregorianCalendar edizione) {
		this.edizione = edizione;
	}
	public void inizioPrestito() {
		possibilePrestarlo = false;
	}
	public void finePrestito() {
		possibilePrestarlo = true;
	}
	public String toString() {
		return "|"+titolo+"|"+autori;
	}
}
