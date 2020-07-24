package ec.edu.epn.model;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LibroImpListTest {
	private static ILibroDAO libro;
	@BeforeClass
	public static void breforeLibroClass() {
		libro = new LibroImpList();
	}

	@Test
	public void testAddLibro() {
		assertTrue(libro.addLibro(new Libro(1, "Jesé","Reyes")));
	}
	@Test
	public void testReadAllLibro() {
		libro.addLibro(new Libro(1, "Jesé","Reyes"));
		libro.addLibro(new Libro(2, "Ana","Leon"));
		assertEquals(3, libro.findAllLibro().size());
		
	}
	
	@AfterClass
	public static void afterLibroClass() {
		libro = null;
	}
	

}
