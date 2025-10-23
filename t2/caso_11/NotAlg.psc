// caso de estudio 11 Notacion Algoritmica
Algoritmo NotAlg
	// Definir E
	Definir a Como Entero
	Definir b Como Entero
	Definir c Como Entero
	Definir d Como Entero
	// Definir S
	Definir y1 Como Real
	Definir y2 Como Real
	Definir y3 Como Real
	// Asignar a E
	a <- 5
	b <- 4
	c <- 3
	d <- 2
	// Asignar a S
	y1 <- 0
	y2 <- 0
	y3 <- 0
	// Asignar E a S
	y1 <- ((3*a-c)mod(Trunc((b^3+7)/(d+4*c))-a*b))
	y2 <- (c^4+3*b)/((d+5*a)mod 7)/(b+8*c)
	y3 <- (5*a^2+(4*a*b-c)/((d-3*b)^3))^7+5/((a+d*c)*b^2)
	// Mostrar Notacion con resultado de S
	Escribir "El resultado de: (3*a-c)mod((b^3+7)/(d+4*c))-a*b) es = " y1
	Escribir "El resultado de: (c^4+3*b)/((d+5*a)mod 7)/(b+8*c) es = " y2
	Escribir "El resultado de: (5*a^2+(4*a*b-c)/((d-3*b)^3))^7+5/((a+d*c)*b^2) es = " y3
FinAlgoritmo
