import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		Libro libro3 = new Libro();
		
		Persona autore1 = new Persona("Giovanni","Figliuolo");		
		Persona autore2 = new Persona("Katia","Avanzi");
		Persona autore3 = new Persona("Fabrizio","Frasca");
		Persona autore4 = new Persona("Fabrizio","DeSabtis");
		
		Persona cliente1 = new Persona("Emanuele","Figliuolo");
		Biblioteca b = new Biblioteca();

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"),Locale.ITALY);
		Date today = calendar.getTime();
		 
		System.out.println(calendar.get(Calendar.DATE));
		
		
		libro1.setISBN(100);
		libro1.setTitolo("Bibbia");
		libro1.inserisciAutore(autore1);
		libro1.inserisciAutore(autore2);		
		//libro1.setEdizione(c.getTime(c.setTime(new Date(99,6,6))));
		
		libro2.setISBN(111);
		libro2.setTitolo("Vangelo");
		libro2.inserisciAutore(autore3);
		//libro2.setEdizione(new Date(1900,12,12));
		
		libro3.setISBN(1110);
		libro3.setTitolo("Bibbiano, la strana vicenda");
		libro3.inserisciAutore(autore4);
		
		b.aggiungiLibro(libro1);
		b.aggiungiLibro(libro2);
		b.aggiungiLibro(libro3);
		Staff cassiera = new Staff("Marisa","Passera");
		Calendar datainizio = datainizio.set(2025, 10, 21);
		Prestito prestito1 = new Prestito(b, cliente1, libro3, cassiera, new Date(99,11,06), new Date(9,2,16));
		
		prestito1.stampaInfoPrestito();
		
		//System.out.println(b.ricercaLibroDaTesto("Bib"));
		b.stampaListaLibriPresentiInBiblioteca();
	}

}
