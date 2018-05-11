package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Troll extends PersonajesEnemigos {
    static Random Random = new Random();
    private int HP = 50+Random.nextInt(80);
    private int AD = 5+Random.nextInt(10);
    private int Eficacia = 50+Random.nextInt(65);
    private int ProbabilidadDeCritico = 15+Random.nextInt(20);
    private int velocidad = 10;

    public Troll() {
        super("Troll", Integer.toString(30+Random.nextInt(250)), Integer.toString(1+Random.nextInt(5)), Integer.toString(50+Random.nextInt(300)));
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Troll.Random = Random;
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

    public int getProbabilidadDeCritico() {
        return ProbabilidadDeCritico;
    }

    public void setProbabilidadDeCritico(int ProbabilidadDeCritico) {
        this.ProbabilidadDeCritico = ProbabilidadDeCritico;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Troll{" + "HP=" + HP + ", AD=" + AD + ", Eficacia=" + Eficacia + ", ProbabilidadDeCritico=" + ProbabilidadDeCritico + ", velocidad=" + velocidad + '}';
    }
    
    
    
    

    
    
    
    
    
    
    
    
    
}
