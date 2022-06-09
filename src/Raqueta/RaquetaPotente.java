package Raqueta;

public class RaquetaPotente extends RaquetaGenerica{

    /**
     * Constructor parametrizado
     * @param modelo nombre del modelo
     * @param peso peso de la raqueta
     * @param longitud longitud de la raqueta
     * @param tam_cabeza tamaño de la cabeza
     * @param encordado información sobre el encordado
     */
    public RaquetaPotente(String modelo, double peso, double longitud, double tam_cabeza, Encordado encordado){
        super(modelo, peso, longitud, tam_cabeza,encordado);
        this.calcularPotencia();
        this.calcularVelocidad();
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
    public void calcularPotencia(){
        super.potencia = (tabla_potencia.get(longitud)*this.getMultiplicadorPotencia());
        //return super.getPotencia()*this.getEncordado().getMultiplicador_potencia();

    }

    @Override
    public void calcularVelocidad(){
        super.velocidad = (tabla_velocidad.get(peso)*1.5);
        //return super.calcularVelocidad()*1.5;

    }

    @Override
    public String tipoRaqueta(){
        return "RaquetaPotente";
    }

    @Override
    public String toString() {
        return (this.tipoRaqueta()+super.toString());
    }
}
