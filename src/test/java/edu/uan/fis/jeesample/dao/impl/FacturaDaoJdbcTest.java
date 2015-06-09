package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Factura;
import java.util.List;
import junit.framework.TestCase;

public class FacturaDaoJdbcTest extends TestCase {
    
    public FacturaDaoJdbcTest(String testName) {
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

    public void testCreate() {
        System.out.println("create");
        Factura factura = new Factura();
        factura.setIdfactura(1);
        factura.setIdusuario(1);
        factura.setTotal(9999);
        FacturaDaoJdbc instance = new FacturaDaoJdbc();
        Factura expResult = factura;
        Factura result = instance.create(factura);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Factura facturaventa = new Factura();
        facturaventa.setIdfactura(1);
        facturaventa.setTotal(33000);      
        FacturaDaoJdbc instance = new FacturaDaoJdbc();
        Factura expResult = facturaventa;
        Factura result = instance.update(facturaventa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   public void testDelete() {
     System.out.println("delete");
       Factura facturaventa = new Factura();
       facturaventa.setIdfactura(1);
       FacturaDaoJdbc instance = new FacturaDaoJdbc();
      instance.delete(facturaventa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer facturaId = 1;
        FacturaDaoJdbc instance = new FacturaDaoJdbc();
        Factura expResult = null;
        Factura result = instance.findById(facturaId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        FacturaDaoJdbc instance = new FacturaDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
