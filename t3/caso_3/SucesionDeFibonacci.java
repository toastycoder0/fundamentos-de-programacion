// Caso de estudio 3
// Sucesión de fibonacci
public class SucesionDeFibonacci {
  public static void main(String[] args) {
    // Declaración de variables de entrada
    int terminoUno;
    int terminoDos;
    int repeticiones;

    // Declaración de la variable auxiliar
    int terminoAuxiliar;

    // Declaración de la variable de salida
    String sucecion;

    // Asignamos valores a las variables de entrada
    terminoUno = 8;
    terminoDos = 9;
    repeticiones = 10;

    // Inicializo mi variable auxiliar
    terminoAuxiliar = 0;

    // Inicializo mi variable de salida
    sucecion = terminoUno + " " + terminoDos;

    for (int iterador = 2; iterador < repeticiones; iterador++) {
      // Asigno valor a mi variable intermedia
      terminoAuxiliar = terminoDos;

      // Actualizo el valor del terminoDos
      if (iterador % 2 == 0) {
        terminoDos += terminoUno;
      } else {
        terminoDos = terminoUno - terminoDos;
      }

      // Actualizo el valor del terminoUno
      terminoUno = terminoAuxiliar;

      // Asigno valor a mi salida
      sucecion += " " + terminoDos;
    }

    // Muestro mi salida
    System.out.println(sucecion);
  }
}
