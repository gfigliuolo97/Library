import java.util.Calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Prestito {
	private Persona persona;
	private Libro libro;
	private Persona membroStaff;
	private Calendar inizioPrestito;
	private Calendar finePrestito;
	private boolean prestitoFinito;
	
	Prestito(Biblioteca b, Persona p, Libro l, Persona mS, Calendar inizioP, Calendar fineP){
		this.persona = p;
		this.libro = l;
		this.membroStaff = mS;
		this.inizioPrestito = inizioP;
		this.finePrestito = fineP;
		prestitoFinito = false;
		l.inizioPrestito();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Persona getMembroStaff() {
		return membroStaff;
	}

	public void setMembroStaff(Persona membroStaff) {
		this.membroStaff = membroStaff;
	}

	public Calendar getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(Calendar inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public Calendar getFinePrestito() {
		return finePrestito;
	}

	public void setFinePrestito(Calendar finePrestito) {
		this.finePrestito = finePrestito;
	}

	public boolean isPrestitoFinito() {
		return prestitoFinito;
	}

	public void setPrestitoFinito(boolean prestitoFinito) {
		this.prestitoFinito = prestitoFinito;
	}
	
	public void stampaInfoPrestito() {
		System.out.println("Utente:"+persona.getNome()+" "+persona.getCognome());
		System.out.println("Periodo Prestito:"
				+inizioPrestito.get(Calendar.DAY_OF_MONTH)+"/"+inizioPrestito.get(Calendar.MONTH)+"/"+inizioPrestito.get(Calendar.YEAR)+"-"
				+finePrestito.get(Calendar.DAY_OF_MONTH)+"/"+finePrestito.get(Calendar.MONTH)+"/"+finePrestito.get(Calendar.YEAR));		
	}
	
}
