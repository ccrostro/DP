package Raqueta;

/**
 * Interfaz que implementará la clase RaquetaGenerica.
 */

public interface Raqueta {
    String getModelo();
    void setModelo(String modelo);
    double getPeso();
    void setPeso(double peso);
    double getLongitud();
    void setLongitud(double longitud);
    double getTam_cabeza();
    void setTam_cabeza(double tam_cabeza);
    Encordado getEncordado();
    void setEncordado(Encordado encordado);
    double getPotencia();
    void setPotencia(double potencia);
    double getControl();
    void setControl(double control);
    double getVelocidad();
    void setVelocidad(double velocidad);

    /**
     * Asigna al atributo potencia el valor que le corresponde de la tabla en función de la longitud ya multiplicado por el factor correspondiente.
     */
    void calcularPotencia();

    /**
     * Asigna al atributo control el valor que le correspone de la tabla en función del tamaño de la cabeza ya multiplicado por el factor correspondiente (Encordado o multiplicador).
     */
    void calcularControl();

    /**
     * Asigna al atributo velocidad el valor que le corresponde de la tabla e nfunción del peso ya multiplicado por el factor correspondiente.
     */
    void calcularVelocidad();

    /**
     * Devuelve una cadena u otra en función del tipo de raqueta que llame al método.
     * @return cadena con la información del tipo de raqueta.
     */
    public String tipoRaqueta();

    /**
     * Devuelve el valor del multiplicador de potencia según el tipo de raqueta que llame al método (puede ser encordado o multiplicador asignado).
     * @return valor del multiplicador.
     */
    public double getMultiplicadorPotencia();

    /**
     * Devuelve el valor del multiplicador de control según el tipo de raqueta que llame al método (encordado o multiplicador asignado).
     * @return valor del multiplicador.
     */
    public double getMultiplicadorControl();

    /**
     * Método toString de las clases que implementan la interfaz.
     * @return cadena con toda la información de la raqueta.
     */
    String toString();

}
