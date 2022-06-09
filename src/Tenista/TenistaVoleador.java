package Tenista;

import Campeonato.Campeonato;
import Raqueta.RaquetaGenerica;
import Zapatilla.Zapatilla;

import java.util.Iterator;

public class TenistaVoleador extends Tenista{

    public TenistaVoleador(String nombre, Zapatilla zapatillas, double saque, double resto, int ranking, String pais, double numero_pie){
        super(nombre,zapatillas,saque,resto,ranking,pais,numero_pie);
    }

    @Override
    public void golpear(){
        this.setPuntosAcumulados((this.getRaqueta().getPotencia()*0.15)+this.getPuntosAcumulados());
    }

    @Override
    public void cambiarRaqueta(){
        Iterator<RaquetaGenerica> it_R = Campeonato.ObtenerSetRaquetas().iterator();
        boolean enc = false;
        while(it_R.hasNext() && !enc){
            RaquetaGenerica r = it_R.next();
            if(r.getVelocidad() > this.getRaqueta().getVelocidad()){
                enc = true;
                this.setRaqueta(r);
                it_R.remove();
            }
        }
    }

    @Override
    public String toString(){
        return "Tenista (Voleadores) "+super.toString();
    }

    @Override
    public String toStringJuego(){
        return "Tenista (Voleadores) "+this.getNombre();
    }

}
