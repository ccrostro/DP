package Raqueta;

public enum Encordado {
    ABIERTO("Abierto", 2.0, 2.2),
    CERRADO("Cerrado", 1.8,2.5);
    private final String nombre;
    private final double multiplicador_potencia;
    private final double multiplicador_control;

    Encordado(String nombre, double multiplicador_potencia, double multiplicador_control){
        this.nombre=nombre;
        this.multiplicador_potencia=multiplicador_potencia;
        this.multiplicador_control=multiplicador_control;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMultiplicador_potencia() {
        return multiplicador_potencia;
    }

    public double getMultiplicador_control() {
        return multiplicador_control;
    }
}
