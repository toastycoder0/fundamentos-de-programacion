// Caso de estudio 10
// Realizar el desglose de un monto total en billetes de 500, 200, 100, 50, 20 y monedas de 5, 1
Algoritmo Desglose
	// Definimos la variable de entrada
	Definir montoTotal Como Entero
	
	// Definimos las variables de salida
	Definir cantidadDeBilletes500 Como Entero
	Definir cantidadDeBilletes200 Como Entero
	Definir cantidadDeBilletes100 Como Entero
	Definir cantidadDeBilletes50 Como Entero
	Definir cantidadDeBilletes20 Como Entero
	Definir cantidadDeMonedas5 Como Entero
	Definir cantidadDeMonedas1 Como Entero
	
	// Definimos la variable auxiliar
	Definir montoAuxiliar Como Entero
	
	// Asignamos un valor inicial a la variable de entrada
	montoTotal <- 1111
	
	// Inicializamos la variable auxiliar con el valor de la variable de entrada
	montoAuxiliar <- montoTotal
	
	// Inicializamos las variables de salida
	cantidadDeBilletes500 <- 0
	cantidadDeBilletes200 <- 0
	cantidadDeBilletes100 <- 0
	cantidadDeBilletes50 <- 0
	cantidadDeBilletes20 <- 0
	cantidadDeMonedas5 <- 0
	cantidadDeMonedas1 <- 0
	
	// Asignamos valores las variables de salida
	// Calculamos la cantidad de billetes de 500
	cantidadDeBilletes500 <- trunc(montoAuxiliar / 500)
	montoAuxiliar <- montoAuxiliar % 500
	// Calculamos la cantidad de billetes de 200
	cantidadDeBilletes200 <- trunc(montoAuxiliar / 200)
	montoAuxiliar <- montoAuxiliar % 200
	// Calculamos la cantidad de billetes de 100
	cantidadDeBilletes100 <- trunc(montoAuxiliar / 100)
	montoAuxiliar <- montoAuxiliar % 100
	// Calculamos la cantidad de billetes de 50
	cantidadDeBilletes50 <- trunc(montoAuxiliar / 50)
	montoAuxiliar <- montoAuxiliar % 50
	// Calculamos la cantidad de billetes de 20
	cantidadDeBilletes20 <- trunc(montoAuxiliar / 20)
	montoAuxiliar <- montoAuxiliar % 20
	// Calculamos la cantidad de monedas de 5
	cantidadDeMonedas5 <- trunc(montoAuxiliar / 5)
	montoAuxiliar <- montoAuxiliar % 5	
	// Calculamos la cantidad de monedas de 1
	cantidadDeMonedas1 <- trunc(montoAuxiliar / 1)
	montoAuxiliar <- montoAuxiliar % 1
	
	// Mostramos la variable de entrada
	Escribir "El monto total es: ", montoTotal
	
	// Mostramos las variables de salida salida
	Escribir "Billetes de 500: ", cantidadDeBilletes500
	Escribir "Billetes de 200: ", cantidadDeBilletes200
	Escribir "Billetes de 100: ", cantidadDeBilletes100
	Escribir "Billetes de 50: ", cantidadDeBilletes50
	Escribir "Billetes de 20: ", cantidadDeBilletes20
	Escribir "Monedas de 5: ", cantidadDeMonedas5
	Escribir "Monedas de 1: ", cantidadDeMonedas1
FinAlgoritmo
