package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_06
{
    /* Dadas 3 notas pertenecientes a tres trimestres distintos, la computadora
       muestra la nota promedio. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        double promedio;
        System.out.print("Ingrese valor de la primera nota: ");
        nota1 = entrada.nextInt();
        System.out.print("Ingrese valor de la segunda nota: ");
        nota2 = entrada.nextInt();
        System.out.print("Ingrese valor de la tercera nota: ");
        nota3 = entrada.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("El promedio es " + promedio);
    }

}
