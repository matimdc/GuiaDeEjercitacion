package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_04
{
    /* Dado el valor del radio de una circunferencia, la computadora muestra el valor
       de su superficie y su perímetro. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int radio;
        double superficie;
        double perimetro;
        System.out.print("Ingrese valor del radio de la circunferencia: ");
        radio = entrada.nextInt();
        superficie = Math.PI * radio * radio; // PI por radio al cuadrado
        perimetro = 2 * Math.PI * radio; // 2 PI por radio
        System.out.println("La superficie es " + superficie);
        System.out.println("El perímetro es " + perimetro);
    }

}
