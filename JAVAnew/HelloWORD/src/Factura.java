import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner factura = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura: ");
        String nombre = factura.nextLine();

        System.out.println("Ingrese el precio del primer producto");
        double producto1 = factura.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double producto2 = factura.nextDouble();

        double subtotal = producto1 + producto2;
        double impuesto = .19;
        double totalimpues = subtotal * impuesto;
        double total = subtotal+totalimpues;
        System.out.println("Factura: " + nombre);
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Impuestos: " + totalimpues);
        System.out.println("Total de factuta: " + total);
    }
}
