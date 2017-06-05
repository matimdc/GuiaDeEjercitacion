package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_04
{
    /* Dados el valor del radio de un círculo cuyo centro está ubicado en (0;0) 
       y dadas las coordenadas (x;y) de un punto, la computadora informa si el
       punto pertenece o no al círculo. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int radio;
        int x;
        int y;
        double hipotenusa;
        System.out.print("Ingrese radio del círculo: ");
        radio = entrada.nextInt();
        System.out.print("Ingrese coordenada X: ");
        x = entrada.nextInt();
        System.out.print("Ingrese coordenada Y: ");
        y = entrada.nextInt();
        hipotenusa = Math.sqrt(x * x + y * y);
        if ( hipotenusa <= radio )
        {
            System.out.println("El punto (" + x + ";" + y + ") pertenece al círculo");
        }
        else
        {
            System.out.println("El punto (" + x + ";" + y + ") NO pertenece al círculo");
        }
    }

}
