// Caso de estudio 3
// Sucesión de Fibonacci
public class SucesionDeFibonacci {
  public static void main(String[] args) {
    // Declaración de variables de entrada
    int terminoUno;
    int terminoDos;
    int repeticiones;

    // Declaración de la variable auxiliar
    int terminoAuxiliar;

    // Declaración de la variable de salida
    String sucesion;

    // Asignamos valores a las variables de entrada
    terminoUno = 8;
    terminoDos = 9;
    repeticiones = 10;

    // Inicializo mi variable auxiliar
    terminoAuxiliar = 0;

    // Inicializo mi variable de salida
    sucesion = terminoUno + " " + terminoDos;

    // Uso un ciclo para mostrar los siguientes terminos de la sucesion
    for (int iterador = 3; iterador <= repeticiones; iterador++) {
      // Asigno valor a mi variable auxiliar
      terminoAuxiliar = terminoDos;

      // Actualizo el valor del terminoDos en base a una condicion
      // (alternando entre resta y suma)
      if (iterador % 2 == 0) {
        terminoDos += terminoUno;
      } else {
        terminoDos = terminoUno - terminoDos;
      }

      // Actualizo el valor del terminoUno
      terminoUno = terminoAuxiliar;

      // Asigno valor a mi salida
      sucesion += " " + terminoDos;
    }

    // Muestro mi salida
    System.out.println(sucesion);
  }
}
