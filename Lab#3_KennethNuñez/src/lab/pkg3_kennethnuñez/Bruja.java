package lab.pkg3_kennethnuñez;
import java.util.Random;

public class Bruja extends PersonajesEnemigos {
    static Random Random = new Random();
    private int HP = 60+Random.nextInt(80);
    private int AP = 20+Random.nextInt(40);
    private int AD = 5+Random.nextInt(10);
    private int Eficacia = 10+Random.nextInt(30);
    private int ProbabilidadDeCritico = 1;
    private int velocidad = 3+Random.nextInt(7); 

    public Bruja() {
        super("Bruja", Integer.toString(30+Random.nextInt(250)), Integer.toString(1+Random.nextInt(5)), Integer.toString(50+Random.nextInt(300)));
    }

    public static Random getRandom() {
        return Random;
    }

    public static void setRandom(Random Random) {
        Bruja.Random = Random;
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
        return "Bruja{" + "HP=" + HP + ", AP=" + AP + ", AD=" + AD + ", Eficacia=" + Eficacia + ", ProbabilidadDeCritico=" + ProbabilidadDeCritico + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
}
