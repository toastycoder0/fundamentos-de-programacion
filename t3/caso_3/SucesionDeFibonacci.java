// Caso de estudio 3
// Sucesión de fibonacci
public class SucesionDeFibonacci {
  public static void main(String[] args) {
    // Declaración de variables de entrada
    int terminoUno;
    int terminoDos;
    int repeticiones;

    // Declaración de la variable de salida
    String sucecion;

    // Asignamos valores a las variables de entrada
    terminoUno = 0;
    terminoDos = 1;
    repeticiones = 5;

    // Inicializo mi variable de salida
    sucecion = terminoUno + "\n" + terminoDos + "\n";

    for (int iterador = 0; iterador <= repeticiones; iterador++) {
      // Actualizo los valores de mis variables de entrada
      terminoDos += terminoUno;
      terminoUno = terminoDos - terminoUno;

      // Asigno valor a mi salida
      sucecion += terminoDos + "\n";
    }

    // Muestro mi salida
    System.out.println(sucecion);
  }
}
