package ejercicios8.X;

import java.util.Scanner;

public class Ejercicio8_7
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        System.out.print("Ingrese el día: ");
        dia = entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = entrada.nextInt();
        mostrarSigno(dia, mes);
    }

    static boolean validarFecha(int dia, int mes)
    {
        return (((dia >= 1 && dia <= 31)
                && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || ((dia >= 1 && dia <= 30)
                && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || ((dia >= 1 && dia <= 29) && (mes == 2)));
    }

    static void mostrarSigno(int dia, int mes)
    {
        if (validarFecha(dia, mes))
        {
            switch (mes)
            {
                case 1:
                    if (dia <= 21)
                    {
                        System.out.println("Sos de capricornio");
                    }
                    else
                    {
                        System.out.println("Sos de acuario");
                    }
                    break;
                case 2:
                    if (dia <= 19)
                    {
                        System.out.println("Sos de acuario");
                    }
                    else
                    {
                        System.out.println("Sos de piscis");
                    }

                    break;
                case 3:
                    if (dia <= 20)
                    {
                        System.out.println("Sos de piscis");
                    }
                    else
                    {
                        System.out.println("Sos de aries");
                    }
                    break;
                case 4:

                    if (dia <= 21)
                    {
                        System.out.println("Sos de aries");
                    }
                    else
                    {
                        System.out.println("Sos de tauro");
                    }

                    break;
                case 5:
                    if (dia <= 22)
                    {
                        System.out.println("Sos de tauro");
                    }
                    else
                    {
                        System.out.println("Sos de géminis");
                    }
                    break;
                case 6:

                    if (dia <= 22)
                    {
                        System.out.println("Sos de géminis");
                    }
                    else
                    {
                        System.out.println("Sos de cáncer");
                    }

                    break;
                case 7:
                    if (dia <= 22)
                    {
                        System.out.println("Sos de cáncer");
                    }
                    else
                    {
                        System.out.println("Sos de leo");
                    }
                    break;
                case 8:
                    if (dia <= 24)
                    {
                        System.out.println("Sos de leo");
                    }
                    else
                    {
                        System.out.println("Sos de virgo");
                    }
                    break;
                case 9:

                    if (dia <= 23)
                    {
                        System.out.println("Sos de virgo");
                    }
                    else
                    {
                        System.out.println("Sos de libra");
                    }
                    break;
                case 10:
                    if (dia <= 23)
                    {
                        System.out.println("Sos de libra");
                    }
                    else
                    {
                        System.out.println("Sos de escorpio");
                    }
                    break;
                case 11:

                    if (dia <= 23)
                    {
                        System.out.println("Sos de escorpio");
                    }
                    else
                    {
                        System.out.println("Sos de sagitario");
                    }
                    break;
                case 12:
                    if (dia <= 22)
                    {
                        System.out.println("Sos de sagitario");
                    }
                    else
                    {
                        System.out.println("Sos de capricornio");
                    }
                    break;
            }
        }
        else
        {
            System.out.println("Fecha inválida");
        }
    }

}
