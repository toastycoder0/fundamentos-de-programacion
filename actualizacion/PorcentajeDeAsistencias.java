// Caso de estudio 1
// Vamos a calcular el porcentaje de asistencia de un alumno durante una semana
public class PorcentajeDeAsistencias {
  public static void main(String[] args) {
    // Definimos la variable de entrada "asistencias"
    int asistencias;

    // Definimos la variable de salida "porcentaje"
    int porcentaje;

    // Asignamos un valor inicial a la variable de entrada "asistencias"
    asistencias = 5;

    // Inicializamos la variable de salida "porcentaje"
    porcentaje = 0;

    // Asignamos valor a la variable de salida "porcentaje"
    // Calculamos el porcentaje dividiendo asistencias entre 5 y multiplicando por
    // 100
    porcentaje = (asistencias / 5) * 100;

    // Mostramos la variable de salida "porcentaje"
    System.out.println("El porcentaje de asistencias es del " + porcentaje + "%");
  }
}
