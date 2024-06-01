import javax.swing.*;

public class setenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "maria", "paco", "lalo", "Bea", "Pato", "Pepa"};

        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            System.out.println( (i+1)+" " +nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingresa un nombre, emeplo \"PEPE\" o \"Maria\"");
        System.out.println("Buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++) {

            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("Nombres = " + nombres[i]);
            }
            if(encontrado){
                JOptionPane.showMessageDialog(null, buscar+ " fue encontrado");
            }else{
                JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema ");
            }

    }

}
