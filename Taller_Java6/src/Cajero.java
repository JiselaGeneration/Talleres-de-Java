import java.util.Scanner;

public class Cajero {
    public static void cajero() {
        Scanner scanner = new Scanner(System.in);

        //!CAJERO AUTOMATICO

        int opcion = 0;
        double saldo = 1500000;
        double retirar = 0;
        int confirmar = 0;
        double deposito = 0;
        double cuenta =0;


        do {
            System.out.println(" ");
            System.out.println("||||BIENVENIDO A SU CAJERO AUTOMATICO||||");
            System.out.println("Indique del 1 - 4 la operacion que desea realizar: ");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Retirar");
            System.out.println("3.Depositar");
            System.out.println("4.Salir");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Su saldo actual es de " + saldo);
            } else {
                if (opcion == 2) {
                    System.out.println("Cuanto desea retirar?");
                    retirar = scanner.nextDouble();
                    System.out.println("Usted va a retirar " + retirar + " Es correcto?. Escriba 1 para confirmar y 2 para cancelar.");
                    confirmar = scanner.nextInt();
                    if (confirmar == 1) {
                        double saldoTotal = saldo - retirar;
                        System.out.println("Perfecto uted ha retirado $" + retirar + " su saldo actual es de " + saldoTotal);
                    } else {
                        System.out.println("Trasaccion cancelada!!!");
                    }
                } else {
                    if (opcion == 3) {
                        System.out.println("Porfavor escriba el numero de cuenta a la que desea cosignar");
                        cuenta = scanner.nextDouble();
                        System.out.println("Cuanto desea depositar? ");
                        deposito = scanner.nextDouble();

                        System.out.println("Usted depositara $" + deposito + " a " + cuenta + ". Escriba 1 para confirmar y 2 para cancelar.");
                        confirmar = scanner.nextInt();
                        if (confirmar == 1) {
                            double saldoTotal = saldo - deposito;
                            System.out.println("Perfecto uted ha depositado $" + deposito + " a la cuenta " + cuenta + "su saldo actual es de " + saldoTotal);
                        } else {
                            System.out.println("Trasaccion cancelada!!!");
                        }
                    } else {
                        System.out.println("Adios!!!");
                    }
                }
            }

        } while (opcion != 4);
    }
}
