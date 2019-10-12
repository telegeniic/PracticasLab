package app;

/**
 * Man
 */
public class Man extends SuperMan{
    private String nombre;
    private String edad;
    
    private String run(){
        return "Mans runs";
    }

    private String walk(){
        return "Mans walk";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String superPower() {
        return null;
    }

    


}