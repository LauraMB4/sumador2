package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestASumar.
 */
class TestASumar {

	/**
	 * Test una cifra.
	 */
	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado);
    }

	/**
	 * Test negativo.
	 */
	@Test
    public void testNegativo() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("-5");
        assertEquals("",resultado );
    }
}
