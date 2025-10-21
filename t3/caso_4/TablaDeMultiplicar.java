// Caso de estudio 4
// Tabla de multiplicar
public class TablaDeMultiplicar {
  public static void main(String[] args) {
    // Declaramos la variable de entrada
    int numeroDeTabla;

    // Declaramos la variable de salida
    int resultado;

    // Asignamos valor a la entrada
    numeroDeTabla = 2;

    // Inicializamos la salida
    resultado = 0;

    // Realizamos nuestro ciclo empezando desde 1 hasta 10 aumentando en 1
    // El multiplicador es un conjunto de {1,2,3...10}
    for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
      // Asigno valor a mi salida
      resultado = multiplicador * numeroDeTabla;

      // Mostramos la salida
      System.out.println(numeroDeTabla + " x " + multiplicador + " = " + resultado);
    }
  }
}
