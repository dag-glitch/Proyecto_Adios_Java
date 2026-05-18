public class Persona {
    private String nombre;
    private int edad;
    private String cumpleaños;

    public Persona (String nombre, String cumpleaños, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cumpleaños = cumpleaños;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public int getedad (){
        return edad;
    }

    public void setedad(int edad){
        this.edad = edad;

    }

    public String getcumpleaños(){
        return cumpleaños;
    }

    public void setcumpleaños(String cumpleaños){
        this.cumpleaños = cumpleaños;
    }
}
