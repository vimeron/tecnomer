package edu.uan.fis.jeesample.actions.impl;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.ICommand;
import edu.uan.fis.jeesample.dao.EmpleadoDao;
import edu.uan.fis.jeesample.dao.impl.EmpleadoDaoJdbc;
import edu.uan.fis.jeesample.dto.Empleado;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample command action to query all the available products
 * @author wjforero
 */
public class ListEmpleados implements ICommand {

    @Override
    public CommandResult findAll(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("listar empleado OK");
          //  String parameter1 = request.getParameter("paramater1"); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            EmpleadoDao dao = new EmpleadoDaoJdbc();
            List<Empleado> empleado = dao.findAll();
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", empleado);
            // 3. Finally, returns the command result
            result.setResult("userList");
        } catch (Exception e) {
            Logger.getLogger(ListProducts.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    @Override
    public CommandResult findById(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("buscar empleado OK");
            int id_empleado = Integer.parseInt(request.getParameter("id_empleado"));

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            EmpleadoDao dao = new EmpleadoDaoJdbc();
            Empleado empleado = dao.findById(id_empleado);
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", empleado);
            // 3. Finally, returns the command result
            result.setResult("userList");
        } catch (Exception e) {
            Logger.getLogger(ListProducts.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    @Override
    public CommandResult create(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("insertar empleado OK");
            int id_empleado = Integer.parseInt(request.getParameter("id_empleado"));
            String nombre_empleado = request.getParameter("nombre_empleado"); // dummy parameter
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            EmpleadoDao dao = new EmpleadoDaoJdbc();
            
            Empleado datos = new Empleado();
            datos.setIdempleado(id_empleado);
            datos.setNombreempleado(nombre_empleado);
            datos.setDireccion(direccion);
            datos.setTelefono(telefono);
        
            Empleado empleado = dao.create(datos);
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", empleado);
            // 3. Finally, returns the command result
            result.setResult("userList");
        } catch (Exception e) {
            Logger.getLogger(ListProducts.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    @Override
    public CommandResult update(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("actualizar empleado OK");
            int id_empleado = Integer.parseInt(request.getParameter("id_empleado"));
            String nombre_empleado = request.getParameter("nombre_empleado"); // dummy parameter
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            EmpleadoDao dao = new EmpleadoDaoJdbc();
            
            Empleado datos = new Empleado();
            datos.setIdempleado(id_empleado);
            datos.setNombreempleado(nombre_empleado);
            datos.setDireccion(direccion);
            datos.setTelefono(telefono);
            
            Empleado empleado = dao.update(datos); 
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", empleado);
            // 3. Finally, returns the command result
            result.setResult("userList");
        } catch (Exception e) {
            Logger.getLogger(ListProducts.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    @Override
    public CommandResult delete(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("borrar empleado OK");
            int id_empleado = Integer.parseInt(request.getParameter("id_empleado")); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            EmpleadoDao dao = new EmpleadoDaoJdbc();
            Empleado datos = new Empleado();
            datos.setIdempleado(id_empleado);
            dao.delete(datos);
            // store the products in the request, so them can be painted in the view
            //request.setAttribute("userList", empleado);
            // 3. Finally, returns the command result
            result.setResult("userList");
        } catch (Exception e) {
            Logger.getLogger(ListProducts.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    
    
}
