package Builder;

import java.util.Scanner;

public class Jefe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Builder contructor = new Builder();
        Comportamiento comportamiento;
        int tipoComportamineto;

        System.out.println("Ingrese el numero de trabajador: trabajador1 = 1, trabajador2 = 2");
        tipoComportamineto = sc.nextInt();

        contructor.enviarComportamiento(tipoComportamineto);
        contructor.realizar();

        comportamiento = contructor.obtenerComportamiento();
        comportamiento.trabajar();
    }
}
