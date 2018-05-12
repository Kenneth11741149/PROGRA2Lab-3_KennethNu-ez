
package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Armas extends Objetos {
    static Random Random = new Random();
    static String Nombre = "Armas";
    private int AD = 1+Random.nextInt(20);
    private int AP = 1+Random.nextInt(20);

    public Armas() {
        super(Nombre);
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Armas.Random = Random;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }
    
    

    @Override
    public String toString() {
        return "Armas{" + "AD=" + AD + ", AP=" + AP + '}';
    }
    
    
    
}
