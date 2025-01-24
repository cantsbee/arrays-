import java.util.Arrays;
import java.util.Scanner;


public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String ciudades[]={ "Madrid", "Barcelona ", " Valencia ", " Jaen ", " Malaga "};
        Arrays.sort(ciudades);
        String x="";

        do{
            System.out.println("Introduce el nombre de una ciudad en españa ");
            x=lector.nextLine().toUpperCase();
        
            int pos= Arrays.binarySearch(ciudades, x);
            if(pos>=0){
                System.out.println("Ciudad no encontrada");
            }else if(!("salir".equals(x))){
                System.out.println("Ciudad encontrada ");
            }else if("salir".equals(x)){
                System.out.println("Saliendo...");
            }
        }while(!(x.equals("salir")));
        lector.close();
    }
}


//         String ciudadesdeUsuario[]= new String[5];

//         for (int i = 0; i < ciudadesdeUsuario.length; i++) {
//             System.out.println("Ingresa la ciudad ");
//             ciudadesdeUsuario[i] = sc.next();
//         if (ciudades[i].equalsIgnoreCase("salir")) {
//             System.out.println("Saliendo...");
//             break;
//         }else{
//             System.out.println("la ciudad se encuentra en " + );
//         }
//             }
//             System.out.println("El contenido del array es :"+Arrays.toString(ciudades) );
// }
// }

