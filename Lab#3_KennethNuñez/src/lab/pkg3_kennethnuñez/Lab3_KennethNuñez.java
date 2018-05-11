package lab.pkg3_kennethnuñez;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab3_KennethNuñez {
static Scanner read = new Scanner(System.in);
static boolean dificulty = false;
static int Dificultad;
static Random Random = new Random();
    public static void main(String[] args) {
        System.out.println("Bienvenido al laboratorio de Kenneth Nuñez 11741149. ");
        char resp = 'S';
        while(resp == 'S' || resp == 's'){
            System.out.println("");
        System.out.println("1. Iniciar. ");
        System.out.println("2. Nivel de Dificultad. ");
        System.out.println("3. Salir. ");
        int option = read.nextInt();
        switch(option){
            case 1:
                if(dificulty == true){
                    System.out.println("Ingrese el HP de su Personaje: ");
                } else {
                    System.out.println("No ha elejido la dificultad. ");
                }
                break;
            case 2:
                if(dificulty == false){
                System.out.println("");
                System.out.println("Ingrese la dificultad que usted desea: ");
                System.out.println("1.) 5 enemigos. (50 Pasos) ");
                System.out.println("2.) 10 enemigos.(100 Pasos) ");
                System.out.println("3.) 15 enemigos. (120 Pasos)) ");
                int option2 = read.nextInt();
                switch(option2){
                    case 1:
                        Dificultad = 1;
                        break;
                    case 2:
                        Dificultad = 2;
                        break;
                    case 3:
                        Dificultad = 3;
                        break;
                    default:
                        System.out.println("No es un nivel de dificultad. ");
                        break;
                    
                }
                dificulty = true;
                } else {
                    System.out.println("Usted ya eligio su dificultad. Favor salirse del programa y volver a intentarlo.");
                }
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
