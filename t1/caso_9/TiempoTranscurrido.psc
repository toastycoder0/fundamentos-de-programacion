// Caso de estudio 9
// Calcular el tiempo transcurrido entre una hora de inicio y una hora de fin
Algoritmo TiempoTranscurrido
	// Definimos las variables de entrada
	Definir horasInicio Como Entero 
	Definir minutosInicio Como Entero
	Definir segundosInicio Como Entero
	Definir horasFin Como Entero 
	Definir minutosFin Como Entero
	Definir segundosFin Como Entero
	
	// Definimos las variables de salida
	Definir horasTranscurridas Como Entero 
	Definir minutosTranscurridos Como Entero
	Definir segundosTranscurridos Como Entero
	
	// Definimos las variables auxiliares
	Definir tiempoInicialEnSegundos Como Entero
	Definir tiempoFinalEnSegundos Como Entero
	Definir tiempoTotalTranscurridoEnSegundos Como Entero
	
	// Asignamos valores a las variables de entrada
	// La hora de inicio ser� a las 15:15:10
	horasInicio <- 15
	minutosInicio <- 15
	segundosInicio <- 10
	// La hora de fin ser� a las 16:45:10
	horasFin <- 16
	minutosFin <- 45
	segundosFin <- 30
	
	// Inicializamos las variables de salida
	horasTranscurridas <- 0
	minutosTranscurridos <- 0
	segundosTranscurridos <- 0
	
	// Inicializamos las variables auxiliares
	tiempoInicialEnSegundos <- 0
	tiempoFinalEnSegundos <- 0
	tiempoTotalTranscurridoEnSegundos <- 0
	
	// Asignamos valores a las variables auxiliares
	// Calculamos el tiempo inicial en segundos, convirtiendo horas y minutos en segundos
	tiempoInicialEnSegundos <- (horasInicio * 3600) + (minutosInicio * 60) + segundosInicio
	// Calculamos el tiempo final en segundos, convirtiendo horas y minutos en segundos
	tiempoFinalEnSegundos <- (horasFin * 3600) + (minutosFin * 60) + segundosFin
	// Calculamos el tiempo total transcurrido en segundos
	tiempoTotalTranscurridoEnSegundos <- tiempoFinalEnSegundos - tiempoInicialEnSegundos
	
	// Asignamos valores a las variables de salida
	// Calculamos las horas transcurridas
	horasTranscurridas <- trunc(tiempoTotalTranscurridoEnSegundos / 3600)
	// Calculamos los minutos transcurridos, usando el resto de la divisi�n entre 3600
	minutosTranscurridos <- trunc((tiempoTotalTranscurridoEnSegundos % 3600) / 60)
	// Calculamos los segundos transcurridos, usando el resto de la divisi�n entre 60
	segundosTranscurridos <- tiempoTotalTranscurridoEnSegundos % 60
	
	// Mostramos las variables de entrada
	Escribir "La hora inicial fue ", horasInicio, ":", minutosInicio, ":", segundosInicio
	Escribir "La hora final fue ", horasFin, ":", minutosFin, ":", segundosFin
	
	// Mostramos las variables de salida
	Escribir "El tiempo transcurrido es de ", horasTranscurridas, " hora(s) ", minutosTranscurridos, " minuto(s) y ", segundosTranscurridos, " segundo(s)"
FinAlgoritmo
