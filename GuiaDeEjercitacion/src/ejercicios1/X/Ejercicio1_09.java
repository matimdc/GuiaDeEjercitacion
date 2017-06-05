package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_09
{
    /* Dado un tiempo en segundos, la computadora lo muestra expresado en días,
       horas, minutos y segundos. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int cantSegundos;
        int cantDias;
        int cantHoras;
        int cantMinutos;
        System.out.print("Ingrese tiempo en segundos: ");
        cantSegundos = entrada.nextInt();
        cantDias = cantSegundos / 86400;
	cantSegundos = cantSegundos % 86400;
	cantHoras =  cantSegundos / 3600;
	cantSegundos = cantSegundos % 3600;
	cantMinutos = cantSegundos / 60;
	cantSegundos = cantSegundos % 60;
        System.out.println("El equivalente son: ");
        System.out.println(cantDias + " días.");
        System.out.println(cantHoras + " horas.");
        System.out.println(cantMinutos + " minutos.");
        System.out.println(cantSegundos + " segundos.");
    }

}
