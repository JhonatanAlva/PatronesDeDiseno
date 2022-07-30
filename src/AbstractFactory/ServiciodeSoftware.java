package AbstractFactory;

import AbstractFactory.ServicioInformatico;

public class ServiciodeSoftware implements ServicioInformatico {
    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados del programa que se debe realizar.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Se ha fijado como fecha de entrega el dia 31/07/2022");

    }

    @Override
    public void InformarSobrePago() {
        System.out.println("El monto a pagar no incluye el pago por dominio y hosting.");

    }
}
