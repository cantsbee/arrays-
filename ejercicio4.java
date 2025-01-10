// 4. Diseña un programa que solicite al usuario 5 números decimales. A continuación, se
// muestran los números en el mismo orden que se han introducido.

import java.util.*;
public class ejercicio4{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduzca 5 números decimales: ");
      //  double num1=sc.nextDouble();
      //  double num2=sc.nextDouble();
      //  double num3=sc.nextDouble();
      //  double num4=sc.nextDouble();
      //  double num5=sc.nextDouble();

       
      //  double array[]={num1, num2, num3, num4, num5};
      //  System.out.println(array[]);

      sc.useLocale(Locale.US);

      // crea la variable para referenciar el array que almacenará todos los números
      double numeros[]= new double[5];  

      for(int i = 0; i  < 5; i++){
        System.out.println("Introduce un número decimal: ");
        numeros[i]=sc.nextDouble();
      }
      
      System.out.println("los números introducidos son: "+Arrays.toString(numeros));

}
}