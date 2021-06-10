import java.util.*;
public class Ejercicio6{
	public static void main (String []args ){

		
            int totalmenores=0, totalmayores=0;
            int cantidadmayores=0, cantidadmenores=0;
            
            Scanner entrada = new Scanner(System.in);
            
            for (int i = 0; i < 100; i++) {
                int edad = (int)(Math.random()*90+0);
                System.out.println("Edad "+(i+1)+" ="+ edad);
                if (edad >= 25) {
                    totalmayores = totalmayores + edad;
                    cantidadmayores = cantidadmayores+1;
                }else
                    if (edad < 25) {
                    totalmenores = totalmenores + edad;
                    cantidadmenores = cantidadmenores + 1; 
                }
            }
            System.out.println("El Promedio de edades mayor a 25 años es "+totalmayores/cantidadmayores);
            System.out.println("El Promedio de edades menor a 25 años es "+totalmenores/cantidadmenores);
  
        }
}
