package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_08
{
    /* Dados dos números enteros, la computadora indica si el mayor es divisible por el menor. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        System.out.print("Ingrese primer número: ");
        primerNumero = entrada.nextInt();
        System.out.print("Ingrese segundo número: ");
        segundoNumero = entrada.nextInt();
        if ( primerNumero >= segundoNumero )
        {
            if (primerNumero % segundoNumero == 0) 
            {
                System.out.println(primerNumero + " es divisible por " + segundoNumero);
            }
        }
	else
        {
            if (segundoNumero % primerNumero == 0) 
            {
                System.out.println(segundoNumero + " es divisible por " + primerNumero);
            }
        }
	
    }

}
