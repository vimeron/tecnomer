package edu.uan.fis.jeesample.actions.impl;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.ICommand;
import edu.uan.fis.jeesample.dao.UsuarioDao;
import edu.uan.fis.jeesample.dao.impl.UsuarioDaoJdbc;
import edu.uan.fis.jeesample.dto.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample command action to query all the available products
 * @author wjforero
 */
public class ListUsuarios implements ICommand {

    @Override
    public CommandResult findAll(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("listar usuario OK");
          //  String parameter1 = request.getParameter("paramater1"); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            UsuarioDao dao = new UsuarioDaoJdbc();
            List<Usuario> usuario = dao.findAll();
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", usuario);
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
            System.out.println("buscar usuario OK");
            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            UsuarioDao dao = new UsuarioDaoJdbc();
            Usuario usuario = dao.findById(id_usuario);
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", usuario);
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
            System.out.println("insertar usuario OK");
            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String nombre_usuario = request.getParameter("nombre_usuario"); // dummy parameter
            String password = request.getParameter("password");
            String pregunta = request.getParameter("pregunta");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            UsuarioDao dao = new UsuarioDaoJdbc();
            
            Usuario datos = new Usuario();
            datos.setIdusuario(id_usuario);
            datos.setNombreusuario(nombre_usuario);
            datos.setPassword(password);
            datos.setPregunta(pregunta);
        
            Usuario usuario = dao.create(datos);
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", usuario);
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
            System.out.println("actualizar usuario OK");
            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String nombre_usuario = request.getParameter("nombre_usuario"); // dummy parameter
            String password = request.getParameter("password");
            String pregunta = request.getParameter("pregunta");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            UsuarioDao dao = new UsuarioDaoJdbc();
            
            Usuario datos = new Usuario();
            datos.setIdusuario(id_usuario);
            datos.setNombreusuario(nombre_usuario);
            datos.setPassword(password);
            datos.setPregunta(pregunta);
            
            Usuario usuario = dao.update(datos); 
            // store the products in the request, so them can be painted in the view
            request.setAttribute("userList", usuario);
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
            System.out.println("borrar usuario OK");
            int id_usuario = Integer.parseInt(request.getParameter("id_usuario")); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            UsuarioDao dao = new UsuarioDaoJdbc();
            Usuario datos = new Usuario();
            datos.setIdusuario(id_usuario);
            dao.delete(datos);
            // store the products in the request, so them can be painted in the view
            //request.setAttribute("userList", usuario);
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
