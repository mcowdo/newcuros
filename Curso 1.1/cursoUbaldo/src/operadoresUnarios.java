public class operadoresUnarios {
    public static void main(String[] args) {

        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // incremento
        //1.preincremento (simbolo antes de la variable)
        int e = 3;
        int f = ++e;//primero se utiliza la variable y despues su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento (simbolo despues de la variable)
        
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //decremento
        int i = 2;
        int j = --i;
        System.out.println("i = " + i);//ya esta decrementada
        System.out.println("j = " + j);//

        //postdecremento
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);



    }
}
