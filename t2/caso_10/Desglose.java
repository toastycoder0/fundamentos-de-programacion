// Caso de estudio 10
// Realizar el desglose de un monto total en billetes de 500, 200, 100, 50, 20 y monedas de 5, 1
public class Desglose {
  public static void main(String[] args) {
    // Definimos la variable de entrada "montoTotal"
    int montoTotal;

    // Definimos las variables de salida "cantidadDeBilletes500",
    // "cantidadDeBilletes200", "cantidadDeBilletes100", "cantidadDeBilletes50",
    // "cantidadDeBilletes20", "cantidadDeMonedas5", "cantidadDeMonedas1"
    int cantidadDeBilletes500;
    int cantidadDeBilletes200;
    int cantidadDeBilletes100;
    int cantidadDeBilletes50;
    int cantidadDeBilletes20;
    int cantidadDeMonedas5;
    int cantidadDeMonedas1;

    // Definimos la variable auxiliar "montoAuxiliar"
    int montoAuxiliar;

    // Asignamos un valor inicial a la variable de entrada "montoTotal"
    montoTotal = 1111;

    // Inicializamos la variable auxiliar con el valor de "montoTotal"
    montoAuxiliar = montoTotal;

    // Inicializamos las variables de salida "cantidadDeBilletes500",
    // "cantidadDeBilletes200", "cantidadDeBilletes100", "cantidadDeBilletes50",
    // "cantidadDeBilletes20", "cantidadDeMonedas5", "cantidadDeMonedas1"
    cantidadDeBilletes500 = 0;
    cantidadDeBilletes200 = 0;
    cantidadDeBilletes100 = 0;
    cantidadDeBilletes50 = 0;
    cantidadDeBilletes20 = 0;
    cantidadDeMonedas5 = 0;
    cantidadDeMonedas1 = 0;

    // Asignamos valores las variables de salida "cantidadDeBilletes500",
    // "cantidadDeBilletes200", "cantidadDeBilletes100", "cantidadDeBilletes50",
    // "cantidadDeBilletes20", "cantidadDeMonedas5", "cantidadDeMonedas1"
    // Calculamos la cantidad de billetes de 500
    cantidadDeBilletes500 = montoAuxiliar / 500;
    montoAuxiliar %= 500;
    // Calculamos la cantidad de billetes de 200
    cantidadDeBilletes200 = montoAuxiliar / 200;
    montoAuxiliar %= 200;
    // Calculamos la cantidad de billetes de 100
    cantidadDeBilletes100 = montoAuxiliar / 100;
    montoAuxiliar %= 100;
    // Calculamos la cantidad de billetes de 50
    cantidadDeBilletes50 = montoAuxiliar / 50;
    montoAuxiliar %= 50;
    // Calculamos la cantidad de billetes de 20
    cantidadDeBilletes20 = montoAuxiliar / 20;
    montoAuxiliar %= 20;
    // Calculamos la cantidad de monedas de 5
    cantidadDeMonedas5 = montoAuxiliar / 5;
    montoAuxiliar %= 5;
    // Calculamos la cantidad de monedas de 1
    cantidadDeMonedas1 = montoAuxiliar / 1;
    montoAuxiliar %= 1;

    // Mostramos la variable de entrada "montoTotal"
    System.out.println("El monto total es: " + montoTotal);

    // Mostramos las variables de salida salida "cantidadDeBilletes500",
    // "cantidadDeBilletes200", "cantidadDeBilletes100", "cantidadDeBilletes50",
    // "cantidadDeBilletes20", "cantidadDeMonedas5", "cantidadDeMonedas1"
    System.out.println("Billetes de 500: " + cantidadDeBilletes500);
    System.out.println("Billetes de 200: " + cantidadDeBilletes200);
    System.out.println("Billetes de 100: " + cantidadDeBilletes100);
    System.out.println("Billetes de 50: " + cantidadDeBilletes50);
    System.out.println("Billetes de 20: " + cantidadDeBilletes20);
    System.out.println("Monedas de 5: " + cantidadDeMonedas5);
    System.out.println("Monedas de 1: " + cantidadDeMonedas1);
  }
}
