// 5. Diseña un programa que pregunte al usuario cuántos números enteros quiere
// introducir. A continuación, se solicita esa cantidad de números enteros y por último
// se imprimen en orden inverso al introducido.
import  java.util.*;
public class ejercicio5{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("¿Cuántos numeros quiere introducir? ");
     int n = sc.nextInt();
     int numeros[]= new int[n];

     for(int i = 0; i  < n; i++){
        System.out.println("Introduce un número entero: ");
        numeros[i]=sc.nextInt();
      }
     
     for (int i =n-1; i < n ; i--);{
        System.out.println(numeros[i]);
     }
    }
}