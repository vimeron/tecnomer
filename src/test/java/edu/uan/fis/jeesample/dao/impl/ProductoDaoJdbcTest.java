package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Producto;
import java.util.List;
import junit.framework.TestCase;

public class ProductoDaoJdbcTest extends TestCase {
    
    public ProductoDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

   // public void testCreate() {
     //   System.out.println("create");
     // Producto producto = new Producto();
     //   producto.setIdproducto("1");
     //   producto.setNombreproducto("Jabon");
     //   producto.setIdcatalogo("1");
     //   producto.setValor("100");
     //   producto.setImagen("ImagenNoDisponible.png");
     //   ProductoDaoJdbc instance = new ProductoDaoJdbc();
     //   Producto expResult = producto;
     //   Producto result = instance.create(producto);
     //   assertEquals(expResult, result);
    //}

    public void testUpdate() {
        System.out.println("update");
        Producto producto = new Producto();
        producto.setNombreproducto("champu");
        producto.setIdcatalogo("1");        
        ProductoDaoJdbc instance = new ProductoDaoJdbc();
        Producto expResult = producto;
        Producto result = instance.update(producto);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   public void testDelete() {
       System.out.println("delete");
       Producto producto = new Producto();
       producto.setIdproducto("1");
       ProductoDaoJdbc instance = new ProductoDaoJdbc();
       instance.delete(producto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        String productId = "1";
        ProductoDaoJdbc instance = new ProductoDaoJdbc();
        Producto expResult = null;
        Producto result = instance.findById(productId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        ProductoDaoJdbc instance = new ProductoDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
