package AbstractFactory;

public class ServicioPaginaWeb implements ServicioInformatico{

    @Override
    public void asignarTrabajo() {
        System.out.println("El personal encargado del desarrollo de sitios web ha aceptado el trabajo.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("El sitio web con Responsive Desing sera terminado a mas tardar el dia 30/07/2022.");

    }

    @Override
    public void InformarSobrePago() {
        System.out.println("El monto a pagar no incluye el pago por dominio y hosting.");

    }
}
