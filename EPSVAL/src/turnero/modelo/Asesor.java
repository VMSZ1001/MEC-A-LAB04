package turnero.modelo;

public class Asesor extends  Persona
{     
    private String tipoServicio;
    private String nombre;
    private String puestoAtencion;
    private String estado;
   
 public Asesor()
    {
        // Inicialización
        tipoServicio = "desconocido";
        nombre = "desconocido";
        puestoAtencion = "desconocido";
        estado = "desconocido";
        
    }
  public  Asesor ( String id, String tipoServicio, String nombre, String puestoAtencion,String estado)
  {
        super(id,nombre);
        this.tipoServicio = tipoServicio;
        this.puestoAtencion = puestoAtencion;
        this.estado = estado;
    }
}
    