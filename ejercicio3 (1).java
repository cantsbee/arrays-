
public class ejercicio3 {
   public static void main(String[] args) {

    //crea las variables para referenciar el array de valores 
    int numeros[];
    //crea el array de 10 enteros y asigna la referencia a la variable "numero"
    numeros=new int[10];

    //para asignar el valor aleatorio a cada posicion del array numeros, utilizo un for
    for(int pos=0;pos<numeros.length;pos++){//el bucle se ejecuta 10 veces (desde 0 a longitud -1, esto es de 0 a 9)
        numeros[pos]=(int)(Math.random()*100)+1;
    } 

    //Una vez asignados los valores aleatorios, recorre el array con un for each para ir sumando los valores
    //la variable suma acumulada el sumatorio de los valores
    int suma=0;
    for (int auxEnteros:numeros){
        suma=suma + auxEnteros; //suma+= auxEnteros.
    }
    System.out.println("la suma de los valores aleatorios es "+ suma);
   } 
}
