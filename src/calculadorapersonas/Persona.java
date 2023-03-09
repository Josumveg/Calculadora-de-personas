package calculadorapersonas;

/**
 * @version 19.0.2
 * @author Jose Pablo Umaña
 */
public class Persona {
    /**
     * Constructor para crear un objeto
     * persona y asignarle los valores de 
     * edad, nombre y provincia.
     */
    
    String nombre;
    int edad;
    String provincia;
    int cantidad = 0;
    
    Persona(String nombre, int edad, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.provincia = provincia;
    }
    
    Persona() {
    /**
     * Sobrecarga de constructor que 
     * permite crear un objeto persona 
     * solo con la variable cantidad. 
     */
    cantidad = cantidad; 
    }
    
}
