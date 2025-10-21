// Caso de estudio 3
// Obtener las decenas y unidades de un número entero de 2 dígitos
public class NumeroEnteroDosDigitos {
  public static void main(String[] args) {
    // Definimos la variable de entrada "numeroEntero"
    int numeroEntero;

    // Definimos las variables de salida "decenas" y "unidades"
    int decenas;
    int unidades;

    // Asignamos un valor inicial a la variable de entrada "numeroEntero"
    numeroEntero = 23;

    // Inicializamos las variables de salida "decenas" y "unidades"
    decenas = 0;
    unidades = 0;

    // Asignamos valor a las variables de salida "decenas" y "unidades"
    // Calculamos las decenas dividiendo el número entre 10
    decenas = numeroEntero / 10;
    // Calculamos las unidades obteniendo el residuo de la división entre 10
    unidades = numeroEntero % 10;

    // Mostramos las variables de salida "decenas" y "unidades"
    System.out.println("El número " + numeroEntero + " tiene " + decenas + " decena(s) y " + unidades + " unidad(es)");
  }
}
