package ejercicios1.X;

import java.util.Scanner;

public class Ejercicio1_10
{
    /* Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes de pago:
        ◦ Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
        ◦ Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se
            incrementa en un 10%.
        ◦ Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se
            incrementa en un 15%.
        ◦ Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en
            las primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4
            cuotas. El precio publicado se incrementa en un 25%. */
    
    /* El programa fallará si se ingresa cualquier valor no numérico */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double precioDelArticulo;
        double precioPlanI;
        double precioPlanII;
        double precioPlanIII;
        double precioPlanIV;
        System.out.println("Ingrese el precio del artículo");
        precioDelArticulo = entrada.nextDouble();
        // PLAN I
        System.out.println("\n***************************");
        System.out.println("******** PLAN I ***********");
        System.out.println("***************************\n");
        precioPlanI = precioDelArticulo - precioDelArticulo * 0.1;
        System.out.println("Usted paga " + precioPlanI);
        // PLAN II
        System.out.println("\n***************************");
        System.out.println("******** PLAN II **********");
        System.out.println("***************************\n");
        precioPlanII = precioDelArticulo + precioDelArticulo * 0.1;
        System.out.println("Usted paga " + (precioPlanII / 2) + " al contado");
        System.out.println("y 2 cuotas de " + (precioPlanII / 4));
        // PLAN III
        System.out.println("\n***************************");
        System.out.println("******** PLAN III *********");
        System.out.println("***************************\n");
        precioPlanIII = precioDelArticulo + precioDelArticulo * 0.15;
        System.out.println("Usted paga " + (precioPlanIII * 0.25) + " al contado");
        System.out.println("y 5 cuotas de " + ((precioPlanIII * 0.75) / 5));
        // PLAN IV
        System.out.println("\n***************************");
        System.out.println("******** PLAN IV **********");
        System.out.println("***************************\n");
        precioPlanIV = precioDelArticulo + precioDelArticulo * 0.25;
        System.out.println("Usted paga 4 cuotas de " + ((precioPlanIV * 0.6) / 4));
        System.out.println("y 4 cuotas de " + ((precioPlanIV * 0.4) / 4));
    }

}
