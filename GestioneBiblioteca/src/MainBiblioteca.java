import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblioteca {
	private static List<Libro> elencoLibro;
	private static Scanner input;

	public static void main(String[] args) {
		elencoLibro = new ArrayList<>();
		input=new Scanner(System.in);
		
		for (int i=0; i<3;i++) {
		aggiungiLibri();	
		}
		System.out.println("poi "+elencoLibro.toString());
		stampaLibri();
		
	}
	
	
	public static void stampaLibri() {
		//for(Libro libro:elencoLibro) {
		System.out.println(elencoLibro.toString());
		//}
	}
	
	
	public static void rimuoviLibro() {
		elencoLibro.remove(elencoLibro);
	}
	
	private static void aggiungiLibri() {

		System.out.println("Inserisci codice");
		int codice=input.nextInt();
		input.nextLine();
		System.out.println("Inserisci il titolo");
		String titolo = input.nextLine();
		System.out.println("Inserisci autore");
		String autore = input.nextLine();
		System.out.println("Inserisci numero copie");
		int numeroCopie = input.nextInt();
		input.nextLine();
		System.out.println("inserisci prezzo");
		double prezzo=input.nextDouble();
		input.nextLine();
		
		//ArrayList<Libro> elencoLibro=new ArrayList<Libro>();
		elencoLibro.add(new Libro(codice,titolo, autore, numeroCopie, prezzo));
		System.out.println("*** "+elencoLibro.toString());
		
	}

}
