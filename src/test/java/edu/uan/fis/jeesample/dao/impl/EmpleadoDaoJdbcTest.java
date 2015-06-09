package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Empleado;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class EmpleadoDaoJdbcTest extends TestCase {
    
    public EmpleadoDaoJdbcTest(String testName) {
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

    

    public void testUpdate() {
        System.out.println("update");
        Empleado cliente = new Empleado();
        cliente.setNombreempleado("ana sandoval");  
        cliente.setIdempleado(1);                   
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        Empleado expResult = cliente;
        Empleado result = instance.update(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testDelete() {
      System.out.println("delete");
        Empleado cliente = new Empleado();
        cliente.setIdempleado(1);
       EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
       instance.delete(cliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer clienteId = 1;
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        Empleado expResult = null;
        Empleado result = instance.findById(clienteId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
