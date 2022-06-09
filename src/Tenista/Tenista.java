package Tenista;

import Campeonato.Campeonato;
import Raqueta.Raqueta;
import Zapatilla.Zapatilla;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase encargada de almacenar los datos de un tenista.
 */

public abstract class Tenista {

    private String nombre;
    protected Zapatilla zapatillas;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntos;
    private double puntosAcumulados;
    private double numero_pie;
    protected  Raqueta r;



    private int pos_eliminacion;

    /**
     * Constructor por defecto.
     */
    public Tenista() {
        nombre = " ";
        zapatillas = null;
        saque = 0.0;
        resto = 0.0;
        ranking = 0;
        pais = " ";
        puntos = 0.0;
        puntosAcumulados=0.0;
    }

    /**
     * Constructor parametrizado.
     * @param nombre nombre del tenista
     * @param zapatillas zapatilla que lleva el tenista
     * @param saque valor del saque
     * @param resto valor del resto
     * @param ranking posición en el ranking
     * @param pais procedencia del tenista
     */
    public Tenista(String nombre, Zapatilla zapatillas, double saque, double resto, int ranking, String pais, double numero_pie){
        this.nombre = nombre;
        this.zapatillas = zapatillas;
        this.saque = saque;
        this.resto = resto;
        this.ranking = ranking;
        this.pais = pais;
        this.numero_pie = numero_pie;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getResto() {
        return resto;
    }

    public void setResto(double resto) {
        this.resto = resto;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPuntos() {
        return puntos;
    }


    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(double puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getPos_eliminacion() {
        return pos_eliminacion;
    }

    public void setPos_eliminacion(int pos_eliminacion) {
        this.pos_eliminacion = pos_eliminacion;
    }

    public double getNumero_pie() {
        return numero_pie;
    }

    public void setNumero_pie(double numero_pie) {
        this.numero_pie = numero_pie;
    }

    public Zapatilla getZapatillas() {
        return zapatillas;
    }

    public Raqueta getRaqueta() {
        return r;
    }

    public void setRaqueta(Raqueta r) {
        this.r = r;
    }

    public void realizarInscripcion(Campeonato c){
        c.inscribir(this);
    }

    /**
     * Método que asigna las zapatillas a los tenistas.
     */
    public void elegir_zapatillas() {
        Iterator<Zapatilla> it = Campeonato.ObtenerListaZapatillas().iterator();
        boolean enc = false;
        while (!enc && it.hasNext()) {
            Zapatilla z = it.next();
            if (z.getNumero() == this.numero_pie) {
                this.zapatillas = z;
                it.remove();
                enc = true;
            }
        }
    }
        /**
         * Método encargado de simular el saque de un tenista.
         */
        protected void sacar(){
            this.setPuntos(this.getSaque()*zapatillas.calcularValorSaque()*this.getRaqueta().getPotencia()*this.getRaqueta().getVelocidad());
            this.setPuntosAcumulados(this.getPuntosAcumulados()+this.getPuntos());
            //this.setPuntosAcumulados(this.getPuntos()+this.getPuntosAcumulados());
        }

        /**
         * Método encargado de la simulación de recepción de saque de un tenista sobre otro.
         * @param oponente instancia de la clase Tenista, el cuál será el oponente de aquel que llama al método.
         */
        protected final void restar(Tenista oponente){   //suponemos que oponente es t2 en el enunciado
            double recibe = this.getResto()*this.zapatillas.calcularValorResto()*this.r.getControl()*this.r.getVelocidad();
            if(recibe > oponente.getPuntos()){
                //oponente.setPuntos(oponente.zapatillas.calcularValorResto()*oponente.getResto());
                this.setPuntosAcumulados(this.getPuntosAcumulados()+recibe);
            }
        }

    /**
     * Método abstracto encargado de simular el golpeo de un tenista.
     */
    protected abstract void golpear();


    /**
     * Método encargado del cambio de raqueta del tenista, también comprueba si quedan raquetas en el set.
     */
    public void cambiarRaqueta(){
            if(Campeonato.ObtenerSetRaquetas().size()>=1) {
                this.setRaqueta(Campeonato.ObtenerSetRaquetas().iterator().next());
                Campeonato.EliminarPrimeraRaqueta(this.getRaqueta());
            }
        }


    /**
     * Método encargado de simular el juego.
     * @param t2 Instancia de la clase tenista, uno de los participantes del partido.
     */
    public void jugar(Tenista t2){
        this.sacar();
        t2.restar(this);
        this.golpear();
        this.cambiarRaqueta();
    }


    /**
     * Método encargado de sumar el valor del saque y el resto de un tenista para decidir en caso de empate de partido.
     * @return double con el valor de la suma de los atributos saque y resto.
     */
    public double getVelocidadTotal(){
        return this.saque+this.resto;
    }

    /**
     * Método encargado de mostrar los datos de un tenista.
      * @return cadena con toda la información del tenista.
     */
    public String toString(){
        String cad="[nombre="+this.nombre+", saque="+this.saque+", resto="+this.resto+", ranking="+this.ranking+", pais="+this.pais+", número pie="+this.getNumero_pie()+"]\n";
        cad+=zapatillas.toString()+getRaqueta().toString();
        return cad;
    }

    /**
     * Método encargado de mostrar datos del tenista para una salida concreta.
     * @return cadena con la información del tenista.
     */
    public String toStringJuego(){
        return " ";
    }

    /**
     * Método encargado de mostrar por pantalla el cambio de raqueta del tenista.
     */
    public void mostrarCambioRaqueta() {
        System.out.println(this.getNombre()+" cambia su raqueta por: "+this.getRaqueta().tipoRaqueta()+" modelo="+this.getRaqueta().getModelo()+" velocidad="+this.getRaqueta().getVelocidad());
    }


    /**
     * Método encargado de comprobar si es posible el cambio de raqueta de un tenista.
     * @param r1 instancia de la clase RaquetaGenerica
     */
    public void comprobarCambioRaqueta(Raqueta r1) {
        if(this.getRaqueta() != r1)
            mostrarCambioRaqueta();
        else
            System.out.println(this.getNombre()+" no cambia de raqueta");
    }
}
