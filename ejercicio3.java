// 3. Crea una tabla de longitud 10 que se inicializará con números aleatorios
// comprendido entre 1 y 100. Mostrar la suma de todos los números aleatorios que se
// guardan en la tabla.

public class ejercicio3{
    public static void main(String[]args){
        int a[];
        a = new int[10];

        for (int pos=0; pos < a.length; pos++);{
            a[pos]= (int)(Math.random()*100+1);
        }
        int suma = 0;
        for (int auxEnteros: a){
            suma = suma +auxEnteros;
        } 
        System.out.println("La suma de los valores aleatorios es: "+ suma);
    }
}