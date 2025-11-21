public class EsBinarioDosDimenciones {
  public static String esBinario(int[][] numeros) {
    String mensaje;

    mensaje = "";

    for (int indice = 0; indice < numeros.length; indice++) {
      for (int subIndice = 0; subIndice < numeros[indice].length; subIndice++) {
        mensaje += "El número " + numeros[indice][subIndice];

        if (numeros[indice][subIndice] == 0 || numeros[indice][subIndice] == 1) {
          mensaje += " sí es dígito binario\n";
        } else {
          mensaje += " no es dígito binario\n";
        }
      }
    }

    return mensaje;
  }

  public static void main(String[] args) {
    int numeros[][] = { { 1, 2, 3, 0 }, { 1, 0, 0, 2, 1 }, { 2, 6, 8, 0 } };
    System.out.println(esBinario(numeros));
  }
}
