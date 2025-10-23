// Caso de estudio 5
// Calcular el resultado de la expresión ((a + b)^3)/3
Algoritmo CalcularExpresion
	// Definimos las variables de entrada "a" y "b"
	Definir a Como Entero
	Definir b Como Entero
	
	// Definimos la variable de salida "resultado"
	Definir resultado Como Real
	
	// Asignamos valores iniciales a las variables de entrada "a" y "b"
	a <- 10
	b <- 5
	
	// Inicializamos la variable de salida "resultado"
	resultado <- 0
	
	// Asignamos valor a la variable de salida "resultado"
	// Calculamos el resultado de la expresión ((a + b)^3)/3
	resultado <- ((a + b) * (a + b) * (a + b)) / 3
	
	// Mostramos la variable de salida "resultado"
	Escribir "El resultado de ((a + b)^3)/3 es: ", resultado
FinAlgoritmo
