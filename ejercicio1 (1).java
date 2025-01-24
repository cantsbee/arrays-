
public class ejercicio1{ 
    public static void main(String[]args){
        int enteros[];
        enteros=new int[5];
        // int enteros[]={23,44,2,4,76};

        double dobles[];
        dobles= new double[5];
        // double dobles[]={32.5,76.3,23.2,44.4,12.2};


        boolean booleanos[];
        booleanos=new boolean[5];
        // boolean booleanos[]={false, true, true, false,true};


        //imprime el primer elemento del array que por defecto debe valer 0
        System.out.println("el primer elemento del array enteros es "+ enteros[0]);
        //imprime las referencias a los array
        System.out.println(enteros);
        System.out.println(dobles);
        System.out.println(booleanos);
    }
}
