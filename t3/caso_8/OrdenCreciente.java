// Caso de estudio 8
// Orden creciente
public class OrdenCreciente {
  public static void main(String[] args) {
    // Declaramos las variables de entrada
    int numeroUno;
    int numeroDos;
    int numeroTres;

    // Declaramos la variable de salida
    String mensaje;

    // Asignamos valores a las variables de entrada
    numeroUno = 1;
    numeroDos = 2;
    numeroTres = 3;

    // Inicializamos la variable de salida (con un valor por defecto)
    mensaje = " no hay orden establecido";

    // Usamos una estructura de seleccion simple para evaluar si el orden es
    // creciente
    if (numeroUno < numeroDos && numeroDos < numeroTres) {
      // Asignamos valor a la variable de salida
      mensaje = " el orden es creciente";
    }

    // Usamos una estructura de seleccion simple para evaluar si el orden es
    // descendente
    if (numeroUno > numeroDos && numeroDos > numeroTres) {
      // Asignamos valor a la variable de salida
      mensaje = " el orden es descendente";
    }

    // Mostramos la salida
    System.out.println("En los números " + numeroUno + ", " + numeroDos + " y " + numeroTres + mensaje);
  }
}
