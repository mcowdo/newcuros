package operaciones;

public class Aritmetica {
    //atributos de clase
    int a;
    int b;

    //constructor vacio
    public Aritmetica(){
        System.out.println("ejecucion del constructor");
    }

    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
        System.out.println("constructor con argumentos ");
    }


    //metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos(int arg1, int arg2){
    a = arg1;
    b = arg2;
    return sumarConRetorno();
    }


}
