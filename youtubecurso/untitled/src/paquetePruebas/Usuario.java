package paquetePruebas;

public class Usuario {

        //Atributos
        String nombre;
        String apellidos;
        int edad;
        String direccion;
        String telefono;

        // constructor de la clase
        public Usuario(String nombre, String apellidos, int edad, String direccion, String telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        //Método para mostrar la información del objeto
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Edad: " + edad);
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
        }
    }

