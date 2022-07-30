package Builder;

import java.util.List;

public class Trabajador2 implements Comportamiento{
    List<Integer> acciones;
    public Trabajador2(){}
    private void iniciarLabor2(){
        System.out.println("Iniciando trabajo");
    }
    private void tomarMateriales(){
        System.out.println("Tomando Materiales");
    }
    private void construir(){
        System.out.println("Construir");
    }
    private void terminarTrabajo2(){
        System.out.println("Trabajo terminado");
    }
    @Override
    public void trabajar() {
        iniciarLabor2();
        for(Integer i: acciones){
            switch (i){
                case 1:
                    tomarMateriales();
                    break;
                case 2:
                    construir();
                    break;
                default:
                    System.out.println("Trabajo no se pudo realizar");
            }
        }
        terminarTrabajo2();
    }

    @Override
    public void ListaDeTrabajos(List<Integer> accion) {
        this.acciones = accion;
    }
}
