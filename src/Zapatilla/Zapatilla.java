package Zapatilla;

/**
 * Clase encargada de almacenar los datos de las zapatillas.
 */

public class Zapatilla implements ZapatillaIntf{

    protected String modelo;
    protected double numero;
    protected double valor;

    /**
     * Constructor por defecto.
     */
    public Zapatilla(){
        this.modelo = " ";
        this.numero = 0;
        this.valor = 0.0;
    }

    /**
     * Constructor parametrizado.
     * @param modelo nombre del modelo
     * @param numero talla de la zapatilla
     * @param valor potenciador
     */
    public Zapatilla(String modelo, double numero, double valor){
        this.modelo = modelo;
        this.numero = numero;
        this.valor = valor;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getNumero() { return numero; }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularValorSaque() {
        return this.getValor()*1.2;
    }

    public double calcularValorResto() {
        return this.getValor()*1.3;
    }

    /**
     * Método toString de la clase Zapatilla.
     * @return cadena con toda la información de las zapatillas.
     */
    public String toString(){
        return "[modelo="+this.modelo+", número="+this.numero+", valor="+this.valor+"]\n";
    }
}
