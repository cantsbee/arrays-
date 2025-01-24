import java.util.*;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        int numero1=lector.nextInt();
        for(int i=0; i<numero1;i++){
            System.out.println("introduce un numero entero: ");
            lector.nextInt();
        }
        System.out.println("la media de los numeros positivos es "+ mediaPositivos(numero1));
        lector.close();
    }
    static int mediaPositivos(int numeros[], int num){
    int positivos=0;
    int negativos=0;
    int ceros=0;

    for(int aux:numeros){
        if(aux==0){
            ceros++;
        }else if( aux <0){
            negativos ++;
        }else if(
            
        )

    }
}
}

