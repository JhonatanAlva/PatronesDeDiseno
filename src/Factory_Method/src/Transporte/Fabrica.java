package Transporte;

public class Fabrica {

    public static Transporte construir(String tipo){
        switch (tipo){
            case "Motocicleta":
                return new Motocicleta();
            case "Automovil":
                return new Automovil();
            default:
                System.out.println("No se encuentra dicho objeto en la fabrica.");
                return null;
        }
    }
}
