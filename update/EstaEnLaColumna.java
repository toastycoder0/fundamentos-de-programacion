public class EstaEnLaColumna {
  public static void compararDigitosConColumnas(int columnasIngresadas[][], int digitosIngresados[]) {
    // Declaramos las variables de entrada
    int columnas[][];
    int digitos[];

    // Declaramos las variables de salida
    String mensaje;

    // Declaramos la variable auxiliar
    int digitosSumados;
    int columnaSumados[] = new int[columnasIngresadas[0].length];

    // Asignamos las variables de entrada
    columnas = columnasIngresadas;
    digitos = digitosIngresados;

    // Inicializamos la variable de salida
    mensaje = "";

    // Inicializamos la variable auxiliar
    digitosSumados = 0;

    // Asignamos el valor de la variable auxiliar "digitosSumados"
    for (int indice = 0; indice < digitos.length; indice++) {
      if ((digitos[indice] % 10) > (digitos[indice] / 10)) {
        digitosSumados += digitos[indice] % 10;
      } else {
        digitosSumados += digitos[indice] / 10;
      }
    }

    // Asignamos valor la variable auxiliar "comlumnaSumados"
    for (int indice = 0; indice < columnas.length; indice++) {
      for (int subIndice = 0; subIndice < columnaSumados.length; subIndice++) {
        columnaSumados[subIndice] += columnas[indice][subIndice];
      }
    }

    // Asigno valor a la salida
    for (int indice = 0; indice < columnaSumados.length; indice++) {
      mensaje += "columna " + indice + " ";

      if (columnaSumados[indice] == digitosSumados) {
        mensaje += "si esta";
      } else {
        mensaje += "no esta";
      }

      mensaje += "\n";
    }

    // Muestro mi salida
    System.out.println(mensaje);
  }

  public static void main(String[] args) {
    int columnas[][] = {
        { 2, 4, 6 },
        { 8, 1, 1 },
        { 1, 6, 8 }
    };

    int digitos[] = { 71, 28, 91 };

    EstaEnLaColumna.compararDigitosConColumnas(columnas, digitos);
  }
}
