public class EnteroTextoUnaDimencion {
  public static String enteroATexto(int[] numeros) {
    String letras[] = { "A", "E", "I", "O", "U", "R", "X", "L", "H" };
    String mensaje;

    mensaje = "";

    for (int indice = 0; indice < numeros.length; indice++) {
      mensaje += letras[numeros[indice]];
    }

    return mensaje;
  }

  public static void main(String[] args) {
    int numeros[] = { 8, 3, 7, 0 };

    System.out.println(enteroATexto(numeros));
  }
}
