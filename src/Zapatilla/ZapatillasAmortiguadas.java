package Zapatilla;

public class ZapatillasAmortiguadas extends Zapatilla{

/*    public Zapatilla.ZapatillasAmortiguadas(Zapatilla.Zapatilla z){
        super(z);
    }*/

    public ZapatillasAmortiguadas(String modelo, double numero, double valor) {
        super(modelo, numero, valor);
    }

    @Override
    public double calcularValorSaque(){
        return super.calcularValorSaque()*1.8;
    }

    @Override
    public String toString(){
        return "ZapatillasAmortiguadas"+super.toString();
    }
}
