// Caso de estudio 6
// Positivo, negativo, nulo
public class PositivoNegativoNulo {
  public static void main(String[] args) {
    // Declaramos la variable de entrada
    int numero;

    // Declaramos la variable de salida
    String mensaje;

    // Asignamos valor a la entrada
    numero = 1;

    // Inicializamos la variable de salida (con un valor por defecto)
    mensaje = " es nulo";

    // Usamos una estructura de seleccion simple para evaluar si el número es
    // positivo
    if (numero > 0) {
      // Asignamos valor a la variable de salida
      mensaje = " es positivo";
    }

    // Usamos una estructura de seleccion simple para evaluar si el número es
    // negativo
    if (numero < 0) {
      // Asignamos valor a la variable de salida
      mensaje = " es negativo";
    }

    // Mostramos la salida
    System.out.println("El número " + numero + mensaje);
  }
}
