package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Catalogo implements Serializable {
    
    private Integer id_categoria=0;
    private String nombre_catalogo;
    
 
    public String getName() {
        return nombre_catalogo;
    }

    public void setName(String name) {
        this.nombre_catalogo = name;
    }

    public Integer getCatalogoId() {
        return id_categoria;
    }

    public void setCatalogoId(Integer id_catalogo) {
        this.id_categoria = id_catalogo;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Catalogo == false)
            return false;
        Catalogo that = (Catalogo) o;
        return that.id_categoria.equals(this.id_categoria);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.nombre_catalogo != null ? this.nombre_catalogo.hashCode() : 0);
        hash = 79 * hash + (this.id_categoria != null ? this.id_categoria.hashCode() : 0);
  
        return hash;
    }
}
