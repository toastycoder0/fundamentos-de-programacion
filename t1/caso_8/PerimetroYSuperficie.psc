// Caso de estudio 8
// Calcular el per�metro y la superficie de un rect�ngulo
Algoritmo PerimetroYSuperficie
	// Definimos las variables de entrada
	Definir base Como Entero
	Definir altura Como Entero
	
	// Definimos las variables de salida
	Definir superficie Como Real
	Definir perimetro Como Real
	
	// Asignamos valores iniciales a las variables de entrada
	base <- 20
	altura <- 30
	
	// Inicializamos las variables de salida
	superficie <- 0
	perimetro <- 0
	
	// Asignamos valor a las variables de salida
	// Calculamos la superficie del rect�ngulo
	superficie <- base * altura
	// Calculamos el per�metro del rect�ngulo
	perimetro <- 2 * (base + altura)
	
	// Mostramos las variables de salida
	Escribir "El per�metro del rect�ngulo es de ", perimetro, " y su superficie es de ", superficie
FinAlgoritmo
