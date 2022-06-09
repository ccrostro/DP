package Campeonato;

import Comparadores.ComparatorPotencia;
import Raqueta.Raqueta;
import Raqueta.RaquetaGenerica;
import Tenista.Tenista;
import Zapatilla.Zapatilla;

import java.util.*;

/**
 * Clase encargada de implementar y ejecutar la lógica del juego, además de almacenar las estructuras de datos
 * @author:
 * @version:
 */
public class Campeonato{

    private String nombre;
    private ArrayList<Tenista>competidores;
    private ArrayList<Tenista>eliminados;
    private static ArrayList<Zapatilla>zapatillas_campeonato;
    private static Set<RaquetaGenerica> set_raquetas;
    private static Campeonato c;


    /**
     * Constructor por defecto
     *
     */
    public Campeonato(){
        this.nombre = " ";
        this.competidores = new ArrayList<>();
        this.eliminados = new ArrayList<>();
        this.zapatillas_campeonato = new ArrayList<>();
        this.set_raquetas = new TreeSet<>(new ComparatorPotencia());
    }

    /**
     * Constructor parametrizado
     * @param nombre nombre del campeonato.
     */
    public Campeonato(String nombre){
        this.nombre = nombre;
        this.competidores = new ArrayList<>();
        this.eliminados = new ArrayList<>();
        this.zapatillas_campeonato = new ArrayList<>();
        this.set_raquetas = new TreeSet<>(new ComparatorPotencia());

    }

    public static Campeonato singleton(){
        if(c == null)
            c = new Campeonato();
        return c;
    }

    public static List<Zapatilla> ObtenerListaZapatillas(){
        return zapatillas_campeonato;
    }

    public static Set<RaquetaGenerica> ObtenerSetRaquetas() {
        return set_raquetas;
    }


    public static void EliminarPrimeraRaqueta(Raqueta raqueta) {
        set_raquetas.remove(raqueta);
    }

    /**
     * Inserta zapatilla en la lista de zapatillas.
     * @param z instancia de la clase zapatilla.
     */
    public void insertar_zapatilla(Zapatilla z){
        zapatillas_campeonato.add(z);
    }

    /**
     * Método que añade un tenista a la lista de competidores.
     * @param t1 instancia de la clase tenista.
     */
    public void inscribir(Tenista t1){
        competidores.add(t1);
    }

    /**
     * Método encargado de simular un partido.
     * @param t1 instancia de la clase tenista.
     * @param t2 instancia de la clase tenista.
     */

    /**
     * Método que muestra por pantalla en qué ronda del juego estamos.
     * @param ronda entero con el valor de la ronda por la que va el juego.
     */
    public void mostrarRonda(int ronda){
        System.out.println("***** Ronda---->>>: "+ronda);

    }

    /**
     * Método encargado de mostrar por pantalla en qué juego estamos y qué tenistas juegan.
     * @param juego entero con el valor del juego que se va a jugar.
     * @param t1 instancia de la clase tenista.
     * @param t2 instancia de la clase tenista.
     */
    public void mostrarJuego(int juego, Tenista t1, Tenista t2){
        System.out.println("### Juego ----------->>>: "+juego);
        System.out.println("## Tenista1 ---->>>: "+t1.toStringJuego());
        System.out.println("Zapatillas asignadas:   "+t1.getZapatillas().toString());
        System.out.println("## Tenista2 ---->>>: "+t2.toStringJuego());
        System.out.println("Zapatillas asignadas:   "+t2.getZapatillas().toString());

    }

    /**
     * Método encargado de mostrar el ganador y el perdedor.
     * @param ganador instancia de la clase tenista.
     * @param perdedor instancia de la clase tenista.
     */
    public void mostrarGanador(Tenista ganador, Tenista perdedor){
        System.out.println("## Gana este juego: "+ganador.getNombre()+" con: "+ganador.getPuntosAcumulados()+" puntos acumulados.");
        System.out.println("## Se elimina: "+perdedor.getNombre()+" con: "+perdedor.getPuntosAcumulados()+" puntos acumulados. Tenista eliminado num: "+perdedor.getPos_eliminacion());
    }



