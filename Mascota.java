
/**
 *
 * 
 * @author (Sergio) 
 * @version (1.0)
 */
public class Mascota
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private String tipo;

    /**
     * Constructor for objects of class Mascota
     */
    public Mascota(String nombre, int edad, String tipo)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nEdad: ");
        sb.append(edad);
        sb.append("\nTipo: ");
        sb.append(tipo);
        
        return sb.toString();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
