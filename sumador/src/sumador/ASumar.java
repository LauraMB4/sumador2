package sumador;

public class ASumar {

	/**
	 * Mostrar la cifra dada y la suma de sus cifras.
	 *
	 * @param string cifra tipo cadena
	 * @return la cifra = a la suma
	 */
	public String mostrar(String string) {
		// TODO Auto-generated method stub

		if (string.charAt(0)=='-')
			return ("");
		
		return (string + " = " + string);
	}
	
}
