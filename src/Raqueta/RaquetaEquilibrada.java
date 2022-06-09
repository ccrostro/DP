package Raqueta;

public class RaquetaEquilibrada extends RaquetaGenerica{

    private double multiplicadorPotencia;
    private double multiplicadorControl;

    /**
     * Constructor parametrizado
     * @param modelo nombre del modelo
     * @param peso peso de la raqueta
     * @param longitud longitud de la raqueta
     * @param tam_cabeza tamaño de la cabeza
     * @param encordado información sobre el encordado
     * @param multiplicadorPotencia factor de multiplicación de la potencia
     * @param multiplicadorControl factor de multiplicación del control
     */
    public RaquetaEquilibrada(String modelo, double peso, double longitud, double tam_cabeza, Encordado encordado, double multiplicadorPotencia, double multiplicadorControl){
        super(modelo, peso, longitud, tam_cabeza,encordado);
        this.multiplicadorControl = multiplicadorControl;
        this.multiplicadorPotencia = multiplicadorPotencia;
        this.calcularPotencia();
        this.calcularControl();

    }



    @Override
    public double getMultiplicadorPotencia() {
        return multiplicadorPotencia;
    }

    public void setMultiplicadorPotencia(double multiplicadorPotencia) {
        this.multiplicadorPotencia = multiplicadorPotencia;
    }

    @Override
    public double getMultiplicadorControl() {
        return multiplicadorControl;
    }

    public void setMultiplicadorControl(double multiplicadorControl) {
        this.multiplicadorControl = multiplicadorControl;
    }

    @Override
    public void calcularPotencia(){
        super.potencia = (tabla_potencia.get(longitud)*multiplicadorPotencia);
        //return super.getPotencia()*multiplicadorPotencia;

    }

    @Override
    public void calcularControl(){
        super.control = (tabla_control.get(tam_cabeza)*multiplicadorControl);
        //return super.calcularControl()*multiplicadorControl;
    }

    @Override
    public String tipoRaqueta(){
        return "RaquetaEquilibrada";
    }

    @Override
    public String toString() {
        return (this.tipoRaqueta()+super.toString());
    }

}
