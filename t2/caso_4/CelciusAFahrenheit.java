// Caso de estudio 4
// Convertir de grados Celsius a grados Fahrenheit
public class CelciusAFahrenheit {
  public static void main(String[] args) {
    // Definimos la variable de entrada "celcius"
    int celcius;

    // Definimos la variable de salida "fahrenheit"
    float fahrenheit;

    // Asignamos un valor inicial a la variable de entrada "celcius"
    celcius = 20;

    // Inicializamos la variable de salida "fahrenheit"
    fahrenheit = 0;

    // Asignamos valor a la variable de salida "fahrenheit"
    // Realizamos la conversión de Celsius a Fahrenheit
    fahrenheit = celcius * 1.8f + 32;

    // Mostramos la variable de salida "fahrenheit"
    System.out.println(celcius + " grados °C equivalen a " + fahrenheit + " °F");
  }
}