    /**
     * Método encargador de llamar a los competidores para jugar y organizar las listas de eliminados y de competidores según se vaya desarrollando el juego.
     */
    public void competir(){
        Tenista t1, t2;
        Raqueta r1, r2;

        int ronda=1;

        int cont1=0;
        int cont2=competidores.size()-1;
        if(set_raquetas.size()>competidores.size()) {
            while (competidores.size() > 1) {
                mostrarRonda(ronda);
                int rondas = competidores.size() / 2;
                for (int i = 0; i < rondas; i++) {
                    t1 = competidores.get(cont1);
                    t2 = competidores.get(cont2);
                    r1 = t1.getRaqueta();
                    r2 = t2.getRaqueta();
                    t1.elegir_zapatillas();
                    t2.elegir_zapatillas();
                    t1.jugar(t2);
                    t2.jugar(t1);
                    if (t1.getPuntosAcumulados() > t2.getPuntosAcumulados()) {
                        eliminados.add(t2);
                        t2.setPos_eliminacion(eliminados.size());
                        competidores.remove(cont2);
                        mostrarJuego(i, t1, t2);
                        t1.comprobarCambioRaqueta(r1);
                        t2.comprobarCambioRaqueta(r2);
                        mostrarGanador(t1, t2);

                    } else if (t1.getPuntosAcumulados() < t2.getPuntosAcumulados()) {
                        eliminados.add(t1);
                        t1.setPos_eliminacion(eliminados.size());
                        competidores.remove(cont1);
                        competidores.add(cont1, t2);
                        competidores.remove(competidores.size() - 1);
                        mostrarJuego(i, t1, t2);
                        t1.comprobarCambioRaqueta(r1);
                        t2.comprobarCambioRaqueta(r2);
                        mostrarGanador(t2, t1);
                    } else if (t1.getPuntosAcumulados() == t2.getPuntosAcumulados()) {
                        if (t1.getVelocidadTotal() > t2.getVelocidadTotal()) {
                            eliminados.add(t1);
                            t1.setPos_eliminacion(eliminados.size());
                            competidores.remove(cont1);
                            competidores.add(cont1, t2);
                            competidores.remove(competidores.size() - 1);
                            mostrarJuego(i, t1, t2);
                            t1.comprobarCambioRaqueta(r1);
                            t2.comprobarCambioRaqueta(r2);
                            mostrarGanador(t2, t1);
                        } else {
                            eliminados.add(t2);
                            t2.setPos_eliminacion(eliminados.size());
                            competidores.remove(competidores.size() - 1);
                            mostrarJuego(i, t1, t2);
                            t1.comprobarCambioRaqueta(r1);
                            t2.comprobarCambioRaqueta(r2);
                            mostrarGanador(t1, t2);
                        }
                    }
                    cont1++;
                    cont2--;
                }
                for (Tenista t : competidores)
                    t.setPuntosAcumulados(0);
                ronda++;
                cont1 = 0;
                cont2 = competidores.size() - 1;
            }
            System.out.println("---->>>>  Gana la competición: " + competidores.get(0).toString() + "  <<<<----\n");
            mostrarEliminados();
        }
        else{
            System.out.println("Campeonato.Campeonato suspendido temporalmente. No hay suficientes raquetas para los competidores.");
        }
    }

    /**
     * Método encargado de mostrar a los jugadores eliminados.
     */
    private void mostrarEliminados() {
        System.out.println("***** Listado de eliminados: ");
        Collections.reverse(eliminados);
        for(Tenista t:eliminados){
            System.out.println(t.toString());
        }
    }

    /**
     * Método que inserta una raqueta en el TreeSet de raquetas.
     * @param r instancia de la clase RaquetaGenerica
     */
    public void insertarRaqueta(RaquetaGenerica r){
        set_raquetas.add(r);
    }


    /**
     * Método encargado de asignar las raquetas a los tenistas.
     */
    public void asignarRaquetas(){
        Iterator<RaquetaGenerica> it_R = set_raquetas.iterator();
        Iterator<Tenista> it_T = competidores.iterator();
        while(it_R.hasNext() && it_T.hasNext()){
            RaquetaGenerica r = it_R.next();
            Tenista t = it_T.next();
            t.setRaqueta(r);
            it_R.remove();
        }
    }

    @Override
    /**
     * Muestra los datos del campeonato.
     * @Return cadena con la información del campeonato y sus participantes
     */
    public String toString() {
        String cad="***** Inicio del campeonato: Campeonato.Campeonato de Extremadura *****\n\n***** Asignando raquetas a tenistas *****\n";
        for(Tenista r:competidores)
            cad+="** "+r.getRaqueta().toString()+"asignada a --->> "+r.getNombre()+"\n";
        cad+="\n***** Listado de competidores:\n";
        for(Tenista t:competidores){
            cad+="** "+t.toString();
            cad+="\n";
        }
        cad+="\n***** Listado de Raquetas disponibles::\n";
        for(Raqueta r:set_raquetas){
            cad+=r.toString();
        }

        return cad;
    }
}
