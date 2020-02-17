import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		Libro libro3 = new Libro();
		
		Persona autore1 = new Persona("Giovanni","Figliuolo");		
		Persona autore2 = new Persona("Katia","Avanzi");
		Persona autore3 = new Persona("Fabrizio","Frasca");
		Persona autore4 = new Persona("Fabrizio","DeSabtis");
		
		Persona cliente1 = new Persona("Emanuele","Figliuolo");
		Biblioteca b = new Biblioteca();

		
		libro1.setISBN(100);
		libro1.setTitolo("Bibbia");
		libro1.inserisciAutore(autore1);
		libro1.inserisciAutore(autore2);		
		libro1.setEdizione(new GregorianCalendar(1999,12,12));
		
		libro2.setISBN(111);
		libro2.setTitolo("Vangelo");
		libro2.inserisciAutore(autore3);
		libro2.setEdizione(new GregorianCalendar(1900,12,12));
		
		libro3.setISBN(1110);
		libro3.setTitolo("Bibbiano, la strana vicenda");
		libro3.inserisciAutore(autore4);
		
		b.aggiungiLibro(libro1);
		b.aggiungiLibro(libro2);
		b.aggiungiLibro(libro3);
		Staff cassiera = new Staff("Marisa","Passera");
		Prestito prestito1 = new Prestito(b, cliente1, libro3, cassiera, new GregorianCalendar(2020,02,06), new GregorianCalendar(2020,02,16));
		
		
		
		System.out.println(b.ricercaLibroDaTesto("Bib"));
	}

}
