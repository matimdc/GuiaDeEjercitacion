package ejercicios2.X;

import java.util.Scanner;

public class Ejercicio2_03
{
    /* Se ingresan dos números enteros. La computadora muestra su cociente entero. 
       Si hubiere resto, mostrarlo en otra línea. */
    
    /* El programa fallará si se ingresa un cero o cualquier valor no entero */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        int cociente;
        int resto;
        System.out.print("Ingrese primer número: ");
        primerNumero = entrada.nextInt();
        System.out.print("Ingrese segundo número: ");
        segundoNumero = entrada.nextInt();
        cociente = primerNumero / segundoNumero;
        resto = primerNumero - (cociente * segundoNumero);
        System.out.println("El cociente entero es " + cociente);
        if ( resto > 0 )
        {
            System.out.println("El resto es " + resto);
        }
    }

}
