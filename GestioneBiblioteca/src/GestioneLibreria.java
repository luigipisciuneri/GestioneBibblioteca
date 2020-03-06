import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioneLibreria {
	
	private List<Libro> listaLibro;
	
	public GestioneLibreria() {
		this.listaLibro=new ArrayList<>();
		
	}
	
	public  boolean aggiungiLibro(Libro l ) {
		listaLibro.add(l);
		return true;
	}
	
	public boolean rimuoviLibro(Libro libro) {
		for(Libro l: listaLibro) {
			if (l.getCodice()==libro.getCodice()) {
				listaLibro.remove(libro);
				return true;
			}
		}
		System.out.println("Il libro da rimuovere non sitrova in libreria");
		return false;
		
	}

}
