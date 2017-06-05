package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_05
{
    /* Dada la edad de una persona y su género (“F” para mujeres, “M” para hombres),
       la computadora indica si está en edad de jubilarse. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int edad;
        char genero;
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese su género ([F]emenino / [M]asculino): ");
        genero = entrada.next().charAt(0);
        if ( (genero == 'F' || genero == 'f') )
        {
            if (edad >= 60)
            {
                System.out.println("Usted está en edad de jubilarse.");
            }
        }
        else
        {
            if ( (genero == 'M' || genero == 'm') )
            {
                if (edad >= 65)
                {
                    System.out.println("Usted está en edad de jubilarse.");
                }
            }
            else
            {
                System.out.println("Caracter de género inválido");
            }
        }
        /* OTRA RESOLUCION, CON UN SOLO CONDICIONAL SIMPLE
        
        if ( ( (genero == 'F' || genero == 'f') && edad >= 60 ) || ( (genero == 'M' || genero == 'm') && edad >= 65 ) )
        {
            System.out.println("Usted está en edad de jubilarse.");
        }
        
        */
        
    }

}
