package Prototy;

public class BicicletaModificada extends Bicicleta{

    @Override
    public String VerBicicleta() {
        return "la bicicleta es de color "+this.getColor() + ", ruedas: " + this.getRuedas();

    }
}
