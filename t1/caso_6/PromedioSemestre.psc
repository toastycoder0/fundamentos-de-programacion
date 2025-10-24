// Caso de estudio 6
// Calcular el promedio de un semestre
Algoritmo PromedioSemestre
	// Definimos las variables de entrada
	Definir matricula Como Caracter
	Definir calculo Como Real
	Definir etica Como Real
	Definir matematicas Como Real
	Definir investigacion Como Real
	Definir fundamentos Como Real
	
	// Definimos la variable de salida
	Definir promedio Como Real
	
	// Asignamos valores iniciales a las variables de entrada
	matricula <- "232493242"
	calculo <- 70
	etica <- 90
	matematicas <- 80
	investigacion <- 70
	fundamentos <- 80
	
	// Inicializamos la variable de salida
	promedio <- 0
	
	// Asignamos valor a la variable de salida
	// Calculamos el promedio sumando las calificaciones y dividiendo entre el n�mero de materias
	promedio <- (calculo + etica + matematicas + investigacion + fundamentos) / 5
	
	// Mostramos la variable de salida
	Escribir "El alumno con matr�cula ", matricula, " tiene un promedio de ", promedio
FinAlgoritmo
