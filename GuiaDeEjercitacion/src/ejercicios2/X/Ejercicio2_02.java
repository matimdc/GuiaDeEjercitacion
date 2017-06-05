package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_02
{
    /* Dado un número entero, la computadora indica si es par o impar. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numeroIngresado;
        System.out.print("Ingrese un número: ");
        numeroIngresado = entrada.nextInt();
        if (numeroIngresado % 2 == 0)
        {
            System.out.println("El número " + numeroIngresado + " es par.");
        }
        else
        {
            System.out.println("El número " + numeroIngresado + " es impar.");
        }
    }

}
