// Caso de estudio 2
// Mostrar la calificación de un tema de la materia de Fundamentos de programación
public class CalificacionTemaFdp {
  public static void main(String[] args) {
    // Definimos las variables de entrada "cuestionario" y "actualizacion"
    int cuestionario;
    int actualizacion;

    // Definimos la variable de salida "calificacion"
    int calificacion;

    // Asignamos valores iniciales a las variables de entrada "cuestionario" y
    // "actualizacion"
    cuestionario = 50;
    actualizacion = 50;

    // Inicializamos la variable de salida "porcentaje"
    calificacion = 0;

    // Asignamos valor a la variable de salida "calificacion"
    // Calculamos la calificación sumando las variables de entrada "cuestionario" y
    // "actualizacion"
    calificacion = cuestionario + actualizacion;

    // Mostramos la variable de salida "calificacion"
    System.out.println(
        "La calificación del tema de Fundamentos de Programación es de " + calificacion

    );
  }
}
