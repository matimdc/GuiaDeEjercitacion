package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_03
{
    /* Dados los valores de dos de los ángulos interiores de un triángulo, la
       computadora muestra el valor del restante. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int primerAngulo;
        int segundoAngulo;
        int anguloRestante;
        System.out.print("Ingrese valor del primer ángulo: ");
        primerAngulo = entrada.nextInt();
        System.out.print("Ingrese valor del segundo ángulo: ");
        segundoAngulo = entrada.nextInt();
        anguloRestante = 180 - primerAngulo - segundoAngulo;
        System.out.println("El ángulo restante mide " + anguloRestante + "º");
    }

}
