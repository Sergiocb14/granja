
/**
 *
 * 
 * @author (Sergio) 
 * @version (1.0)
 */
public class Principal
{
    // instance variables - replace the example below with your own
    public static void main(){
        Granjero paco = new Granjero("Paco", "Martínez", 58, 'H');
        Granja granjaDePaco = new Granja("Paccolandia", "Corea del Norte", paco);
        Mascota mascota = new Mascota("Pelcucho", 13, "Perro");
        paco.setMascota(mascota); 
        System.out.println(granjaDePaco);
    }
}
