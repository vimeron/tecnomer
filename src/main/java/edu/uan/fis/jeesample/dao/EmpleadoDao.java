package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Empleado;
import java.util.List;

public interface EmpleadoDao {

    /**
     * Creates a new empleado. 
     * @param empleado
     * @return 
     */
    Empleado create(Empleado empleado);

    /**
     * Updates an existing cliente. Empleado id can't be modified.
     * @param empleado
     * @return 
     */
    Empleado update(Empleado empleado);

    /**
     * Deletes an existing cempleado
     * @param empleado
     */
    void delete(Empleado empleado);

    /**
     * Find a cliente by id
     * @param id_empleado
     * @return 
     */
    Empleado findById(Integer id_empleado);

    /**
     * Returns all the clientes in the database
     * @return 
     */
    List<Empleado> findAll();
}
