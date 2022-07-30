package Singleton;

public class Escuela {
    public static void main(String[] args){
        nombresEstudiantes Lista1 = nombresEstudiantes.Obtenerlistado();
        nombresEstudiantes Lista2 = nombresEstudiantes.Obtenerlistado();
        nombresEstudiantes Lista3 = nombresEstudiantes.Obtenerlistado();
        Lista1.nombreEstudianteUno = "Jorge";
        Lista2.nombreEstudianteDos = "Cristian";
        Lista3.nombreEstudianteTres = "Lucy";
        System.out.println(Lista1.nombreEstudianteUno);
        System.out.println(Lista3.nombreEstudianteTres);
        System.out.println(Lista3.nombreEstudianteTres);
    }
}
