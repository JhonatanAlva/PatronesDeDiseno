package Prototy;

public abstract class Bicicleta implements Cloneable {
    private String color;
    private int ruedas;

    public Bicicleta clone() throws CloneNotSupportedException{
        return (Bicicleta)super.clone();
    }
    public abstract String VerBicicleta();

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
