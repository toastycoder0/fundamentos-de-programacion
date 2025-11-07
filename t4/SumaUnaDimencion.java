public class SumaUnaDimencion {
  public static void main(String[] args) {
    int primerArregloDeNumeros[] = { 10, 5, 1, 8, 9 };
    int segundoArregloDeNumeros[] = { 9, 8, 1, 5, 10 };

    String message;

    message = "";

    for (int indice = 0; indice < primerArregloDeNumeros.length; indice++) {
      message += "La suma de " + primerArregloDeNumeros[indice] + " más " + segundoArregloDeNumeros[indice] + " es "
          + (primerArregloDeNumeros[indice] + segundoArregloDeNumeros[indice]) + "\n";
    }

    System.out.println(message);
  }
}
