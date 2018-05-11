package lab.pkg3_kennethnuñez;
import java.util.Scanner;
import java.util.ArrayList;


public class Lab3_KennethNuñez {
static Scanner read = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println("Bienvenido al laboratorio de Kenneth Nuñez 11741149. ");
        char resp = 'S';
        while(resp == 'S' || resp == 's'){
        System.out.println("1. Iniciar. ");
        System.out.println("2. Nivel de Dificultad. ");
        System.out.println("3. Salir. ");
        int option = read.nextInt();
        switch(option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Su opcion esta totalmente Incorrecta. ");
                break;
           
        }
    }
    }
    
}
