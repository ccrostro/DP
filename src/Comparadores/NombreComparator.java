package Comparadores;
import Tenista.Tenista;
import java.util.Comparator;

class NombreComparator implements Comparator<Tenista> {
    public int compare(Tenista t1, Tenista t2){
        return t1.getNombre().compareTo(t2.getNombre());
    }
}
