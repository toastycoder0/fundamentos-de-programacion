// Caso de estudio 2
// Mostrar la calificación de un tema de la materia de Fundamentos de programación
public class CalificacionTemaFdp {
  public static void main(String[] args) {
    // Definimos las variables de entrada
    int actualizacion;
    int cuestionario;
    int exposicion;
    int apuntes;

    // Definimos la variable de salida
    int calificacion;

    // Asignamos valores iniciales a las variables de entrada
    actualizacion = 15;
    cuestionario = 20;
    exposicion = 15;
    apuntes = 10;

    // Inicializamos la variable de salida
    calificacion = 0;

    // Asignamos valor a la variable de salida
    // Calculamos la calificación sumando las variables de entrada
    calificacion = actualizacion + cuestionario + exposicion + apuntes;

    // Mostramos la variable de salida "calificacion"
    System.out.println(actualizacion + " actualización");
    System.out.println(cuestionario + " cuestionario");
    System.out.println(exposicion + " exposición");
    System.out.println(apuntes + " apuntes");
    System.out.println("Calificación " + calificacion);
  }
}
