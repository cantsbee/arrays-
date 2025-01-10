// 1. Crea 3 arrays de 5 elementos: la primera de enteros, la segunda de doubles, y la
// tercera de booleanos. Muestra las referencias en las que se encuentra cada una de
// las arrays anteriores.
// Realiza dos versiones del programa, una que utilice el operador new para crear el
// array, y otra que no lo utilice.


public class ejercicio1{
    public static void main(String[]args){
// int a[]; 
// a = new int[5];
int a[]= {2,7,9,4,5};


// double b[];
// b= new double[5];
double b[]={6.7, 8.9, 3.4, 2.0, 9.0};


// boolean c[];
// c= new boolean[5];
boolean c[]={true, false, false, false, true};

System.out.println(a[0]);
System.out.println(b[0]);
System.out.println(c[0]);


System.out.println(a);
System.out.println(b);
System.out.println(c);   
 }
}