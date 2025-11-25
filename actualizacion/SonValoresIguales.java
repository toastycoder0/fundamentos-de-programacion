public class SonValoresIguales {
  public static String compararArreglos(int arregloUnoIngresado[][], int arregloDosIngresado[][]) {
    // Definimos las variables de entrada
    int arregloUno[][];
    int arregloDos[][];

    // Definimos la variable de salida
    String mensaje;

    // Asignamos valor a las entradas
    arregloUno = arregloUnoIngresado;
    arregloDos = arregloDosIngresado;

    // Inicializamos las variables de entrada
    mensaje = "";

    // Recorremos el arreglo para comparar los valores
    for (int subIndice = 0; subIndice < arregloUno[0].length; subIndice++) {
      for (int indice = 0; indice < arregloUno.length; indice++) {
        mensaje += "en f" + indice + " c" + subIndice + " " + arregloUno[indice][subIndice] + " "
            + arregloDos[indice][subIndice];

        if (arregloUno[indice][subIndice] != arregloDos[indice][subIndice]) {
          mensaje += " diferentes\n";
        } else {
          mensaje += " iguales\n";
        }
      }
    }

    // Devolvemos la variable de salida
    return mensaje;
  }

  public static void main(String[] args) {
    int arregloUno[][] = { { 1, 1 }, { 1, 2 } };
    int arregloDos[][] = { { 1, 2 }, { 1, 3 } };

    // Mostramos la salida
    System.out.println(compararArreglos(arregloUno, arregloDos));
  }
}
