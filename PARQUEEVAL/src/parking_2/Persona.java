
package parking_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;


class Persona{
    int id; 
    String nombre; 
    String cedula; 
    String placa;
    LocalDate fechaEntrada;
    int hour;
    int minute; 
    String tipoVehiculo; 
   
    
    
    public Persona(int id) {
        this.id = id;
    }

    
    public Persona(int id, String nombre, String cedula, String placa, LocalDate fechaEntrada, int hour, int minute, String tipoVehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.hour = hour;
        this.minute = minute;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.id == other.id;
    }
    



    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", placa=" + placa + ", fechaEntrada=" + fechaEntrada + ", hour=" + hour + ", minute=" + minute + ", tipoVehiculo=" + tipoVehiculo + '}';
    }


    
    
}