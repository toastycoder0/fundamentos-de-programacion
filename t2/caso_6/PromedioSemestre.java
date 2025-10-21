// Caso de estudio 6
// Calcular el promedio de un semestre
public class PromedioSemestre {
  public static void main(String[] args) {
    // Definimos la variable de entrada "matricula", "calculo", "etica",
    // "matematicas", "investigacion" y "fundamentos"
    String matricula;
    float calculo;
    float etica;
    float matematicas;
    float investigacion;
    float fundamentos;

    // Definimos la variable de salida "promedio"
    float promedio;

    // Asignamos valores iniciales a las variables de entrada "matricula",
    // "calculo", "etica", "matematicas", "investigacion" y "fundamentos"
    matricula = "232493242";
    calculo = 70;
    etica = 90;
    matematicas = 80;
    investigacion = 70;
    fundamentos = 80;

    // Inicializamos la variable de salida "promedio"
    promedio = 0;

    // Asignamos valor a la variable de salida "promedio"
    // Calculamos el promedio sumando las calificaciones y dividiendo entre el
    // número de materias
    promedio = (calculo + etica + matematicas + investigacion + fundamentos) / 5;

    // Mostramos la variable de salida "promedio"
    System.out.println("El alumno con matrícula " + matricula + " tiene un promedio de " + promedio);
  }
}
