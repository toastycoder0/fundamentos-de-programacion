// Caso de estudio 5
// Serie numérica
public class SerieNumerica {
  public static void main(String[] args) {
    // Declaramos las variables de entrada
    int inicio;
    int fin;
    int intervalo;

    // Declaramos la variable de salida
    String serie;

    // Asignamos valores a las variables de entrada
    inicio = 1;
    fin = 10;
    intervalo = 1;

    // Inicializamos la variable de salida
    serie = "";

    // Usamos un bucle for para iterar sobre el rango de valores
    for (int iterador = inicio; iterador <= fin; iterador += intervalo) {
      serie += iterador + "\n";
    }

    // Mostramos la salida
    System.out.println(serie);
  }
}
