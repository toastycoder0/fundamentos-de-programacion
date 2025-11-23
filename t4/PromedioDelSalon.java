public class PromedioDelSalon {
  public static String calcularPromedio(int calificaciones[][]) {
    int promedios[] = new int[calificaciones.length];
    String mensaje;
    int promedio;

    mensaje = "";
    promedio = 0;

    for (int indice = 0; indice < calificaciones.length; indice++) {
      for (int subIndice = 0; subIndice < calificaciones[indice].length; subIndice++) {
        promedios[indice] += calificaciones[indice][subIndice];
      }

      promedios[indice] /= calificaciones[indice].length;
      mensaje += "El promedio del estudiante " + (indice + 1) + " es de: "
          + promedios[indice] + "\n";
    }

    for (int promedioIndice = 0; promedioIndice < promedios.length; promedioIndice++) {
      promedio += promedios[promedioIndice];
    }

    promedio /= promedios.length;

    mensaje += "El promedio general del grupo es de: " + promedio;

    return mensaje;
  }

  public static void main(String[] args) {
    int calificaciones[][] = {
        { 70, 70, 70, 70, 70 },
        { 70, 70, 70, 70, 70 },
        { 70, 70, 70, 70, 70 },
        { 70, 70, 70, 70, 70 },
        { 70, 70, 70, 70, 70 }, };

    System.out.println(PromedioDelSalon.calcularPromedio(calificaciones));
  }
}
