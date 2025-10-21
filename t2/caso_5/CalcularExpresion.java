// Caso de estudio 5
// Calcular el resultado de la expresión ((a + b)^3)/3
public class CalcularExpresion {
  public static void main(String[] args) {
    // Definimos las variables de entrada "a" y "b"
    int a;
    int b;

    // Definimos la variable de salida "resultado"
    float resultado;

    // Asignamos valores iniciales a las variables de entrada "a" y "b"
    a = 10;
    b = 5;

    // Inicializamos la variable de salida "resultado"
    resultado = 0;

    resultado = ((a + b) * (a + b) * (a + b)) / 3.0f;

    // Mostramos la variable de salida "resultado"
    System.out.println("El resultado de ((a + b)^3)/3 es: " + resultado);
  }
}
