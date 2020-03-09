
public class ASumar {
	private String valor_inicial;
	
	/**
	 * Constructor de la clase pasandole solo un digito por par�metro.
	 * @param string n�mero de un d�gito
	 */
    public ASumar(String string) {
        this.valor_inicial = string;
    }
    
    /**
     * Muestra el resultado de la operaci�n, dependiendo de si es un n�mero solo, dos o el n�mero es negativo.
     * @return
     */
    public String mostrar() {
        String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        else if (numero.substring(0, 1).equals("-")) {
        	return "";
        }
        return null;
    }
}
