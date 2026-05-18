import java.util.Scanner;
public class Resta {

    public static void main(String[] args) {
        int numero1, numero2, resta;
        //Ingreso de datos 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese numero 1 ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese numero 2 ");
        numero2 = scanner.nextInt();
        

        //Operacion 
        resta = numero1-numero2;
        System.out.println("El resultado de la resta es: " + resta);
    }
}