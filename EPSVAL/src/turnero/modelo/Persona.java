package turnero.modelo;

public class Persona {
      
    private String identificacion;
    private String nombre;
   
 public Persona()
    {
        // Inicialización
        identificacion = "desconocido";
        nombre = "desconocido";
    } 

    public Persona(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
 
 
// Escribir métodos getters y setters

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
            
   
    

