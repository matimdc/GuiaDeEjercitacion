package ejercicios8.X;

import java.util.Scanner;

public class Ejercicio8_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Objeto para leer por consola
        double precioDelArticulo; // Declaro variable
        
        System.out.println("Ingrese el precio del artículo"); //Le muestro al user
        precioDelArticulo = entrada.nextDouble(); // Pido el dato y lo guardo
        
        // PLAN I
        mostrarEncabezado("PLAN I");
        mostrarPlan1(precioDelArticulo);
        // PLAN II
        mostrarEncabezado("PLAN II");
        mostrarPlan2(precioDelArticulo);
        // PLAN III
        mostrarEncabezado("PLAN III");
        mostrarPlan3(precioDelArticulo);
        // PLAN IV
        mostrarEncabezado("PLAN IV");
        mostrarPlan4(precioDelArticulo);
    }
    
    static double variarPrecio (double precio, int porcentaje)
    {
        double precioNuevo;
        precioNuevo = precio + (precio * porcentaje / 100);
        return precioNuevo;
    }
    
    static void mostrarEncabezado(String titulo)
    {
        /*HACER QUE SE MUESTREN LA CANTIDAD CORRECTA DE ASTERISCOS SEGUN LA LONGITUD DEL TITULO*/
	System.out.println("\n***************************");
        System.out.println("******** "+titulo+" ***********");
        System.out.println("***************************\n");
    }
    
    static void mostrarPlan1(double precio)
    {
        double precioPlan1;
        precioPlan1 = variarPrecio(precio, -10);
        System.out.println("Usted paga " + precioPlan1 );
    }
    
    static void mostrarPlan2(double precio)
    {
        double precioPlan2 = variarPrecio(precio, 10);
        System.out.println("Usted paga " + (precioPlan2/2) + " al contado");
        System.out.println("y 2 cuotas de " + (precioPlan2 / 4) );
    }
    
    static void mostrarPlan3(double precio)
    {
        double precioPlan3 = variarPrecio(precio, 15);
        System.out.println("Usted paga " + (precioPlan3*0.25) + " al contado");
        System.out.println("y 5 cuotas de " + ((precioPlan3 * 0.75) / 5) );
    }
    
    static void mostrarPlan4(double precio)
    {
        double precioPlan4 = variarPrecio(precio, 25);
        System.out.println("Usted paga 4 cuotas de " + ( (precioPlan4*0.6) / 4 ) );
        System.out.println("y 4 cuotas de " + ( (precioPlan4*0.4) / 4 ) );
    }
    
}
