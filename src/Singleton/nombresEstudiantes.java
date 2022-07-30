package Singleton;

public class nombresEstudiantes {
    protected String nombreEstudianteUno, nombreEstudianteDos, nombreEstudianteTres;

    private static nombresEstudiantes listado = new nombresEstudiantes();
    private nombresEstudiantes(){

    }
    public static nombresEstudiantes Obtenerlistado(){
        return listado;
    }
}
