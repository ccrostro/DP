package Zapatilla;

public interface ZapatillaIntf {

    /**
     * Devuelve el valor de las zapatillas en función de su tipo.
     * @return double con el valor.
     */
    public double getValor();

    /**
     * Devuelve el valor del saque de las zapatillas ya multiplicadas por su factor correspondiente.
     * @return double con la multiplicación entre el valor y el multiplicador.
     */
    public abstract double calcularValorSaque();

    /**
     * Devuelve el valor del resto de las zapatillas ya multiplicadas por su factor correspondiente.
     * @return double con la multiplicación entre el valor y el multiplicador.
     */
    public abstract double calcularValorResto();
}
