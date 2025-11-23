public class ArreglosIgualesUnaDimencion {
  public static String compararArreglos(int[] arregloUno, int[] arregloDos) {
    String message;

    message = "Los arreglos son iguales";

    if (arregloUno.length != arregloDos.length) {
      message = "Los arreglos son diferentes";
    } else {
      for (int indice = 0; indice < arregloUno.length; indice++) {
        if (arregloUno[indice] != arregloDos[indice]) {
          message = "Los arreglos son diferentes";
          break;
        }
      }
    }

    return message;
  }

  public static void main(String[] args) {
    int arregloUno[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int arregloDos[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

    System.out.println(compararArreglos(arregloUno, arregloDos));
  }
}
