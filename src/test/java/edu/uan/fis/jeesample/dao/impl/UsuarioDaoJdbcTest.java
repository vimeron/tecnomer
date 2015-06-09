package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Usuario;
import java.util.List;
import junit.framework.TestCase;

public class UsuarioDaoJdbcTest extends TestCase {
    
    public UsuarioDaoJdbcTest(String testName) {
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
        Usuario cliente = new Usuario();
        cliente.setIdusuario(1);
        cliente.setNombreusuario("Angelica Calderon");
        UsuarioDaoJdbc instance = new UsuarioDaoJdbc();
        Usuario expResult = cliente;
        Usuario result = instance.create(cliente);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Usuario cliente = new Usuario();
        cliente.setNombreusuario("ana sandoval");  
        cliente.setIdusuario(1);                   
        UsuarioDaoJdbc instance = new UsuarioDaoJdbc();
        Usuario expResult = cliente;
        Usuario result = instance.update(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testDelete() {
      System.out.println("delete");
        Usuario cliente = new Usuario();
        cliente.setIdusuario(1);
       UsuarioDaoJdbc instance = new UsuarioDaoJdbc();
       instance.delete(cliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer clienteId = 1;
        UsuarioDaoJdbc instance = new UsuarioDaoJdbc();
        Usuario expResult = null;
        Usuario result = instance.findById(clienteId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        UsuarioDaoJdbc instance = new UsuarioDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
