import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
	//Primary Key
	private String cod_fiscale;
	
	private String nome;
	private String cognome;
	private Date dataNascita;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	public String getCod_fiscale() {
		return cod_fiscale;
	}

	public void setCod_fiscale(String cod_fiscale) {
		this.cod_fiscale = cod_fiscale;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String toString() {
		return nome+" "+cognome;
	}
}
