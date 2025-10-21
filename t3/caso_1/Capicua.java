// Caso de estudio 1
// Capicua
public class Capicua {
  public static void main(String[] args) {
    // Declaramos la variable de entrada
    int numeroDeTresDigitos;

    // Declaramos una variable auxiliar
    int numeroInvertido;

    // Declaramos la variable de salida
    String mensaje;

    // Asignar valor a la entrada
    numeroDeTresDigitos = 512;

    // Inicializar la variable intermedia
    numeroInvertido = 0;

    // Inicializar la variable de salida con un valor
    mensaje = " no es capicúa";

    // Asignamos valor a la variable intermedia
    numeroInvertido = numeroDeTresDigitos / 100;
    numeroInvertido += numeroDeTresDigitos - numeroInvertido * 100 - numeroDeTresDigitos % 10;
    numeroInvertido += (numeroDeTresDigitos % 10) * 100;

    // Usar una estructura de seleccion simple para asignar valor a la salida
    if (numeroDeTresDigitos == numeroInvertido) {
      mensaje = " es capicúa";
    }

    // Mostramos la salida
    System.out.println("El número " + numeroDeTresDigitos + mensaje);
  }
}
