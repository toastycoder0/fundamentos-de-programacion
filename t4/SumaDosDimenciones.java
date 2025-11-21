public class SumaDosDimenciones {
  public static String sumarArreglos(int[][] primerArreglo, int[][] segundoArreglo) {
    String message;

    message = "";

    for (int indice = 0; indice < primerArreglo.length; indice++) {
      for (int subIndice = 0; subIndice < primerArreglo[indice].length; subIndice++) {
        message += "La suma de " + primerArreglo[indice][subIndice] + " más " + segundoArreglo[indice][subIndice]
            + " es "
            + (primerArreglo[indice][subIndice] + segundoArreglo[indice][subIndice]) + "\n";
      }
    }

    return message;
  }

  public static void main(String[] args) {
    int primerArreglo[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    int segundoArreglo[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

    System.out.println(sumarArreglos(primerArreglo, segundoArreglo));
  }
}
