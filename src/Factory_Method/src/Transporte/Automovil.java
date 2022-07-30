package Transporte;

public class Automovil implements Transporte{

    @Override
    public void armar() {
        System.out.println("Estoy armando el Automovil..");
    }

    @Override
    public void terminar() {
        System.out.println("Automovil Finalizado..");
    }

    @Override
    public String tipo() {
        return "Automovil";
    }
}
