package TallerJava7metodos;

public class Calculadora {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void mostrarResultado(String mensaje){
        System.out.println(mensaje);
    }

}
