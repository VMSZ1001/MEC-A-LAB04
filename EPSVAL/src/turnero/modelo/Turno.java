package turnero.modelo;

public class Turno {
    
    private String prioridad;
    private int numero;
    private String tipoServicio;
   
   
 public Turno()
    {
        // Inicialización
        prioridad = "desconocido";
        numero= 0;
        tipoServicio = "desconocido";
        
    }

    public Turno(String prioridad, int numero, String tipoServicio) {
        this.prioridad = prioridad;
        this.numero = numero;
        this.tipoServicio = tipoServicio;
    }
}
     