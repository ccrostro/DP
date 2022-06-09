import Campeonato.Campeonato;

public class TennisDemo {
    public static void main(String[] args) {
        //Creación del campeonato
        Campeonato c = Campeonato.singleton();
        //Carga de datos iniciales del campeonato
        InitData i = new InitData(c);
        //Llamada al método que inicia la simulación del campeonato
        System.out.println(c.toString());
        c.competir();



    }
}
