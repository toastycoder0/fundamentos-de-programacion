// Caso de estudio 7
// Par, impar, nulo
public class ParImparNulo {
  public static void main(String[] args) {
    // Declaramos la variable de entrada
    int numero;

    // Declaramos la variable de salida
    String mensaje;

    // Asignamos valor a la entrada
    numero = 0;

    // Inicializamos la variable de salida (con un valor por defecto)
    mensaje = " es nulo";

    // Usamos una estructura de seleccion simple para evaluar si el número es par
    if (numero % 2 == 0 && numero != 0) {
      // Asignamos valor a la variable de salida
      mensaje = " es par";
    }

    // Usamos una estructura de seleccion simple para evaluar si el número es impar
    if (numero % 2 != 0 && numero != 0) {
      // Asignamos valor a la variable de salida
      mensaje = " es impar";
    }

    // Mostramos la salida
    System.out.println("El número " + numero + mensaje);
  }
}
