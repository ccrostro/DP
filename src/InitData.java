import Campeonato.Campeonato;
import Raqueta.*;
import Tenista.*;
import Zapatilla.*;

public class InitData {
    public InitData(Campeonato campeonato) {
        //Descomentar la carga de datos que se quiera probar
        cargarDatos1(campeonato);//Produce la salida Salida1_EC1
        //cargarDatos2(campeonato);//Produce la salida Salida2_EC1

    }

    private void cargarDatos1(Campeonato campeonato) {
        RaquetaGenerica.init_tables();
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
        Zapatilla z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
        Zapatilla z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
        Zapatilla z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
        Zapatilla z4 = new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
        Zapatilla z5 = new ZapatillasConAgarre("Court Lite", 39, 3);
        Zapatilla z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40, 6);
        Zapatilla z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
        Zapatilla z8 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);
        //campeonato.insertar_zapatilla(z1);
        //campeonato.insertar_zapatilla(z2);
        //campeonato.insertar_zapatilla(z3);
        //campeonato.insertar_zapatilla(z4);
        //campeonato.insertar_zapatilla(z5);
        //campeonato.insertar_zapatilla(z6);
        //campeonato.insertar_zapatilla(z7);
        //campeonato.insertar_zapatilla(z8);



        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
        Tenista t1 = new TenistaGolpeador("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista t2 = new TenistaGolpeador("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
        Tenista t3 = new TenistaVoleador("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista t4 = new TenistaVoleador("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista t5 = new TenistaGolpeador("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista t6 = new TenistaGolpeador("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista t7 = new TenistaVoleador("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista t8 = new TenistaVoleador("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);


        //Instanciamos zapatillas para ser usadas en el campeonato:
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
        Zapatilla z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
        Zapatilla z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
        Zapatilla z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
        Zapatilla z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
        Zapatilla z14 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
        Zapatilla z15 = new ZapatillasAmortiguadas("Head Revolt", 40,  5);
        Zapatilla z16 = new ZapatillasConAgarre("Joma Slam", 40, 3);
        Zapatilla z17 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
        Zapatilla z18 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
        Zapatilla z19 = new ZapatillasConAgarre("Asics Solution", 42, 3);
        Zapatilla z20 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
        Zapatilla z21 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
        Zapatilla z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
        Zapatilla z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);

        campeonato.insertar_zapatilla(z9);
        campeonato.insertar_zapatilla(z10);
        campeonato.insertar_zapatilla(z11);
        campeonato.insertar_zapatilla(z12);
        campeonato.insertar_zapatilla(z13);
        campeonato.insertar_zapatilla(z14);
        campeonato.insertar_zapatilla(z15);
        campeonato.insertar_zapatilla(z16);
        campeonato.insertar_zapatilla(z17);
        campeonato.insertar_zapatilla(z18);
        campeonato.insertar_zapatilla(z19);
        campeonato.insertar_zapatilla(z20);
        campeonato.insertar_zapatilla(z21);
        campeonato.insertar_zapatilla(z22);
        campeonato.insertar_zapatilla(z23);



        //Instanciamos raquetas para ser usadas en el campeonato:
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control

        RaquetaGenerica r1 =  new RaquetaPotente("Head Radical", 260, 680, 680, Encordado.ABIERTO);
        RaquetaGenerica r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        RaquetaGenerica r3 =  new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        RaquetaGenerica r4 =  new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        RaquetaGenerica r5 =  new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        RaquetaGenerica r6 =  new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        RaquetaGenerica r7 =  new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        RaquetaGenerica r8 =  new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        RaquetaGenerica r9 =  new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        RaquetaGenerica r10 =  new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        RaquetaGenerica r11 =  new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        RaquetaGenerica r12 =  new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
        RaquetaGenerica r14 = new RaquetaPotente("Wilson Energy XL", 260, 690, 680, Encordado.ABIERTO);
        RaquetaGenerica r15 = new RaquetaPotente("Wilson Pro Open", 340, 740, 720, Encordado.ABIERTO);
        RaquetaGenerica r16 = new RaquetaPotente("Babolat Boost Drive", 220, 680,600, Encordado.CERRADO);
        RaquetaGenerica r17 = new RaquetaPotente("Babolat Pure Drive", 260, 720, 600, Encordado.CERRADO);
        RaquetaGenerica r18 = new RaquetaControlada("Prince Force Ti OS", 340, 740, 600, Encordado.CERRADO);
        RaquetaGenerica r19 = new RaquetaControlada("Head Prestige Pro", 340, 740, 720, Encordado.ABIERTO);
        RaquetaGenerica r20 = new RaquetaControlada("Head Instinct", 220, 680,600, Encordado.ABIERTO);
        RaquetaGenerica r21 = new RaquetaControlada("Dunlop Nitro", 340, 720, 600, Encordado.CERRADO);
        RaquetaGenerica r22 = new RaquetaEquilibrada("Prince Force", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        RaquetaGenerica r23 = new RaquetaEquilibrada("Prince Warrior", 340, 740, 720, Encordado.ABIERTO, 6, 2);
        RaquetaGenerica r24 = new RaquetaEquilibrada("Wilson Pro Staff", 220, 680, 600, Encordado.CERRADO, 2.5, 4);
        campeonato.insertarRaqueta(r1);
        campeonato.insertarRaqueta(r2);
        campeonato.insertarRaqueta(r3);
        campeonato.insertarRaqueta(r4);
        campeonato.insertarRaqueta(r5);
        campeonato.insertarRaqueta(r6);
        campeonato.insertarRaqueta(r7);
        campeonato.insertarRaqueta(r8);
        campeonato.insertarRaqueta(r9);
        campeonato.insertarRaqueta(r10);
        campeonato.insertarRaqueta(r11);
        campeonato.insertarRaqueta(r12);
        campeonato.insertarRaqueta(r14);
        campeonato.insertarRaqueta(r15);
        campeonato.insertarRaqueta(r16);
        campeonato.insertarRaqueta(r17);
        campeonato.insertarRaqueta(r18);
        campeonato.insertarRaqueta(r19);
        campeonato.insertarRaqueta(r20);
        campeonato.insertarRaqueta(r21);
        campeonato.insertarRaqueta(r22);
        campeonato.insertarRaqueta(r23);
        campeonato.insertarRaqueta(r24);



        //A continuación se inscribirán a los 8 tenistas en el campeonato
        t1.realizarInscripcion(campeonato);
        t2.realizarInscripcion(campeonato);
        t3.realizarInscripcion(campeonato);
        t4.realizarInscripcion(campeonato);
        t5.realizarInscripcion(campeonato);
        t6.realizarInscripcion(campeonato);
        t7.realizarInscripcion(campeonato);
        t8.realizarInscripcion(campeonato);
        /*campeonato.inscribir(t1);
        campeonato.inscribir(t2);
        campeonato.inscribir(t3);
        campeonato.inscribir(t4);
        campeonato.inscribir(t5);
        campeonato.inscribir(t6);
        campeonato.inscribir(t7);
        campeonato.inscribir(t8);*/
        campeonato.asignarRaquetas();
    }

    private void cargarDatos2(Campeonato campeonato) {
        RaquetaGenerica.init_tables();

        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
        Zapatilla z1 =  new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
        Zapatilla z2 =  new ZapatillasConAgarre("Court Vapor React", 40,  5);
        Zapatilla z3 =  new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
        Zapatilla z4 =  new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
        Zapatilla z5 =  new ZapatillasConAgarre("Court Lite", 39, 3);
        Zapatilla z6 =  new ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
        Zapatilla z7 =  new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7);
        Zapatilla z8 =  new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
        Tenista t1 =  new TenistaGolpeador("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista t2 =  new TenistaGolpeador("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
        Tenista t3 =  new TenistaGolpeador("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista t4 =  new TenistaGolpeador("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista t5 =  new TenistaVoleador("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista t6 =  new TenistaVoleador("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista t7 =  new TenistaVoleador("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista t8 =  new TenistaVoleador("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
        //Instanciamos zapatillas para ser usadas en el campeonato:
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
        Zapatilla z10 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
        Zapatilla z11 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
        Zapatilla z12 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
        Zapatilla z13 = new ZapatillasConAgarre("Joma Slam", 40, 3);
        Zapatilla z14 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
        Zapatilla z15 = new ZapatillasConAgarre("Asics Solution", 42, 3);
        Zapatilla z16 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
        Zapatilla z17 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
        Zapatilla z18 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
        Zapatilla z19 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
        Zapatilla z20 = new ZapatillasAmortiguadas("Head Revolt", 40,  3);
        Zapatilla z21 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
        Zapatilla z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
        Zapatilla z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);

        campeonato.insertar_zapatilla(z9);
        campeonato.insertar_zapatilla(z10);
        campeonato.insertar_zapatilla(z11);
        campeonato.insertar_zapatilla(z12);
        campeonato.insertar_zapatilla(z13);
        campeonato.insertar_zapatilla(z14);
        campeonato.insertar_zapatilla(z15);
        campeonato.insertar_zapatilla(z16);
        campeonato.insertar_zapatilla(z17);
        campeonato.insertar_zapatilla(z18);
        campeonato.insertar_zapatilla(z19);
        campeonato.insertar_zapatilla(z20);
        campeonato.insertar_zapatilla(z21);
        campeonato.insertar_zapatilla(z22);
        campeonato.insertar_zapatilla(z23);

        //Instanciamos raquetas para ser usadas en el campeonato:
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        RaquetaGenerica r1 = new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        RaquetaGenerica r2 = new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        RaquetaGenerica r3 = new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        RaquetaGenerica r4 = new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        RaquetaGenerica r5 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        RaquetaGenerica r6 = new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        RaquetaGenerica r7 = new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        RaquetaGenerica r8 = new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        RaquetaGenerica r9 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        RaquetaGenerica r10 = new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        RaquetaGenerica r11 = new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        RaquetaGenerica r12 = new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);



        campeonato.insertarRaqueta(r1);
        campeonato.insertarRaqueta(r2);
        campeonato.insertarRaqueta(r3);
        campeonato.insertarRaqueta(r4);
        campeonato.insertarRaqueta(r5);
        campeonato.insertarRaqueta(r6);
        campeonato.insertarRaqueta(r7);
        campeonato.insertarRaqueta(r8);
        campeonato.insertarRaqueta(r9);
        campeonato.insertarRaqueta(r10);
        campeonato.insertarRaqueta(r11);
        campeonato.insertarRaqueta(r12);

        campeonato.inscribir(t1);
        campeonato.inscribir(t2);
        campeonato.inscribir(t3);
        campeonato.inscribir(t4);
        campeonato.inscribir(t5);
        campeonato.inscribir(t6);
        campeonato.inscribir(t7);
        campeonato.inscribir(t8);
        campeonato.asignarRaquetas();

    }
}
