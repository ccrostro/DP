package Comparadores;
import Tenista.Tenista;

import java.util.Comparator;

class PuntosAcumuladosComparator implements Comparator<Tenista> {
    public int compare(Tenista t1, Tenista t2){
        if(t1.getPuntosAcumulados() == t2.getPuntosAcumulados())
            return new NombreComparator().compare(t1, t2);
        else if(t1.getPuntosAcumulados()>t2.getPuntosAcumulados())
            return 1;
        else
            return -1;
    }
}
