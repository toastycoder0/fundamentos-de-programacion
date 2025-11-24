public class EstaEnArreglo {
  public static String evaluarFilas(int[] filaAEncontrarEntrada, int[][] filasAEvaluarEntrada) {
    // Declarar E
    int filaAEncontrar[];
    int filasAEvaluar[][];

    // Declarar S
    String mensaje;

    // Declarar variables auxiliares
    int filaEncontrada;
    int filaEvaluada;

    // Inicializo E
    filaAEncontrar = filaAEncontrarEntrada;
    filasAEvaluar = filasAEvaluarEntrada;

    // Inicializo S
    mensaje = "";

    // Inicializo variables auxiliares
    filaEncontrada = 0;
    filaEvaluada = 0;

    // Asigno valor a filaEncontrada
    for (int indice = 0; indice < filaAEncontrar.length; indice++) {
      if ((filaAEncontrar[indice] % 10) > (filaAEncontrar[indice] / 10)) {
        filaEncontrada += filaAEncontrar[indice] / 10;
      } else {
        filaEncontrada += filaAEncontrar[indice] % 10;
      }
    }

    // Asigno valor a filaEvaluada y a la salida
    for (int indice = 0; indice < filasAEvaluar.length; indice++) {
      for (int subindice = 0; subindice < filasAEvaluar[indice].length; subindice++) {
        filaEvaluada += filasAEvaluar[indice][subindice];
      }

      mensaje += "fila " + indice + " ";

      if (filaEncontrada == filaEvaluada) {
        mensaje += "si esta\n";
      } else {
        mensaje += "no esta\n";
      }

      filaEvaluada = 0;
    }

    // Retorno S
    return mensaje;
  }

  public static void main(String[] args) {
    int filaAEncontrar[] = { 19, 62, 53 };
    int filasAEvaluar[][] = { { 2, 4, 6 }, { 8, 1, 1 }, { 1, 6, 8 } };

    // Imprimo S
    System.out.println(EstaEnArreglo.evaluarFilas(filaAEncontrar, filasAEvaluar));
  }
}
