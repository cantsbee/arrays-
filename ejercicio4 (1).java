import java.util.*;
public class ejercicio4 {
    public static void main(String[] args) {
        //abre el escaner para solicitar numeros decimales al usuario
        Scanner lector= new Scanner(System.in);
        //modifica la configuracion del escaner para aceptar el . como separador decimal
        lector.useLocale(Locale.US);
        //crea la variable para referenciar el array que almacenara todos los numeros
        double numeros[]=new double[5]; //segun el enunciado, se solicitan 5 numeros.
        
        //inicializa el array con los numeros que introduce el usuario
        for(int i=0; i<5;i++){
            System.out.println("introduce un numero decimal: ");
            numeros[i]=lector.nextDouble();
        }
        //Una vez inicializado el array, podemos imprimir el contenido.
        System.out.println("los numeros introducidos son "+ Arrays.toString(numeros));
        lector.close();

    }
}
