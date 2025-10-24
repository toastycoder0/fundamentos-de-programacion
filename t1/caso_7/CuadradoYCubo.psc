// Caso de estudio 7
// Convertir n�mero entero al cuadrado y al cubo
Algoritmo CuadradoYCubo
	// Definimos la variable de entrada
	Definir numeroEntero Como Entero
	
	// Definimos las variables de salida
	Definir numeroAlCuadrado Como Entero
	Definir numeroAlCubo Como Entero
	
	// Asignamos un valor inicial a la variable de entrada
	numeroEntero <- 2
	
	// Inicializamos las variables de salida
	numeroAlCuadrado <- 0
	numeroAlCubo <- 0
	
	// Asignamos valor a las variables de salida
	// Calculamos el cuadrado y el cubo del n�mero entero
	numeroAlCuadrado <- numeroEntero * numeroEntero
	numeroAlCubo <- numeroEntero * numeroEntero * numeroEntero
	
	// Mostramos las variables de salida
	Escribir "El n�mero ", numeroEntero, " es ", numeroAlCuadrado, " al elevarlo al cuadrado y ", numeroAlCubo, " al elevarlo al cubo"
FinAlgoritmo
