package Tenista;

import Zapatilla.Zapatilla;

public class TenistaGolpeador extends Tenista{

    public TenistaGolpeador(String nombre, Zapatilla zapatillas, double saque, double resto, int ranking, String pais, double numero_pie){
        super(nombre,zapatillas,saque,resto,ranking,pais,numero_pie);
    }

    @Override
    public void golpear(){
        this.setPuntosAcumulados(((this.getRaqueta().getVelocidad()*0.1)+this.getPuntosAcumulados()));
    }

    @Override
    public String toString(){
        return "Tenista (Golpeadores) "+super.toString();
    }

    public String toStringJuego(){
        return "Tenista (Golpeadores) "+this.getNombre();
    }

}
