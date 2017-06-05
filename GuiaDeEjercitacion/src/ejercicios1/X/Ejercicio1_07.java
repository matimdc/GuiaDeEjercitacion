package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_07
{
    /* Dada la superficie de un cuadrado (en m2), la computadora muestra su perímetro */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int superficie;
        double perimetro;
        System.out.print("Ingrese valor de la superficie de un cuadrado: ");
        superficie = entrada.nextInt();
        perimetro = 4 * Math.sqrt(superficie);
        System.out.println("El perímetro es " + perimetro);
    }

}
