import java.util.*;
public class ejercicio6 {
public static void main(String[] args) {
    Scanner lector= new Scanner(System.in);
    int numeros[]=new int[4];
    
    for(int i=0;i <numeros.length;i++){
        System.out.println("Escribe un numero entero:");
        numeros[i]=lector.nextInt();
    }
    System.out.println("el numero maximo es " + maximo(numeros));
    
    lector.close();
    } 
    static int maximo(int arrayEntrada[]){
        int max=arrayEntrada[0];
        for(int aux: arrayEntrada){
            if(aux>max){
                max=aux;
            }
        }
        return max;
    } 
}
