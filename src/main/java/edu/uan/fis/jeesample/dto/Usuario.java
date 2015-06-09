package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private Integer id_usuario=0;
    private String nombre_usuario;
    private String password;
    private String pregunta;
    
 
    public String getNombreusuario() {
        return nombre_usuario;
    }

    public void setNombreusuario(String name) {
        this.nombre_usuario = name;
    }

    public Integer getIdusuario() {
        return id_usuario;
    }

    public void setIdusuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
    
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Usuario == false)
            return false;
        Usuario that = (Usuario) o;
        return that.id_usuario.equals(this.id_usuario);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.nombre_usuario != null ? this.nombre_usuario.hashCode() : 0);
        hash = 79 * hash + (this.id_usuario != null ? this.id_usuario.hashCode() : 0);
        hash = 79 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 79 * hash + (this.pregunta != null ? this.pregunta.hashCode() : 0);    
        return hash;
    }
}
