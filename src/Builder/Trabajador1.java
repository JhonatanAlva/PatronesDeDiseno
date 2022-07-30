package Builder;

import java.util.List;

public class Trabajador1 implements Comportamiento{
    List<Integer> acciones;
    public Trabajador1(){}
    private void iniciarLabor(){
        System.out.println("Iniciando trabajo");
    }
    private void getmateriales(){
        System.out.println("Buscando materiales de contruccion");
    }
    private void transportarMateriales(){
        System.out.println("Llevando materiales");
    }
    private void terminarTrabajo(){
        System.out.println("Trabajo terminado");
    }
    @Override
    public void trabajar() {
        iniciarLabor();
        for (Integer i: acciones){
            switch (i){
                case 1:
                    getmateriales();
                    break;
                case 2:
                    transportarMateriales();
                    break;
                default:
                    System.out.println("Trabajo no se pudo realizar");
            }
        }
        terminarTrabajo();
    }

    @Override
    public void ListaDeTrabajos(List<Integer> accion) {
        this.acciones = accion;
    }
}
