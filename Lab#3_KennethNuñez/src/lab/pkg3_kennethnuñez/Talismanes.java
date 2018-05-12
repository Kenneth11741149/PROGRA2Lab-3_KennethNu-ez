package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Talismanes extends Objetos {
    static String Nombre = "Talismanes";
    static Random Random = new Random();
    static int Vida = 0+Random.nextInt(50);

    public Talismanes() {
        super(Nombre);
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String Nombre) {
        Talismanes.Nombre = Nombre;
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Talismanes.Random = Random;
    }

    public static int getVida() {
        return Vida;
    }

    public static void setVida(int Vida) {
        Talismanes.Vida = Vida;
    }
    
    

    @Override
    public String toString() {
        return "Talismanes{" + '}';
    }
    
    
    
    
    
    
    
    
}
