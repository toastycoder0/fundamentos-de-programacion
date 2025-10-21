// Caso de estudio 8
// Calcular el perímetro y la superficie de un rectángulo
public class PerimetroYSuperficie {
  public static void main(String[] args) {
    // Definimos las variables de entrada "base" y "altura"
    int base;
    int altura;

    // Definimos las variables de salida "superficie" y "perimetro"
    float superficie;
    float perimetro;

    // Asignamos valores iniciales a las variables de entrada "base" y "altura"
    base = 20;
    altura = 30;

    // Inicializamos las variables de salida "superficie" y "perimetro"
    superficie = 0;
    perimetro = 0;

    // Asignamos valor a las variables de salida "superficie" y "perimetro"
    // Calculamos la superficie del rectángulo
    superficie = (base * 1.0f) * altura;
    // Calculamos el perímetro del rectángulo
    perimetro = 2.0f * (base + altura);

    // Mostramos las variables de salida "superficie" y "perimetro"
    System.out.println("El perímetro del rectángulo es de " + perimetro + " y su superficie es de " + superficie);
  }
}
