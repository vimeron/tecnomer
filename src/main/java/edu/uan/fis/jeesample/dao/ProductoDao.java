package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Producto;
import java.util.List;

public interface ProductoDao {

   /**
     * Creates a new product. 
     * @param producto
     * @return 
     */
    Producto create(Producto producto);

    /**
     * Updates an existing product. Product id can't be modified.
     * @param producto
     * @return 
     */
    Producto update(Producto producto);

    /**
     * Deletes an existing product
     * @param producto 
     */
    void delete(Producto producto);

    /**
     * Find a product by id
     * @param id_producto
     * @return 
     */
    Producto findById(String id_producto);

    /**
     * Returns all the products in the database
     * @return 
     */
    List<Producto> findAll();
}
