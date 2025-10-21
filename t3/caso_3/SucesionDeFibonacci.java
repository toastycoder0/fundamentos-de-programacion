// Caso de estudio 3
// Sucesión de fibonacci
public class SucesionDeFibonacci {
  public static void main(String[] args) {
    // Declaración de variables de entrada
    int terminoUno;
    int repeticiones;

    // Declaración de la variable auxiliar
    int terminoIntermedio;

    // Declaración de la variable de salida
    int terminoDos;

    // Asignamos valores a las variables de entrada
    terminoUno = 0;
    repeticiones = 5;

    // Inicializamos la variable auxiliar
    terminoIntermedio = 0;

    // Inicializamos la variable de salida
    terminoDos = 1;

    // Usamos un bucle for para iterar sobre el número de repeticiones
    for (int iterador = 0; iterador <= repeticiones; iterador++) {
      // Mostramos el valor de la variable de salida
      System.out.println(terminoDos);

      // Calculamos el siguiente valor de la sucesión
      terminoIntermedio = terminoUno + terminoDos;

      // Cambiamos el valor de la variable de entrada
      terminoUno = terminoDos;

      // Asignamos el valor de la variable intermedia a la variable de salida
      terminoDos = terminoIntermedio;
    }
  }
}
