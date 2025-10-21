// Caso de estudio 7
// Convertir número entero al cuadrado y al cubo
public class CuadradoYCubo {
  public static void main(String[] args) {
    // Definimos la variable de entrada "numeroEntero"
    int numeroEntero;

    // Definimos las variables de salida "numeroAlCuadrado" y "numeroAlCubo"
    int numeroAlCuadrado;
    int numeroAlCubo;

    // Asignamos un valor inicial a la variable de entrada "numeroEntero"
    numeroEntero = 2;

    // Inicializamos las variables de salida "numeroAlCuadrado" y "numeroAlCubo"
    numeroAlCuadrado = 0;
    numeroAlCubo = 0;

    // Asignamos valor a las variables de salida "numeroAlCuadrado" y "numeroAlCubo"
    // Calculamos el cuadrado y el cubo del número entero
    numeroAlCuadrado = numeroEntero * numeroEntero;
    numeroAlCubo = numeroEntero * numeroEntero * numeroEntero;

    // Mostramos las variables de salida "numeroAlCuadrado" y "numeroAlCubo"
    System.out.println("El número " + numeroEntero + " es " + numeroAlCuadrado + " al elevarlo al cuadrado y "
        + numeroAlCubo + " al elevarlo al cubo");

  }
}
