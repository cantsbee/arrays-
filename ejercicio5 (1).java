import java.util.*;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Cuantos numeros enteros deseas introducir");
        int numero= lector.nextInt();
        int numeros[]= new int [numero];
        
        for(int i=0; i<numero;i++){
            System.out.println("escribe un numero entero " );
            numeros[i]=lector.nextInt();
            
        }
         System.out.println("los numeros introducidos son "+ Arrays.toString(numeros));

        
        //Hacer un bucle for para imprimir los numeros en orden inverso
        System.out.println("los numeros en orden inverso son:");

        for(int i=numero-1;i>=0;i--){
            System.out.println("numeros en inverso "+ numeros[i]);
            lector.close();
        }
    }
}
