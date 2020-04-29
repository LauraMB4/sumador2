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

		if (string.length()==1)
			return (string + " = " + string);
		
		if (string.charAt(0)=='-')
			return ("");
		
		String cad = null;
		cad = string.replaceAll("(?!^|$)", " + ");
			return (cad + " = " + total(string));
	}
	
	/**
	 * Total, nos devuelve la suma de las cifras.
	 *
	 * @param valor_inicial cifra tipo cadena a sumar
	 * @return suma, valor de la suma de las cifras
	 */
	public int total(String valor_inicial) {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);
        }
        return suma;
	}
}
