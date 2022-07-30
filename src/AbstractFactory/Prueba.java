package AbstractFactory;
import java.util.Scanner;



public class Prueba {

    private static Scanner S = new Scanner(System.in);

    public static void main (String[] args){
        int o;
        do{
            o = preguntarServicio();
            switch (o) {
                case 1:
                    usarServicio(new DesingFactory());
                    break;
                case 2:
                    usarServicio((ServicioFactory) new ServiciodeSoftware());
                    break;
                case 3:
                    usarServicio((ServicioFactory) new ServicioPaginaWeb());
                    break;
                case 4:
                    System.out.println("Cerrando programa");
                    break;
                default:
                    System.out.println("Se ha ingresado una opcion invalida.");

            }
            System.out.println("/n");
        }while(o!=4);
    }
    public static void usarServicio(ServicioFactory Factory) {
        ServicioInformatico servicio = Factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.InformarSobrePago();
    }
    public static int preguntarServicio() {
        System.out.println(
                "MENU DE OPCIONES\n"
                +" ---------->\n"
                + "1. Solicitar servicio de diseño grafico.\n"
                + "2. Solicitar desarrollo de software.\n"
                + "3. Solicitar creacion de sitios web\n"
                + "4. Cerrar opcion: \n"
                + "Seleccione opcion:"
        );
        return  Integer.parseInt(S.nextLine());
    }
}
