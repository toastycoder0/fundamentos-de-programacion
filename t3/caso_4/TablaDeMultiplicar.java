// Caso de estudio 4
// Tabla de multiplicar
public class TablaDeMultiplicar {
  public static void main(String[] args) {
    // Declaramos la variable de entrada
    int numeroDeTabla;

    // Declaramos la variable de salida
    String tablaDeMultiplicar;

    // Asignamos valor a la entrada
    numeroDeTabla = 2;

    // Inicializamos la salida
    tablaDeMultiplicar = "Tabla de multiplicar del " + numeroDeTabla + ":\n";

    // Realizamos nuestro ciclo empezando desde 1 hasta 10 aumentando en 1
    // El multiplicador es un conjunto de {1,2,3...10}
    for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
      // Asigno valor a mi salida
      tablaDeMultiplicar += numeroDeTabla + " x " + multiplicador + " = " + numeroDeTabla * multiplicador + "\n";
    }

    // Mostramos la salida
    System.out.println(tablaDeMultiplicar);
  }
}
