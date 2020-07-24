package ec.edu.epn.view;

import ec.edu.epn.model.ILibroDAO;
import ec.edu.epn.model.Libro;
import ec.edu.epn.model.LibroImpList;

public class LibroView {
	public static void main(String[] args) {
		ILibroDAO l = new LibroImpList();
		//ILibroDAO db = new PesonImplMySQL();
		
		System.out.println("** CREATE **");
		System.out.println(l.addLibro(new Libro(1, "Alex", "Soria")));
		System.out.println(l.addLibro(new Libro(2, "Manuel", "Parrales")));
		System.out.println(l.addLibro(new Libro(3, "Sandra", "Torres")));
		
		System.out.println("\n** READ ALL **");
		for (Libro libro : l.findAllLibro()) {
			System.out.println(libro);
		}
		
		System.out.println("\n** READ PERSON BY ID 3 **");
		System.out.println(l.findLibroByCodigo(3));
		
		System.out.println("\n** UPDATE PERSON BY ID 3 **");
		System.out.println(l.updateLibro(new Libro(3, "Maria", "Hallo"), 3));
		System.out.println("=> READ PERSON BY ID 3");
		System.out.println(l.findLibroByCodigo(3));

		System.out.println("\n** DELETE **");
		System.out.println("=> READ ALL");
		for (Libro libro : l.findAllLibro()) {
			System.out.println(libro);
		}
		System.out.println("=> DELETE PERSON BY ID 1");
		System.out.println(l.deleteLibro(3));
		System.out.println("=> PRINT ALL");
		for (Libro libro : l.findAllLibro()) {
			System.out.println(libro);
		}
		
	}

}
