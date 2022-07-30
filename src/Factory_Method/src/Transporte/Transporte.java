package Transporte;

public interface Transporte {

    public void armar();

    public void terminar();

    public default String tipo() {
        return null;
    }
}
