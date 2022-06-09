package Zapatilla;

public class ZapatillasConAgarre extends Zapatilla{

    public ZapatillasConAgarre(String modelo, double numero, double valor) {
        super(modelo, numero, valor);
    }

    @Override
    public double calcularValorResto(){
        return super.calcularValorResto()*1.7;
    }

    @Override
    public String toString(){
        return "ZapatillasConAgarre"+super.toString();
    }
}
