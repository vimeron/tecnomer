package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Catalogo;
import java.util.List;
import junit.framework.TestCase;

public class CatalogoDaoJdbcTest extends TestCase {
    
    public CatalogoDaoJdbcTest(String testName) {
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
        Catalogo catalogo = new Catalogo();
        catalogo.setCatalogoId(1);
        catalogo.setName("Aseo");
        CatalogoDaoJdbc instance = new CatalogoDaoJdbc();
        Catalogo expResult = catalogo;
        Catalogo result = instance.create(catalogo);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Catalogo catalogo = new Catalogo();
        catalogo.setName("Hogar");  
        catalogo.setCatalogoId(1);                   
        CatalogoDaoJdbc instance = new CatalogoDaoJdbc();
        Catalogo expResult = catalogo;
        Catalogo result = instance.update(catalogo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testDelete() {
      System.out.println("delete");
        Catalogo catalogo = new Catalogo();
        catalogo.setCatalogoId(1);
       CatalogoDaoJdbc instance = new CatalogoDaoJdbc();
       instance.delete(catalogo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer catalogoId = 1;
        CatalogoDaoJdbc instance = new CatalogoDaoJdbc();
        Catalogo expResult = null;
        Catalogo result = instance.findById(catalogoId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        CatalogoDaoJdbc instance = new CatalogoDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
