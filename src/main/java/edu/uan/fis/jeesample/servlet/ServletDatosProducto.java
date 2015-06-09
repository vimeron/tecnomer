package edu.uan.fis.jeesample.servlet;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.impl.ListProducts;
import edu.uan.fis.jeesample.dao.ProductoDao;
import edu.uan.fis.jeesample.dao.impl.ProductoDaoJdbc;
import edu.uan.fis.jeesample.dto.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDatosProducto")
public class ServletDatosProducto extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String id_producto = request.getParameter("id_producto");
        
        ProductoDao dao = new ProductoDaoJdbc();
        Producto producto = dao.findById(id_producto);
       
        // set up response to client
        response.setContentType( "text/html" ); 
        PrintWriter out = response.getWriter();

        // start XHTML document
        out.println( "<?xml version = \"1.0\"?>" );

        out.println( "<!DOCTYPE html PUBLIC \"-//W3C//DTD " +
           "XHTML 1.0 Strict//EN\" \"http://www.w3.org" +
           "/TR/xhtml1/DTD/xhtml1-strict.dtd\">" ); 

        out.println( 
           "<html xmlns = \"http://www.w3.org/1999/xhtml\">" );

        // head section of document
        out.println( "<head>" );  
        
        out.println( "<title>Lista de Productos</title>" );

        out.println("<link href='css/estilos.css' rel='stylesheet' type='text/css'>");
        out.println( "</head>" );  
         
        out.println( "<body>" );  
        
        out.println ("<div class='Container'>");
        
        out.println ("<div id='logo'><img src='images/logo.png' alt='Logo' width='150'></div>");
                
            out.println ("<div id='title'>");
                out.println("<h1>LISTADO DE PRODUCTOS</h1>");
            out.println ("</div>");
            
            out.println("<div id='content'>");

                out.println("<table align='center'>"
                    + "<thead>"
                        + "<tr>"
                        + "<th>ID</th>"
                        + "<th>Imagen</th>"
                        + "<th>Producto</th>"
                        + "<th>Valor</th>"
                        + "<th>Catálogo</th>"
                        + "</tr>"
                    + "</thead>"
                    + "<tbody>");
                
                out.println("<tr>"
                        + "<td align='center'>" + producto.getIdproducto() + "</td>"
                        + "<td align='center'><img src='images/" + producto.getImagen()+ "' width='100' height='100'></td>"
                        + "<td><a href='catalog/updateProduct.jsp?"
                            + "id=" + producto.getIdproducto() + "&"
                            + "prod=" + producto.getNombreproducto()+ "&"
                            + "val=" + producto.getValor()+ "&"
                            + "cat=" + producto.getIdCatalogo()+ "&"
                            + "img=" + producto.getImagen()+ "'>" + producto.getNombreproducto()+ "</a></td>"
                        + "<td align='right'>" + producto.getValor()+ "</td>"
                        + "<td align='center'>" + producto.getIdCatalogo()+ "</td>"
                        + "</tr>");
                
                out.println("</tbody>"
                + "</table>");
                
                out.println ("Nota: Para actualizar el producto de clic sobre el nombre.");
                
                out.println ("<div class='enlace'><a href='admin.jsp'>Volver</a></div>");
            
            out.println ("</div>");
        out.println ("</div>");        
        // end XHTML document
         out.println( "</body></html>" );         
         out.close();
        
        
    }
}