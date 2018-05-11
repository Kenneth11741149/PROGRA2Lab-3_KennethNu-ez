package lab.pkg3_kennethnuñez;

public class PersonajesEnemigos {
    private String Nombre;
    private String Edad;
    private String Estatura;
    private String Peso;

    public PersonajesEnemigos(String Nombre, String Edad, String Estatura, String Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getEstatura() {
        return Estatura;
    }

    public void setEstatura(String Estatura) {
        this.Estatura = Estatura;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }
    
    
    
    @Override
    public String toString() {
        return "PersonajesEnemigos{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Estatura=" + Estatura + ", Peso=" + Peso + '}';
    }
    
    
}
