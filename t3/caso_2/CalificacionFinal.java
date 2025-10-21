// Caso de estudio 2
// Calificacion final
public class CalificacionFinal {
  public static void main(String[] args) {
    // Declaramos las variables de entrada
    int calculo;
    int etica;
    int fisica;
    int matematicas;
    int investigacion;

    // Declaramos la variable intermedia
    int promedio;

    // Declaramos la variable de salida
    String mensaje;

    // Asignamos valores a las entradas
    calculo = 90;
    etica = 80;
    fisica = 95;
    matematicas = 100;
    investigacion = 80;

    // Inicializamos la salida
    mensaje = "Reprobado";

    // Asignamos valor a la variable de salida
    promedio = (calculo + etica + fisica + matematicas + investigacion) / 5;

    // Usar una estructura de seleccion simple para asignar valor a la salida
    if (promedio >= 70 && promedio <= 100) {
      mensaje = "Aprobado";
    }

    // Mostramos la salida
    System.out.println("La califiación es de: " + promedio);
    System.out.println(mensaje);
  }
}
