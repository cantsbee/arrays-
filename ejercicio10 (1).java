import java.util.*;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
            System.out.println("Ingrese un mes del año ");
            String meses[]= { "Enero", "Febero" , "Marzo" , "Abril" , "Mayo" ,"Junio" , "Julio ", "Agosto ", "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
        int mes= lector.nextInt();
        
        switch (mes) {
            case 1, 3, 5 , 7 , 8, 10 , 12:
                System.out.println(" el mes tiene 31 dias ");
                break;

            case 2:
            System.out.println("El mes tiene 28 dias ");
            break;
            case 4, 6, 9, 11:
            System.out.println("El mes tiene 30 dias ");
            default:
            System.out.println("Ingresa un valor correcto ");
                break;
                
        }
        lector.close();
        
    }
}
