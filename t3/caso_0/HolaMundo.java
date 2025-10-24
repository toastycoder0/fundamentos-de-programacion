// Caso de estudio 0
// Hola Mundo
public class HolaMundo {
  public static void main(String[] args) {
    // Declarar la variable de entrada
    int repeticiones;

    // Declarar la variable de salida
    String mensaje;

    // Asignar valor a la variable de entrada
    repeticiones = 9;

    // Inicializar la variable de salida
    mensaje = "";

    for (int iterador = 1; iterador <= repeticiones; iterador++) {
      mensaje += iterador + ": ";

      // Usamos una estructura de seleccion simple para asignar valor a la salida
      if (repeticiones >= 1 && repeticiones <= 10) {
        mensaje += "Hola Mundo\n";
      } else {
        mensaje += "Hello World\n";

      }
    }

    // Mostramos el valor de la variable de salida
    System.out.println(mensaje);
  }
}
