import java.util.*;
public class ejercicio9 {
    
        public static void main(String[] args) {
            Scanner lector= new Scanner(System.in);
            int t[] = {10, 20, 40, 50,70,40,70,30};
            System.out.println("ingrese el valor a buscar ");
            int posicion= lector.nextInt();
            int clave = 30;
            int resultado = buscar(t, posicion);

            if (resultado != -1) {
                System.out.println("El valor " + clave + " se encuentra en la posición " + resultado + ".");
            } else {
                System.out.println("El valor " + clave + " no se encuentra en el array.");
            }  
            lector . close(); 
        }
        
        public static int buscar(int t [], int clave) {
            
            for (int i = 0; i < t.length; i++) {
                if (t[i] == clave) {
                    return i; 
                }
            }
            return -1;  
    }
}

    