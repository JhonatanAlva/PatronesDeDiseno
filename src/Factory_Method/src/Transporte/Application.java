package Transporte;

import Transporte.Transporte;
import Transporte.Fabrica;

public class Application {

    public static void main(String[] args) {
        Transporte t1 = Fabrica.construir("Motocicleta");

        t1.armar();
        t1.terminar();

        System.out.println(t1.tipo());
    }
}

