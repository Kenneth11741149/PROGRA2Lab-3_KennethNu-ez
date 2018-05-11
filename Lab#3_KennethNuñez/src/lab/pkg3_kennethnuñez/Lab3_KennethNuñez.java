package lab.pkg3_kennethnuñez;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab3_KennethNuñez {
static Scanner read = new Scanner(System.in);
static boolean dificulty = false;
static int Dificultad;
static Random Random = new Random();
static ArrayList<PersonajesAliados> PlayerOne = new ArrayList();
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
                    System.out.println("Ingrese el nombre de su personaje. ");
                    read.nextLine();
                    String Nombre = read.nextLine();
                    System.out.println("Ingrese la edad de su personaje. ");
                    String Edad = read.nextLine();
                    System.out.println("Ingrese la estatura del personaje. ");
                    String Estatura = read.nextLine();
                    System.out.println("Ingrese el peso de su personaje. ");
                    String Peso = read.nextLine();
                    System.out.println("1. Negro. ");
                    System.out.println("2. Cafe. ");
                    System.out.println("3. Rubio.");
                    System.out.println("Escoja su opcion: ");
                    int pelo = read.nextInt();
                    String hair = "Negro";
                    if(pelo == 1){
                        hair = "Negro";
                    } else if (pelo == 2){
                        hair = "Cafe";
                    } else {
                        hair = "Rubio";
                    }
                    System.out.println("1. Hobbit. ");
                    System.out.println("2. Elfo. ");
                    System.out.println("3. Humanos. ");
                    System.out.println("4. Enanos . ");
                    int razation = read.nextInt();
                    String razat = "Humanos";
                    if(razation == 1){
                        razat = "Hobbit";
                    } else if (razation == 2){
                        razat = "Elfo";
                    } else if (razation == 3){
                        razat = "Humanos";
                    } else{
                        razat = "Enanos";
                    }
                    System.out.println("Ingrese el color de piel de su jugador. ");
                    String ColorDePiel = read.nextLine();
                    String ColorDePelo = hair;
                    String Raza = razat;
                    System.out.println("Ingrese que personaje desea: ");
                    System.out.println("1. Arquero. ");
                    System.out.println("2. Berzerk. ");
                    System.out.println("3. Picaro. ");
                    System.out.println("4. Mago. ");
                    int option3 = read.nextInt();
                    switch(option3){
                        case 1:
                            PersonajesAliados Arquero = new Arquero(Nombre, Edad, Estatura, Peso, ColorDePiel, ColorDePelo, Raza);
                            PlayerOne.add(Arquero);
                            break;
                        case 2:
                            PersonajesAliados Berzerk = new Berzerk(Nombre, Edad, Estatura, Peso, ColorDePiel, ColorDePelo, Raza);
                            PlayerOne.add(Berzerk);
                            break;
                        case 3:
                            PersonajesAliados Picaro = new Picaro(Nombre, Edad, Estatura, Peso, ColorDePiel, ColorDePelo, Raza);
                            PlayerOne.add(Picaro);
                            break;
                        case 4:
                            PersonajesAliados Mago = new Mago(Nombre, Edad, Estatura, Peso, ColorDePiel, ColorDePelo, Raza);
                            PlayerOne.add(Mago);
                            break;
                        default:
                            System.out.println("Opcion mas que invalida. ");
                    }
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
