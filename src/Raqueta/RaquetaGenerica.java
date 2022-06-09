package Raqueta;

import java.util.Comparator;
import java.util.HashMap;

public class RaquetaGenerica implements Raqueta {
    protected String modelo;
    protected double peso;
    protected double longitud;
    protected double tam_cabeza;
    protected double potencia;
    protected double control;
    protected double velocidad;
    protected Encordado encordado;
    public static HashMap<Double, Double> tabla_potencia = new HashMap<Double, Double>();
    public static HashMap<Double, Double> tabla_control = new HashMap<Double, Double>();
    public static HashMap<Double, Double> tabla_velocidad = new HashMap<Double, Double>();


    /**
     * Constructor parametrizado
     * @param modelo nombre del modelo
     * @param peso peso de la raqueta
     * @param longitud longitud de la raqueta
     * @param tam_cabeza tamaño de la cabeza
     * @param encordado información sobre el encordado
     */
    public RaquetaGenerica(String modelo, double peso, double longitud, double tam_cabeza, Encordado encordado) {
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;
        this.tam_cabeza = tam_cabeza;
        this.encordado = encordado;
        this.calcularPotencia();
        this.calcularVelocidad();
        this.calcularControl();

    }

    /**
     * Inicializa las tablas que relacionan potencia, control y velocidad con los parámetros longitud, tamaño de cabeza y peso.
     */
    public static void init_tables(){
        tabla_potencia.put(680.0, 2.0);
        tabla_potencia.put(690.0, 4.0);
        tabla_potencia.put(700.0, 6.0);
        tabla_potencia.put(720.0, 8.0);
        tabla_potencia.put(740.0, 10.0);
        tabla_control.put(600.0, 10.0);
        tabla_control.put(630.0, 8.0);
        tabla_control.put(650.0, 6.0);
        tabla_control.put(680.0, 4.0);
        tabla_control.put(720.0, 2.0);
        tabla_velocidad.put(220.0, 10.0);
        tabla_velocidad.put(260.0, 8.0);
        tabla_velocidad.put(300.0, 6.0);
        tabla_velocidad.put(320.0, 4.0);
        tabla_velocidad.put(340.0, 2.0);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getTam_cabeza() {
        return tam_cabeza;
    }

    public void setTam_cabeza(double tam_cabeza) {
        this.tam_cabeza = tam_cabeza;
    }

    public Encordado getEncordado() {
        return encordado;
    }

    public void setEncordado(Encordado encordado) {
        this.encordado = encordado;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getControl() {
        return control;
    }

    public void setControl(double control) {
        this.control = control;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void calcularPotencia(){
        this.setPotencia(tabla_potencia.get(this.getLongitud()));
        //return tabla_potencia.get(this.getLongitud());

    }

    public double getMultiplicadorPotencia(){
        return tabla_potencia.get(this.getLongitud());
    }

    public double getMultiplicadorControl(){
        return tabla_control.get(this.getTam_cabeza());
    }

    public void calcularControl(){
        this.setControl(tabla_control.get(this.getTam_cabeza()));
        //return tabla_control.get(this.getTam_cabeza());

    }

    public void calcularVelocidad(){
        this.setVelocidad(tabla_velocidad.get(this.getPeso()));
        //return tabla_velocidad.get(this.getPeso());

    }

    public String tipoRaqueta(){
        return "RaquetaGenerica";
    }

    @Override
    public String toString() {
        return ("(Encordado:"+this.getEncordado().getNombre()+")(MultiplicadorDePotencia:"+this.getMultiplicadorPotencia()+")(MultiplicadorDeControl:"+this.getMultiplicadorControl()+
                ")\n[modelo="+this.getModelo()+"\nlongitud: "+this.getLongitud()+",potencia asociada: "+this.potencia+"\ntamaño: "+this.getTam_cabeza()+",control asociado: "+this.control+
                "\npeso: "+this.getPeso()+",velocidad Asociada: "+this.velocidad+"]\n");
    }
}
