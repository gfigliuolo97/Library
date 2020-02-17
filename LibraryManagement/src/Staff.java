import java.util.GregorianCalendar;

public class Staff extends Persona{
	Staff(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	private GregorianCalendar inizioContratto;

	public GregorianCalendar getInizioContratto() {
		return inizioContratto;
	}

	public void setInizioContratto(GregorianCalendar inizioContratto) {
		this.inizioContratto = inizioContratto;
	}
	
	
}
