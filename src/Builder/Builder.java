package Builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    Comportamiento comportamiento;
    List<Integer> acciones;
    public Builder(){
        acciones = new ArrayList<Integer>();
    }
    public void enviarComportamiento(int i){
        if(i == 1){
            comportamiento = new Trabajador1();
        } else {
            comportamiento = new Trabajador2();
        }
    }
    public void materiales(){
        acciones.add(1);
    }
    public void realizar(){
        acciones.add(2);
    }
    public void imposible(){
        acciones.add(50);
    }
    public Comportamiento obtenerComportamiento(){
        comportamiento.ListaDeTrabajos(acciones);
        return comportamiento;
    }
}
