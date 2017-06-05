package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_07
{
    /* Se ingresan tres números. La computadora los muestra ordenados de menor a mayor. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Ingrese primer número: ");
        a = entrada.nextInt();
        System.out.print("Ingrese segundo número: ");
        b = entrada.nextInt();
        System.out.print("Ingrese tercer número: ");
        c = entrada.nextInt();
        System.out.print("Números en orden ascendente: ");
        if (a <= b && b <= c)
        {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b)
        {
            System.out.println(a + " " + c + " " + b);
        } else if (b <= a && a <= c)
        {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= c && c <= a)
        {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= a && a <= b)
        {
            System.out.println(c + " " + a + " " + b);
        } else
        {
            System.out.println(c + " " + b + " " + a);
        }
    }

}
