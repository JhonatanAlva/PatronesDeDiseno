package Prototy;

public class ClienteCompra {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bicicleta bici = new BicicletaModificada();
        bici.setColor("azul");
        bici.setRuedas(2);
        Bicicleta bici2 = bici.clone();
        bici2.setColor("negra");
        bici2.setRuedas(3);
        System.out.println(bici.VerBicicleta());
        System.out.println(bici2.VerBicicleta());

    }
}
