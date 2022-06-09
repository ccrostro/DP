package Raqueta;

public class RaquetaControlada extends RaquetaGenerica{

    /**
     * Constructor parametrizado
     * @param modelo nombre del modelo
     * @param peso peso de la raqueta
     * @param longitud longitud de la raqueta
     * @param tam_cabeza tamaño de la cabeza
     * @param encordado información del encordado
     */
    public RaquetaControlada(String modelo, double peso, double longitud, double tam_cabeza, Encordado encordado){
        super(modelo, peso, longitud, tam_cabeza,encordado);
        this.calcularControl();
        this.calcularVelocidad();
    }

    @Override
    public void calcularControl(){
        super.control = (tabla_control.get(tam_cabeza)*this.getEncordado().getMultiplicador_control());
        //return super.calcularControl()*this.getEncordado().getMultiplicador_control();

    }

    @Override
    public double getMultiplicadorPotencia(){
        return this.getEncordado().getMultiplicador_potencia();
    }

    @Override
    public double getMultiplicadorControl(){
        return this.getEncordado().getMultiplicador_control();
    }

    @Override
    public void calcularVelocidad(){
        super.velocidad = (tabla_velocidad.get(peso)*1.2);
        //return super.calcularVelocidad()*1.2;

    }

    @Override
    public String tipoRaqueta(){
        return "RaquetaControlada";
    }

    @Override
    public String toString() {
        return (this.tipoRaqueta()+super.toString());
    }
}


