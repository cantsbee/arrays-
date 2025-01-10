// 2. Construye una tabla de 10 enteros. Declara diferentes variables de tabla que
// referenciarán la tabla creada. Comprueba, imprimiendo por pantalla, que todas las
// variables contienen la misma referencia.
// Realiza dos versiones del programa, una que utilice el operador new para crear el
// array, y otra que no lo utilice.

public class ejercicio2{
    public static void main(String[] args){
        int a[];
        a = new int[10];
        int b[];
        b=a;
        System.out.println(a);
        System.out.println(b);
    }
}