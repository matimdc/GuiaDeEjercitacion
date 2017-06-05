package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_09
{

    /* Los tres lados a, b y c de un triángulo deben satisfacer la desigualdad triangular: 
       cada uno de los lados no puede ser más largo que la suma de los otros dos.
       Escriba un programa que reciba como entrada los tres lados de un triángulo, e indique: 
       si acaso el triángulo es inválido; y, si no lo es, qué tipo de triángulo es (equilátero, isósceles o escaleno). */

    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Ingrese primer lado: ");
        a = entrada.nextInt();
        System.out.print("Ingrese segundo lado: ");
        b = entrada.nextInt();
        System.out.print("Ingrese tercer lado: ");
        c = entrada.nextInt();
        if ((a < b + c) && (b < a + c) && (c < a + c))
        {
            // Si se cumple, es un triángulo válido
            System.out.print("El triángulo es válido");
            if (a == b && b == c)
            {
                System.out.print("El triángulo es equilátero");
            }
            else if (a == b || b == c || a == c)
            {
                System.out.print("El triángulo es isósceles");
            }
            else
            {
                System.out.print("El triángulo es escaleno");
            }
        }
        else
        {
            // No se cumplió. Es un triángulo inválido
            System.out.print("El triángulo NO es válido");
        }

    }

}
