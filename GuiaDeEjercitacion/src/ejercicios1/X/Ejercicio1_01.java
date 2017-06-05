package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_01
{
    /* Ingresar un número y que la computadora muestre su opuesto y su inverso */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numeroIngresado;
        int opuesto;
        double inverso;
        System.out.print("Ingrese un número: ");
        numeroIngresado = entrada.nextInt();
        opuesto = numeroIngresado * -1;
        inverso = 1.0 / numeroIngresado;
        System.out.println("El opuesto es " + opuesto);
        System.out.println("El inverso es " + inverso);
    }

}
