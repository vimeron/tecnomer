package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Producto implements Serializable {

    private String nombre_producto;
    private String id_producto;
    private String id_catalogo;
    private String valor;
    private String imagen;
 /*   private Integer id_producto=0;
    private Integer id_catalogo=0;
    private Integer valor=0;*/
    public String getNombreproducto() {
        return nombre_producto;
    }

    public void setNombreproducto(String name) {
        this.nombre_producto = name;
    }

    public String getIdproducto() {
        return id_producto;
    }

    public void setIdproducto(String id_producto) {
        this.id_producto = id_producto;
    }
    public String getIdCatalogo() {
        return id_catalogo;
    }

    public void setIdcatalogo(String id_catalogo) {
        this.id_catalogo = id_catalogo;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Producto == false)
            return false;
        Producto that = (Producto) o;
        return that.id_producto.equals(this.id_producto);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id_producto != null ? this.id_producto.hashCode() : 0);
        hash = 79 * hash + (this.nombre_producto != null ? this.nombre_producto.hashCode() : 0);
        hash = 79 * hash + (this.id_catalogo != null ? this.id_catalogo.hashCode() : 0);
        hash = 79 * hash + (this.valor != null ? this.valor.hashCode() : 0);
        
        return hash;
    }
}
