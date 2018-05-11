package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Orco extends PersonajesEnemigos{
    static Random Random = new Random();
    private int HP = 70+Random.nextInt(90);
    private int AD = 30+Random.nextInt(45);
    private int Eficacia = 20+Random.nextInt(50);
    private int ProbabilidadDeCritico = 60;
    private int velocidad = 20;

    public Orco() {
        super("Orco", Integer.toString(30+Random.nextInt(250)), Integer.toString(1+Random.nextInt(5)), Integer.toString(50+Random.nextInt(300)));
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Orco.Random = Random;
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
        return "Orco{" + "HP=" + HP + ", AD=" + AD + ", Eficacia=" + Eficacia + ", ProbabilidadDeCritico=" + ProbabilidadDeCritico + ", velocidad=" + velocidad + '}';
    }

    
    
    
    
    
    
}
