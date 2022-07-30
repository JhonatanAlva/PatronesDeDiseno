package Transporte;

public class Motocicleta implements Transporte{
    @Override
    public void armar() {
        System.out.println("Estoy armando la Motocicleta..");
    }

    @Override
    public void terminar() {
        System.out.println("Motocicleta Finalizada..");
    }

    @Override
    public String tipo() {
        return "Motocicleta";
    }
}
