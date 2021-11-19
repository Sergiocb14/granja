
/**
 *
 * 
 * @author (Sergio) 
 * @version (1.0)
 */
public class Granja
{
    // instance variables - replace the example below with your own
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
    
    /**
     * Constructor for objects of class Granja
     */
    public Granja(Granjero granjero)
    {
        // initialise instance variables
        this.granjero = granjero;
    }
    
    public Granja(String nombre, String ubicacion, Granjero granjero){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
    }
    
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("\nDatos de la Granja");
        resultado.append("\n==================");
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nUbicación: ");
        resultado.append(ubicacion);
        resultado.append("\nGranjero : ");
        resultado.append(granjero);
        
        return resultado.toString();
    }

}
