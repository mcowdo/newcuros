import paquetePruebas.Usuario;

public class Test {

    public static void main(String[] args) {
        //Instancias de Usuario
        Usuario usuario1 = new Usuario("Juan", "Pérez García", 32, "Av. del Pacífico, 23", "+34-91-000-0000");
        Usuario usuario2 = new Usuario("María", "Rodríguez Martínez", 28, "C/ del Sol, 5", "+34-91-000-0000");

        //Llamada al método de información del objeto
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
    }


}

