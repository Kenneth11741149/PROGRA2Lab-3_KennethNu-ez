package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Mago extends PersonajesAliados {
   static Random Random = new Random();
   private int HP = 120;
   private int AP = 50;
   private int AD = 20;
   private int eficacia = 1+Random.nextInt();
   private int velocidad = 10;
   private int suerte = 20;
   private int ProbabilidadDeCritico = 1+Random.nextInt();

    public Mago(String Nombre, String Edad, String Estatura, String Peso, String ColorDePiel, String ColorDePelo, String Raza) {
        super(Nombre, Edad, Estatura, Peso, ColorDePiel, ColorDePelo, Raza);
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Mago.Random = Random;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public int getProbabilidadDeCritico() {
        return ProbabilidadDeCritico;
    }

    public void setProbabilidadDeCritico(int ProbabilidadDeCritico) {
        this.ProbabilidadDeCritico = ProbabilidadDeCritico;
    }

    @Override
    public String toString() {
        return "Mago{" + "HP=" + HP + ", AP=" + AP + ", AD=" + AD + ", eficacia=" + eficacia + ", velocidad=" + velocidad + ", suerte=" + suerte + ", ProbabilidadDeCritico=" + ProbabilidadDeCritico + '}';
    }
   
   
}