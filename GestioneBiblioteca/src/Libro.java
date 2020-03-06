
public class Libro {

	private int codice;
	private String titolo;
	private String autore;
	private int numeroCopie;
	private double prezzo;
	
	
	public Libro(int codice,String titolo, String autore, int numeroCopie, double prezzo) {
		this.codice=codice;
		this.titolo = titolo;
		this.autore = autore;
		this.numeroCopie = numeroCopie;
		this.prezzo = prezzo;
		
	}


	public int getCodice() {
		return codice;
	}


	public void setCodice(int codice) {
		this.codice = codice;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public int getNumeroCopie() {
		return numeroCopie;
	}


	public void setNumeroCopie(int numeroCopie) {
		this.numeroCopie = numeroCopie;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Libro [codice=" + codice + ", titolo=" + titolo + ", autore=" + autore + ", numeroCopie=" + numeroCopie
				+ ", prezzo=" + prezzo + "]";
	}
	
	public int controllaQuantita(Libro oggetto) {
		if(this.getNumeroCopie() < oggetto.getNumeroCopie()) return -1;
		if(this.getNumeroCopie() > oggetto.getNumeroCopie()) return 1;
		return 0;
	}
	
	
}
