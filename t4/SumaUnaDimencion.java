public class SumaUnaDimencion {
  public static String sumarArreglos(int[] primerArreglo, int[] segundoArreglo) {
    String message;

    message = "";

    for (int indice = 0; indice < primerArreglo.length; indice++) {
      message += "La suma de " + primerArreglo[indice] + " más " + segundoArreglo[indice] + " es "
          + (primerArreglo[indice] + segundoArreglo[indice]) + "\n";
    }

    return message;
  }

  public static void main(String[] args) {
    int primerArreglo[] = { 10, 5, 1, 8, 9 };
    int segundoArreglo[] = { 9, 8, 1, 5, 10 };

    System.out.println(sumarArreglos(primerArreglo, segundoArreglo));
  }
}
