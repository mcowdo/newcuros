import javax.lang.model.SourceVersion;
import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("Numero binario = " + numeroDecimal + " = "+ Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = "Numero binario " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero 0ctal de " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero hexadecimal de " + numeroDecimal + " = " +Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null,mensaje);


    }
}
