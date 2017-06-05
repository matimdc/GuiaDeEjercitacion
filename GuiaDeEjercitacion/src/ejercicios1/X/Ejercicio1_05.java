package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_05
{
    /* Dados dos valores para cada cateto de un triángulo rectángulo, la computadora
       calcula y muestra el valor de la hipotenusa. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int primerCateto;
        int segundoCateto;
        double hipotenusa;
        System.out.print("Ingrese valor del primer cateto: ");
        primerCateto = entrada.nextInt();
        System.out.print("Ingrese valor del segundo cateto: ");
        segundoCateto = entrada.nextInt();
        hipotenusa = Math.sqrt(primerCateto * primerCateto + segundoCateto * segundoCateto);
        System.out.println("La hipotenusa es " + hipotenusa);
    }

}
