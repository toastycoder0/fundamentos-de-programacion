public class ArreglosIguales {
  public static String compararArreglos(int[] arregloUnoInsertado, int[] arregloDosInsertado) {
    // Declaramos las variables de entrada
    int[] arregloUno;
    int[] arregloDos;

    // Declaramos la variable de salida
    String message;

    // Declaramos las variables auxiliares
    int numeroUno;
    int numeroDos;

    // Asignamos valor a las variables de entrada
    arregloUno = arregloUnoInsertado;
    arregloDos = arregloDosInsertado;

    // Inicializamos la variable de salida
    message = "";

    // Inicializamos las variables auxiliares
    numeroUno = 0;
    numeroDos = 0;

    // Asignamos valor a la salida
    for (int indice = 0; indice < arregloUno.length; indice++) {
      numeroUno = arregloUno[indice];
      numeroDos = arregloDos[arregloUno.length - indice - 1];

      message += ((numeroUno / 10) % 10) + " y " + ((numeroDos / 10) % 10);

      if (((numeroUno / 10) % 10) == ((numeroDos / 10) % 10)) {
        message += " iguales\n";
      } else {
        message += " diferentes\n";
      }
    }

    return message;
  }

  public static void main(String[] args) {
    int arregloUno[] = { 101, 222, 356 };
    int arregloDos[] = { 123, 121, 300 };

    // Mostramos la salida
    System.out.println(compararArreglos(arregloUno, arregloDos));
  }
}
