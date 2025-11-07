// Caso de estudio 3
// Fibonacci
public class Fibonacci {
  public static void main(String[] args) {
    // Declaramos las variables de E
    int primerNumero;
    int segundoNumero;
    int numeroDeRepeticiones;

    // Declaramos la variable de S
    String sucesion;

    // Declaramos variables auxiliares para guardar el segundo numero y alternar con
    // la suma
    boolean realizamosSuma;
    int numeroIntermedio;

    // Inicializamos E
    primerNumero = 0;
    segundoNumero = 1;
    numeroDeRepeticiones = 10;

    // Inicializamos S con un valor por defecto
    sucesion = primerNumero + " " + segundoNumero;

    // Inicializamos la variables auxiliares con un valor por defecto
    realizamosSuma = true;
    numeroIntermedio = 0;

    for (int repeticion = 2; repeticion < numeroDeRepeticiones; repeticion++) {
      // Verificamos que operacion tenemos que realizar y asignamos valor al auxiliar
      if (realizamosSuma) {
        numeroIntermedio = primerNumero + segundoNumero;
      } else {
        numeroIntermedio = primerNumero - segundoNumero;
      }

      // Adjuntamos el siguiente numero a la sucesion
      sucesion += " " + numeroIntermedio;

      // Asignamos el segundo numero al primero
      primerNumero = segundoNumero;
      // Usamos el auxiliar para obtener el siguiente numero
      segundoNumero = numeroIntermedio;
      // Alternamos la operacion en el siguiente ciclo
      realizamosSuma = !realizamosSuma;
    }

    System.out.println("Serie Fibonacci:");
    System.out.println(sucesion);
  }
}
