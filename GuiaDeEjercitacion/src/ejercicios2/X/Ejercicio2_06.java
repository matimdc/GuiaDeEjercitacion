package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_06
{
    /* Dada la cantidad de alumnos de un curso y la cantidad de sillas disponibles,
       la computadora indica si alcanzan las sillas, en caso contrario, 
       indica cuántas faltan para que todo el alumnado tenga asiento. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int cantidadDeAlumnos;
        int cantidadDeSillas;
        int diferencia;
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidadDeAlumnos = entrada.nextInt();
        System.out.print("Ingrese la cantidad de sillas: ");
        cantidadDeSillas = entrada.nextInt();
        diferencia = cantidadDeAlumnos - cantidadDeSillas;
        if (diferencia <= 0)
        {
            System.out.println("Alcanzan las sillas.");
        }
        else
        {
            System.out.println("No alcanzan las sillas. Faltan " + diferencia);
        }
    }

}
