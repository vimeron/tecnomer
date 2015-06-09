package edu.uan.fis.jeesample.servlet;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.impl.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrontController", urlPatterns = {"*.do"})
public class FrontController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Front controller servlet parses the URL to get the requested 
        // action and send the control of this action to the appropriate 
        // command class

        String desiredAction = request.getServletPath();
        String destination = null;
        CommandResult result = null;
        RequestDispatcher dispatcher; 
        // TODO: read the cases from a configuration file. Extra points!!!
        switch (desiredAction) {
            
            // OPCIONES PARA PRODUCTOS
            case "/listProducts.do":
                System.out.println("listando...");
                result = new ListProducts().findAll(request, response);
                destination = "/ServletListaProductos";
                // the front controller redirects the user to the appropriate view
                dispatcher = request.getServletContext().getRequestDispatcher(destination);
                dispatcher.forward(request, response);
                break;
                
            case "/findProduct.do":
                System.out.println("buscando...");
                result = new ListProducts().findById(request, response);
                destination = "/ServletDatosProducto";
                // the front controller redirects the user to the appropriate view
                dispatcher = request.getServletContext().getRequestDispatcher(destination);
                dispatcher.forward(request, response);
                break;
            case "/insertProduct.do":
                System.out.println("insertando ... ");
                //response.getWriter().print("insertar OK");
                result = new ListProducts().create(request, response);
                break;
            case "/updateProduct.do":
                System.out.println("actualizando...");
                result = new ListProducts().update(request, response);
                break;
            case "/deleteProduct.do":
                System.out.println("borrando...");
                result = new ListProducts().delete(request, response);
                break;
                
            // OPCIONES PARA USUARIOS
                
            case "/listUsuarios.do":
                System.out.println("listando...");
                result = new ListUsuarios().findAll(request, response);
                destination = "/ServletListaUsuarios";
                // the front controller redirects the user to the appropriate view
                dispatcher = request.getServletContext().getRequestDispatcher(destination);
                dispatcher.forward(request, response);
                break;
                
            case "/insertUsuario.do":
                System.out.println("insertando ... ");
                //response.getWriter().print("insertar OK");
                result = new ListUsuarios().create(request, response);
                break;
                
                
            // OPCIONES PARA EMPLEADOS
                
            case "/listEmpleados.do":
                System.out.println("listando...");
                result = new ListEmpleados().findAll(request, response);
                destination = "/ServletListaEmpleados";
                // the front controller redirects the user to the appropriate view
                dispatcher = request.getServletContext().getRequestDispatcher(destination);
                dispatcher.forward(request, response);
                break;
                
            case "/insertEmpleado.do":
                System.out.println("insertando ... ");
                //response.getWriter().print("insertar OK");
                result = new ListEmpleados().create(request, response);
                break;
                
            case "home.do":
            default:
                result = new CommandResult();
        }
        
        System.out.println(result.getResult());

        // Depending on the command result choose the appropriate view
        // You can add new cases according tou your design
        // TODO: read the cases from a configuration file. Extra points!!!
        switch (result.getResult()) {
            case "error":
                destination = "/error.jsp";
                break;
            case "productList":
                destination = "/admin.jsp";
                break;
                
            case "userList":
                destination = "/admin.jsp";
                //destination = "/catalog/listProducts.jsp";
                break;
            case "home":
            default:
                destination = "/ServletListadoTiendapc";
        }

            // Using a dispatcher class and the result of the command execution
        // the front controller redirects the user to the appropriate view
        dispatcher = request.getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Front controller servlet";
    }// </editor-fold>

}
