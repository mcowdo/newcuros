import java.util.Scanner;

public class DPO1_U1_EA_OSHD {
    public DPO1_U1_EA_OSHD() {
    }

    public static void main(String[] args) {
        Scanner BanAhorra = new Scanner(System.in);
        System.out.println("Ingresa numero de cuenta: ");
        String numeroCuenta = BanAhorra.nextLine();
        System.out.println("Ingresa tu nombre: ");
        String nombreCLiente = BanAhorra.nextLine();
        System.out.println("Ingrea el saldo: ");
        double saldo = BanAhorra.nextDouble();
        double intereses = 0.05;
        double intAnual = saldo * intereses;
        double intMensual = saldo * (intereses / 12.0);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Nombre del cliente: " + nombreCLiente);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("Interes anual: " + intAnual);
        System.out.println("Interes mensual: " + intMensual);
        System.out.println("Saldo con intereses mensual: " + (saldo + intMensual));
        System.out.println("Saldo con interes anual: " + (saldo + intAnual));
    }
}
