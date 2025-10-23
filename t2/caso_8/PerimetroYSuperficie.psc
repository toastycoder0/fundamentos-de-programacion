// Caso de estudio 8
// Calcular el perímetro y la superficie de un rectángulo
Algoritmo PerimetroYSuperficie
	// Definimos las variables de entrada "base" y "altura"
	Definir base Como Entero
	Definir altura Como Entero
	
	// Definimos las variables de salida "superficie" y "perimetro"
	Definir superficie Como Real
	Definir perimetro Como Real
	
	// Asignamos valores iniciales a las variables de entrada "base" y "altura"
	base <- 20
	altura <- 30
	
	// Inicializamos las variables de salida "superficie" y "perimetro"
	superficie <- 0
	perimetro <- 0
	
	// Asignamos valor a las variables de salida "superficie" y "perimetro"
	// Calculamos la superficie del rectángulo
	superficie <- base * altura
	// Calculamos el perímetro del rectángulo
	perimetro <- 2 * (base + altura)
	
	// Mostramos las variables de salida "superficie" y "perimetro"
	Escribir "El perímetro del rectángulo es de ", perimetro, " y su superficie es de ", superficie
FinAlgoritmo
