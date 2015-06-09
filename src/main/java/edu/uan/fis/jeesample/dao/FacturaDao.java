package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Factura;
import java.util.List;

public interface FacturaDao {

    /**
     * Creates a new 
     * @param factura
     * @return 
     */
    Factura create(Factura factura);

    /**
     * Updates an existing 
     * @param factura
     * @return 
     */
    Factura update(Factura factura);

    /**
     * Deletes 
     * @param facturaventa 
     */
    void delete(Factura facturaventa);

    /**
     * Find a  by id
     * @param id_factura
     * @return 
     */
    Factura findById(Integer id_factura);

    /**
     * Returns all the products in the database
     * @return 
     */
    List<Factura> findAll();
}
