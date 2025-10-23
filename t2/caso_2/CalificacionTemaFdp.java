// Caso de estudio 2
// Mostrar la calificación de un tema de la materia de Fundamentos de programación
public class CalificacionTemaFdp {
  public static void main(String[] args) {
    // Definimos la variable de entrada
    int calificaciones;

    // Definimos las variables de salida
    int actualizacion;
    int cuestionario;
    int exposicion;
    int apuntes;
    int calificacion;

    // Asignamos valores iniciales a la variable de entrada
    calificaciones = 35302015;

    // Inicializamos la variable de salida
    actualizacion = 0;
    cuestionario = 0;
    exposicion = 0;
    apuntes = 0;
    calificacion = 0;

    // Asignamos valor a las variables de salida
    actualizacion = calificaciones / 1000000;
    cuestionario = (calificaciones / 10000) % 100;
    exposicion = (calificaciones / 100) % 100;
    apuntes = calificaciones % 100;
    calificacion = actualizacion + cuestionario + exposicion + apuntes;

    // Mostramos la variable de salida "calificacion"
    System.out.println(actualizacion + " actualización");
    System.out.println(cuestionario + " cuestionario");
    System.out.println(exposicion + " exposición");
    System.out.println(apuntes + " apuntes");
    System.out.println("Calificación " + calificacion);
  }
}
