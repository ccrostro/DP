package Comparadores;

import Raqueta.RaquetaGenerica;

import java.util.Comparator;

public class ComparatorPotencia implements Comparator<RaquetaGenerica> {
    public int compare(RaquetaGenerica r1, RaquetaGenerica r2){
        if(r1.getPotencia()==r2.getPotencia()) {
            return -r1.getModelo().compareTo(r2.getModelo());
        }
        else if(r1.getPotencia()<r2.getPotencia()) {
            return 1;
        }
        else {
            return -1;
        }
    }


}
