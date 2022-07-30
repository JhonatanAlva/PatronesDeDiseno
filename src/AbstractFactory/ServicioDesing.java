package AbstractFactory;

public class ServicioDesing implements ServicioInformatico{


    @Override
    public void asignarTrabajo() {
        System.out.println("El trabajo ha sido asignado a diseñadores graficos disponibles.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Ellos han determinado terinar el trabajo como maximopara el dia 30/07/2022.");
    }

    @Override
    public void InformarSobrePago() {
        System.out.println("Debo realizar el pago en efectivo al momento de recoger el logo completamente.");

    }
}
