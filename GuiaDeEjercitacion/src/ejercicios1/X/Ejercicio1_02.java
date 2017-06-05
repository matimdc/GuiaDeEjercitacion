package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_02
{
    /* Dados el valor de una hora de trabajo y la cantidad de horas trabajadas por día, 
    la computadora muestra el valor del sueldo diario */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double valorPorHora;
        int horasTrabajadas;
        double sueldoDiario;
        System.out.print("Ingrese cuánto gana por hora: ");
        valorPorHora = entrada.nextDouble();
        System.out.print("Ingrese cuántas horas trabaja por día: ");
        horasTrabajadas = entrada.nextInt();
        sueldoDiario = valorPorHora * horasTrabajadas;
        System.out.println("Usted gana $" + sueldoDiario);
    }

}
