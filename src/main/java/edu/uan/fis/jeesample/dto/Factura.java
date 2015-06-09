 

package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Factura implements Serializable {

    private Integer id_factura=0;
    private Integer id_usuario=0;
    private Integer total=0;
   

    public Integer getIdfactura() {
        return id_factura;
    }

    public void setIdfactura(Integer id_factura) {
        this.id_factura = id_factura;
    }
     
     public Integer getIdusurio() {
        return id_usuario;
    }

    public void setIdusuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Factura == false)
            return false;
        Factura that = (Factura) o;
        return that.id_factura.equals(this.id_factura);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id_factura != null ? this.id_factura.hashCode() : 0);
        hash = 79 * hash + (this.id_usuario != null ? this.id_usuario.hashCode() : 0);
        hash = 79 * hash + (this.total != null ? this.total.hashCode() : 0);
        
        return hash;
    }
}
