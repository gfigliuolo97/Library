import java.util.GregorianCalendar;

public class Prestito {
	private Persona persona;
	private Libro libro;
	private Persona membroStaff;
	private GregorianCalendar inizioPrestito;
	private GregorianCalendar finePrestito;
	private boolean prestitoFinito;
	
	Prestito(Biblioteca b, Persona p, Libro l, Persona mS, GregorianCalendar inizioP, GregorianCalendar fineP){
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

	public GregorianCalendar getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(GregorianCalendar inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public GregorianCalendar getFinePrestito() {
		return finePrestito;
	}

	public void setFinePrestito(GregorianCalendar finePrestito) {
		this.finePrestito = finePrestito;
	}

	public boolean isPrestitoFinito() {
		return prestitoFinito;
	}

	public void setPrestitoFinito(boolean prestitoFinito) {
		this.prestitoFinito = prestitoFinito;
	}
	
	
}
