import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblioteca {
	private static List<Libro> elencoLibro;
	private static Scanner input;
	private static GestioneLibreria gest;

	public static void main(String[] args) {
		elencoLibro = new ArrayList<>();
		input = new Scanner(System.in);
		gest=new GestioneLibreria();
		
		while (true) {
			System.out.println("Cosa vuoi fare");
			menu();
			int scelta = input.nextInt();
			input.nextLine();
			switch (scelta) {
			case 1: {
				System.out.println("Inserisci codice"); int codice=input.nextInt();
				creaBiblioteca();
			}
				break;
			case 2: {
				 System.out.println("Inserisci codice");
				 int codice=input.nextInt();
				 input.nextLine(); 
				 System.out.println("Inserisci il titolo"); 
				 String titolo =input.nextLine();
				 System.out.println("Inserisci autore");
				 String autore =input.nextLine(); 
				 System.out.println("Inserisci numero copie"); 
				 int numeroCopie = input.nextInt();
				 input.nextLine();
				 System.out.println("inserisci prezzo"); 
				 double prezzo=input.nextDouble();
				 input.nextLine();		 
				 Libro lib=new Libro(codice,titolo,autore,numeroCopie,prezzo);
				 gest.aggiungiLibro(lib);
				
				 
			}
				break;
			case 3:{
				
				break;
			}
			case 4:{
				stampaLibri();
				break;
			}
			default: {
				System.exit(0);
			}
			}
		}

		
	
	}



	public static void stampaLibri() {
		for (Libro libro : elencoLibro) {
			System.out.println(libro);
		}
	}

	/*
	 * private static void aggiungiLibri( ) {
	 * 
	 * System.out.println("Inserisci codice"); int codice=input.nextInt();
	 * input.nextLine(); System.out.println("Inserisci il titolo"); String titolo =
	 * input.nextLine(); System.out.println("Inserisci autore"); String autore =
	 * input.nextLine(); System.out.println("Inserisci numero copie"); int
	 * numeroCopie = input.nextInt(); input.nextLine();
	 * System.out.println("inserisci prezzo"); double prezzo=input.nextDouble();
	 * input.nextLine();
	 * 
	 * 
	 * elencoLibro.add(new Libro(codice,titolo, autore, numeroCopie, prezzo));
	 * //System.out.println("*** "+elencoLibro.toString());
	 * 
	 * }
	 */

	public static void creaBiblioteca() {
		Libro l1 = new Libro(1, "L'amica geniale", "Elena Ferrante", 10, 15.5);
		Libro l2 = new Libro(2, "Le tre del mattino", "Giancarlo Carofiglio", 5, 18.0);
		Libro l3 = new Libro(3, "La concessione del telefono", "Andrea Camilleri", 15, 10.0);
		Libro l4 = new Libro(4, "Gente in Aspromonte", "Corrado Alvaro", 15, 10.0);
		elencoLibro.add(l1);
		elencoLibro.add(l2);
		elencoLibro.add(l3);
		elencoLibro.add(l4);
	}

	public static void menu() {
		System.out.println("1. Popola Biblioteca");
		System.out.println("2. Inserisci nuovo libro");
		System.out.println("3. Rimuovi libro");
		System.out.println("4. Stampa lista libri");
	}
}
