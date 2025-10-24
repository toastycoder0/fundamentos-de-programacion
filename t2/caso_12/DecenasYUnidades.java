// Caso de estudio 12
// Decenas y unidades
public class DecenasYUnidades {
  public static void main(String[] args) {
    // Declaramos la variable de entrada
    int numeroAEvaluar;

    // Declaramos las variables de salida
    int decenasDeMillar;
    int unidadesDeMillar;
    int centenas;
    int decenas;
    int unidades;

    // Asignamos valor a la variable de entrada
    numeroAEvaluar = 1234566;

    // Inicializamos las variables de salida
    decenasDeMillar = 0;
    unidadesDeMillar = 0;
    centenas = 0;
    decenas = 0;
    unidades = 0;

    // Asignamos valor a nuestras variables de salida
    decenasDeMillar = numeroAEvaluar / 1000000;
    unidadesDeMillar = numeroAEvaluar / 100000 % 10;
    centenas = numeroAEvaluar / 10000 % 10;
    decenas = numeroAEvaluar / 1000 % 10;
    unidades = numeroAEvaluar / 100 % 10;

    // Mostramos las variables de salidas
    System.out.println(decenasDeMillar + " decenas de millar");
    System.out.println(unidadesDeMillar + " unidades de millar");
    System.out.println(centenas + " centenas");
    System.out.println(decenas + " decenas");
    System.out.println(unidades + " unidades");
  };
};
