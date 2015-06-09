package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Usuario;
import java.util.List;

public interface UsuarioDao {

    /**
     * Creates a new usuario. 
     * @param usuario
     * @return 
     */
    Usuario create(Usuario usuario);

    /**
     * Updates an existing cliente. Usuario id can't be modified.
     * @param usuario
     * @return 
     */
    Usuario update(Usuario usuario);

    /**
     * Deletes an existing cusuario
     * @param usuario
     */
    void delete(Usuario usuario);

    /**
     * Find a cliente by id
     * @param id_usuario
     * @return 
     */
    Usuario findById(Integer id_usuario);

    /**
     * Returns all the clientes in the database
     * @return 
     */
    List<Usuario> findAll();
}
