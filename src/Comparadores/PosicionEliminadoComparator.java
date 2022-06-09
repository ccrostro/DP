package Comparadores;
import Tenista.Tenista;

import java.util.Comparator;

public class PosicionEliminadoComparator implements Comparator<Tenista> {
    public int compare(Tenista t1, Tenista t2){
        if(t1.getPos_eliminacion()==t2.getPos_eliminacion())
            return new NombreComparator().compare(t1, t2);
        else if(t1.getPos_eliminacion()>t2.getPos_eliminacion())
            return 1;
        else
            return -1;
    }
}
