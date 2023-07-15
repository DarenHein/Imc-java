Algoritmo CalcularIMC
	Definir peso Como Real
	Definir altura Como Real
	Definir imc Como Real
	Escribir '----- Calculadora de IMC -----'
	Escribir 'Ingrese su peso (en kg): '
	Leer peso
	Escribir 'Ingrese su altura (en metros): '
	Leer altura
	imc <- peso/(altura*altura)
	Escribir 'Su IMC es: ', imc
	Si imc<18.5 Entonces
		Escribir 'Bajo peso'
	FinSi
	Si imc>=18.5 Y imc<25 Entonces
		Escribir 'Peso normal'
	FinSi
	Si imc>=25 Y imc<30 Entonces
		Escribir 'Sobrepeso'
	FinSi
	Si imc>=30 Entonces
		Escribir 'Obesidad'
	FinSi
FinAlgoritmo
