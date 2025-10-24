// Caso de estudio 3
// Obtener las decenas y unidades de un n�mero entero de 2 d�gitos
Algoritmo NumeroEnteroDosDigitos
	// Definimos la variable de entrada
	Definir numeroEntero Como Entero
	
	// Definimos las variables de salida
	Definir decenas Como Entero
	Definir unidades Como Entero
	
	// Asignamos un valor inicial a la variable de entrada
	numeroEntero <- 23
	
	// Inicializamos las variables de salida
	decenas <- 0
	unidades <- 0
	
	// Asignamos valor a las variables de salida
	// Calculamos las decenas dividiendo el n�mero entre 10
	decenas <- trunc(numeroEntero / 10)
	// Calculamos las unidades obteniendo el residuo de la divisi�n entre 10
	unidades <- numeroEntero % 10
	
	// Mostramos las variables de salida
	Escribir "El n�mero ", numeroEntero, " tiene ", decenas, " decena(s) y ", unidades, " unidad(es)"
FinAlgoritmo
