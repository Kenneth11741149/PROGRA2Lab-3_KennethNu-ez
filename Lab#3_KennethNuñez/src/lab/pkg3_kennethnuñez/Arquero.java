
package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Arquero extends PersonajesAliados{
    static Random Random = new Random();
    private int HP = 150;
    private int AD = 50;
    private int Eficacia = 1+Random.nextInt(100);
    private int velocidad = 15;
    private int ProbabilidadDeCritico = 1+Random.nextInt(100);
    private int Suerte = 20;
    private String BattleCry = "My aim is true. ";

    public Arquero(String Nombre, String Edad, String Estatura, String Peso, String ColorDePiel, String ColorDePelo, String Raza) {
        super(Nombre, Edad, Estatura, Peso, ColorDePiel, ColorDePelo, Raza);
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Arquero.Random = Random;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getEficacia() {
        return Eficacia;
    }

    public void setEficacia(int Eficacia) {
        this.Eficacia = Eficacia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getProbabilidadDeCritico() {
        return ProbabilidadDeCritico;
    }

    public void setProbabilidadDeCritico(int ProbabilidadDeCritico) {
        this.ProbabilidadDeCritico = ProbabilidadDeCritico;
    }

    public int getSuerte() {
        return Suerte;
    }

    public void setSuerte(int Suerte) {
        this.Suerte = Suerte;
    }

    public String getBattleCry() {
        return BattleCry;
    }

    public void setBattleCry(String BattleCry) {
        this.BattleCry = BattleCry;
    }

    
    @Override
    public String toString() {
        return "Arquero{" + "HP=" + HP + ", AD=" + AD + ", Eficacia=" + Eficacia + ", velocidad=" + velocidad + ", ProbabilidadDeCritico=" + ProbabilidadDeCritico + ", Suerte=" + Suerte + ", BattleCry=" + BattleCry + '}';
    }
    
    

}