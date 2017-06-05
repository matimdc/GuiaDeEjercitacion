package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_08
{
    /* Dada una temperatura en grados centígrados, la computadora la muestra en
       grados Fahrenheit. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int tempCentigrados;
        double tempFahrenheit;
        System.out.print("Ingrese valor de la temperatura en grados centígrados: ");
        tempCentigrados = entrada.nextInt();
        tempFahrenheit = tempCentigrados * 1.8 + 32;
        System.out.println("El equivalente son " + tempFahrenheit + "º F");
    }

}
