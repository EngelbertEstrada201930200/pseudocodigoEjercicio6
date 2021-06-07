Algoritmo promedio_edades
	Definir  mayores, menores, edades, suma1, suma2 Como Entero
	definir promMayor, promMenor Como Real
	
	mayores = 0
	menores = 0


	Para i=1 Hasta 10 Con Paso 1 Hacer
		edades = Aleatorio(1,10)
		Escribir edades
		
		Si edades >= 5 Entonces
			mayores = mayores+edades
			suma1= suma1+1
			
		SiNo
			menores = menores+edades
			suma2=suma2+1
		Fin Si
		
		
	Fin Para
	
	
	Escribir " el promedio de edades mayor a 25 es "  mayores/suma1
	Escribir " El promedio de edades menores a 25 es " menores/suma2
FinAlgoritmo 
