import java.util.Date;

public class Staff extends Persona{
	Staff(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	private Date inizioContratto;

	public Date getInizioContratto() {
		return inizioContratto;
	}

	public void setInizioContratto(Date inizioContratto) {
		this.inizioContratto = inizioContratto;
	}
	
	
}
