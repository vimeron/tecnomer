package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Empleado implements Serializable {
    
    private Integer id_empleado=0;
    private String nombre_empleado;
    private String direccion;
    private String telefono;
    
 
    public String getNombreempleado() {
        return nombre_empleado;
    }

    public void setNombreempleado(String name) {
        this.nombre_empleado = name;
    }

    public Integer getIdempleado() {
        return id_empleado;
    }

    public void setIdempleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Empleado == false)
            return false;
        Empleado that = (Empleado) o;
        return that.id_empleado.equals(this.id_empleado);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.nombre_empleado != null ? this.nombre_empleado.hashCode() : 0);
        hash = 79 * hash + (this.id_empleado != null ? this.id_empleado.hashCode() : 0);
        hash = 79 * hash + (this.direccion != null ? this.direccion.hashCode() : 0);
        hash = 79 * hash + (this.telefono != null ? this.telefono.hashCode() : 0);    
        return hash;
    }

   
   
}
