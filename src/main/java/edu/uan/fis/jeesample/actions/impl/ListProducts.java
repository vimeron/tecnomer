package edu.uan.fis.jeesample.actions.impl;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.ICommand;
import edu.uan.fis.jeesample.dao.ProductoDao;
import edu.uan.fis.jeesample.dao.impl.ProductoDaoJdbc;
import edu.uan.fis.jeesample.dto.Producto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample command action to query all the available products
 * @author wjforero
 */
public class ListProducts implements ICommand {

    @Override
    public CommandResult findAll(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            System.out.println("listar OK");
          //  String parameter1 = request.getParameter("paramater1"); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ProductoDao dao = new ProductoDaoJdbc();
            List<Producto> producto = dao.findAll();
            // store the products in the request, so them can be painted in the view
            request.setAttribute("productList", producto);
            // 3. Finally, returns the command result
            result.setResult("productList");
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
            System.out.println("buscar OK");
            String id_producto = request.getParameter("id_producto");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ProductoDao dao = new ProductoDaoJdbc();
            Producto producto = dao.findById(id_producto);
            // store the products in the request, so them can be painted in the view
            request.setAttribute("productList", producto);
            // 3. Finally, returns the command result
            result.setResult("productList");
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
            System.out.println("insertar OK");
            String id_producto = request.getParameter("id_producto");
            String nombre_producto = request.getParameter("nombre_producto"); // dummy parameter
            String valor = request.getParameter("valor");
            String id_catalogo = request.getParameter("id_catalogo");
            String imagen = request.getParameter("imagen");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ProductoDao dao = new ProductoDaoJdbc();
            
            Producto datos = new Producto();
            datos.setIdproducto(id_producto);
            datos.setNombreproducto(nombre_producto);
            datos.setValor(valor);
            datos.setIdcatalogo(id_catalogo);
            datos.setImagen(imagen);
        
            Producto producto = dao.create(datos);
            // store the products in the request, so them can be painted in the view
            request.setAttribute("productList", producto);
            // 3. Finally, returns the command result
            result.setResult("productList");
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
            System.out.println("actualizar OK");
            String id_producto = request.getParameter("id_producto");
            String nombre_producto = request.getParameter("nombre_producto"); // dummy parameter
            String valor = request.getParameter("valor");
            String id_catalogo = request.getParameter("id_catalogo");
            String imagen = request.getParameter("imagen");

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ProductoDao dao = new ProductoDaoJdbc();
            
            Producto datos = new Producto();
            datos.setIdproducto(id_producto);
            datos.setNombreproducto(nombre_producto);
            datos.setValor(valor);
            datos.setIdcatalogo(id_catalogo);
            datos.setImagen(imagen);
            
            Producto producto = dao.update(datos); 
            // store the products in the request, so them can be painted in the view
            request.setAttribute("productList", producto);
            // 3. Finally, returns the command result
            result.setResult("productList");
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
            System.out.println("borrar OK");
            String id_producto = request.getParameter("id_producto"); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ProductoDao dao = new ProductoDaoJdbc();
            Producto datos = new Producto();
            datos.setIdproducto(id_producto);
            dao.delete(datos);
            // store the products in the request, so them can be painted in the view
            //request.setAttribute("productList", producto);
            // 3. Finally, returns the command result
            result.setResult("productList");
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
