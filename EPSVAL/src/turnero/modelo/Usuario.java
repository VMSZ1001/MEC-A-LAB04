package turnero.modelo;

public class  Usuario extends  Persona implements Comparable<Usuario> {
    
    private String servicio;
    private int prioridad;
    private String tipoPrioridad = "No tiene";
    private String tipoDocumento;
   
    public Usuario(){
        // Inicialización
        servicio = "desconocido";
        prioridad = 0;
        tipoDocumento = "desconocido";
    }
   

    public Usuario( String id, String nombre, String servicio,int prioridad, String tipoDocumento) {
        super(id, nombre);
        this.servicio = servicio;
        this.prioridad = prioridad;
        this.tipoDocumento = tipoDocumento;
    }
    public Usuario( String id, String nombre, String servicio,int prioridad, String tipoDocumento, String tipoPrioridad) {
        super(id, nombre);
        this.servicio = servicio;
        this.prioridad = prioridad;
        this.tipoPrioridad = tipoPrioridad;
        this.tipoDocumento = tipoDocumento;
    }
    
    public String getTipoPrioridad() {
        return tipoPrioridad;
    }

// Escribir métodos getters y setters
    public void setTipoPrioridad(String tipoPrioridad) {    
        this.tipoPrioridad = tipoPrioridad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + getIdentificacion() + ", Nombre=" + getNombre() + ", servicio=" + servicio + ", prioridad=" + prioridad + ", tipoPrioridad=" + tipoPrioridad + ", tipoDocumento=" + tipoDocumento + '}';
    }

    

    public boolean equals  (Usuario other){
        return this.getPrioridad() == other.getPrioridad();
    }


    @Override
    public int compareTo (Usuario other){
        if (this.equals (other))
            return  0;
        else if (this.getPrioridad() > other.getPrioridad())
            return -1;
        else 
            return 1;
            
    } 
}
     