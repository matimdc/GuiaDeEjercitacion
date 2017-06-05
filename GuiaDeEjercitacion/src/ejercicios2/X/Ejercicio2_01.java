package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_01
{
    /* Dado un número, la computadora indica si es positivo. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double numeroIngresado;
        System.out.print("Ingrese un número: ");
        numeroIngresado = entrada.nextDouble();
        if (numeroIngresado > 0)
        {
            System.out.println("El número " + numeroIngresado + " es positivo.");
        }
    }

}
