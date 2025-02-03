package TallerJava7metodos;
import java.util.Scanner;

import static TallerJava7metodos.Calculadora.*;
import static TallerJava7metodos.ConversionUnidades.*;
import static TallerJava7metodos.SistemaCalificaciones.Promedio;
import static TallerJava7metodos.SistemaCalificaciones.resultadoPromedio;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //?CONVERSION DE UNIDADES
        System.out.println("Sistema de conversión de unidades:");
        //!Pasar metros a centimetros
        System.out.println("Ingrese el numero de metros para convertir a Centimetros: ");
        int metros = scanner.nextInt();
        int centimetros = 100;
        int metroCentimetros = multiplicar(metros, centimetros);

        //!Pasar kilogramos a libras
        System.out.println("Ingrese el numero de kilogramos para convertir a libras: ");
        int kilogramos = scanner.nextInt();
        int libras = 2;
        int kilogramoslibras = multiplicar(kilogramos, libras);

        //!Pasar celcius a fahrenheit
        System.out.println("Ingrese el numero de celcius para convertir a farenheit: ");
        int celcius = scanner.nextInt();
        ;
        int farenheit = (32);
        int celciusFahrenheit = conversion(celcius, farenheit);

        resultado("la conversión de " + metros + "M - Cm Son: " + metroCentimetros + " centimetros.");
        resultado("la conversión de " + kilogramos + "Kg - Lbs Son: " + kilogramoslibras + " libras");
        resultado("la conversión de " + celcius + "C - F Son: " + celciusFahrenheit + " farenheit");


        //?SITEMA DE CALIFICACIONES
        System.out.println("Sitema de calificaciones:");
        System.out.println("Ingrese su primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        System.out.println("Ingrese su segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        System.out.println("Ingrese su tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        double promedio = Promedio(calificacion1, calificacion2, calificacion3);


        resultadoPromedio("El promedio de sus calificaaciones es: " + promedio);

        //?CREANDO UNA CALCULADORA

        int opcion;
        do {
            System.out.println("//////BIENVENIDO A SU CALCULADORA//////");
            System.out.println("Porfavor elija la operación que desea realizar (Escriba un número del 1-6 para elegir.) ");
            System.out.println("Menú de opciones:");
            System.out.println("1-Sumar.");
            System.out.println("2-Restar.");
            System.out.println("3-Multiplicar.");
            System.out.println("4-Dividir.");
            System.out.println("5-Potenciación");
            System.out.println("6-Salir.");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usted eligió sumar.");
                    System.out.println("Escriba el primer número:");
                    double snum1 = scanner.nextDouble();
                    System.out.println("Escriba el segundo número:");
                    double snum2 = scanner.nextDouble();
                    double suma = sumar(snum1, snum2);
                    mostrarResultado("La suma de los números es: " + suma);
                    break;

                case 2:
                    System.out.println("Usted eligió restar.");
                    System.out.println("Escriba el primer número:");
                    double rnum1 = scanner.nextDouble();
                    System.out.println("Escriba el segundo número:");
                    double rnum2 = scanner.nextDouble();
                    double resta = restar(rnum1, rnum2);
                    mostrarResultado("La resta de los números es: " + resta);
                    break;

                case 3:
                    System.out.println("Usted eligió multiplicar.");
                    System.out.println("Escriba el primer número:");
                    double mnum1 = scanner.nextDouble();
                    System.out.println("Escriba el segundo número:");
                    double mnum2 = scanner.nextDouble();
                    double multiplicacion = multiplicar(mnum1, mnum2);
                    mostrarResultado("La multiplicacion de los números es: " + multiplicacion);
                    break;

                case 4:
                    System.out.println("Usted eligió dividir");
                    System.out.println("Escriba el primer número:");
                    double dnum1 = scanner.nextDouble();
                    System.out.println("Escriba el segundo número:");
                    double dnum2 = scanner.nextDouble();
                    double divicion = dividir(dnum1, dnum2);
                    mostrarResultado("La divición de los números es: " + divicion);
                    break;

                case 5:
                    System.out.println("Usted eligió potenciacion.");
                    System.out.println("Escriba el número base:");
                    double base = scanner.nextDouble();
                    System.out.println("Escriba el número exponente:");
                    double exponente = scanner.nextDouble();
                    double potenciacion = calcularPotencia(base, exponente);
                    mostrarResultado(base + " elevado a " + exponente + " es: " + potenciacion);
                    break;

                case 6:
                    System.out.println("Usted ha salido del programa, Hasta pronto!");
                    break;

                default:
                    System.out.println("Opcion invalida! Porfavor intentelo de nuevo, escriba un número del 1-6: ");
            }

        } while (opcion != 6);
        scanner.close();
    }

}