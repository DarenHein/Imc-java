Algoritmo CalcularIMC
	
	Definir peso como real
	Definir altura como real
	Definir imc como real
	
	Escribir "----- Calculadora de IMC -----"
	Escribir "Ingrese su peso (en kg): "
	Leer peso
	Escribir "Ingrese su altura (en metros): "
	Leer altura
	
	imc <- peso / (altura * altura)
	
	Escribir "Su IMC es: ", imc
	
	Si imc < 18.5 entonces
		Escribir "Bajo peso"
	FinSi
	
	Si imc >= 18.5 Y imc < 25 entonces
		Escribir "Peso normal"
	FinSi
	
	Si imc >= 25 Y imc < 30 entonces
		Escribir "Sobrepeso"
	FinSi
	
	Si imc >= 30 entonces
		Escribir "Obesidad"
	FinSi
	
FinAlgoritmo
