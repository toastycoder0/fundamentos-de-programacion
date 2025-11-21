public class EsBinarioUnaDimencion {
  public static String esBinario(int[] numeros) {
    String mensaje;

    mensaje = "";

    for (int indice = 0; indice < numeros.length; indice++) {
      mensaje += "El número " + numeros[indice];

      if (numeros[indice] == 0 || numeros[indice] == 1) {
        mensaje += " sí es dígito binario\n";
      } else {
        mensaje += " no es dígito binario\n";
      }
    }

    return mensaje;
  }

  public static void main(String[] args) {
    int numeros[] = { 1, 2, 3, 4, 0, 1, 5, 6, 7, 8, 9, 1, 0 };
    System.out.println(esBinario(numeros));
  }
}
