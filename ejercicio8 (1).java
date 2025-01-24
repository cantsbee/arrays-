import java.util.*;

public class ejercicio8 {
   public static void main(String[] args) {
    Scanner lector= new Scanner(System.in);
    System.out.println("Ingresa la longitud del array");
    int longitud=lector.nextInt();
    System.out.println("ingresa el valor maximo del array");
    int fin=lector.nextInt();

    int[] arrayPares=generarPares(longitud, fin);
    Arrays.sort(arrayPares);

   // for(int i=0;i<longitud;i++){
   //    System.out.println("ingresa un numero par");
   //    lector.nextInt();
   // }
    System.out.println("Array genrado "+ Arrays.toString(arrayPares));

    lector.close();
   } 
   public static int[] generarPares(int longitud, int fin){
      int array[]= new int [longitud];
      int counter=0;
      while(counter!=longitud){
         int aleatorio=(int)(Math.random()*fin)+1;
         if(aleatorio%2==0){
            array[counter]=aleatorio;
            counter++;
         }
         
      }
      return array;
      
      // for(int i=0; i<longitud;i++){
      //    array[i]=2*(i+1);
      // }
      // return array;
   }
}
