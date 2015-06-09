   
package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.FacturaDao;
import edu.uan.fis.jeesample.dto.Factura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Product DAO implementation using JDBC
 */
public class FacturaDaoJdbc implements FacturaDao {
    
    public Factura create(Factura factura) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO factura VALUES(" + factura.getIdfactura() + "," + factura.getIdusurio() + "," + factura.getTotal() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return factura;
    }
    
    public Factura update(Factura facturaventa) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE factura set total=" + facturaventa.getTotal() + " where id_factura = "+facturaventa.getIdfactura()  );
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturaventa;
    }
    
    public void delete(Factura factura) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM factura where facturaId = "+factura.getIdfactura()  );
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Factura findById(Integer facturaId) {
        // Sample code
        Factura factura = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_factura, id_usuario, total FROM factura where id_factura = "+ facturaId);
            if(rs.next()){
                factura = new Factura();
                factura.setIdfactura(rs.getInt("id_factura"));
                factura.setIdusuario(rs.getInt("id_usuario"));
                factura.setTotal(rs.getInt("total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return factura;
    }
    
    public List<Factura> findAll() {
         // Sample code
        List<Factura> facturaList = new ArrayList<Factura>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_factura, id_usuario, total FROM factura");
            while(rs.next()){
                Factura factura = new Factura();
                factura.setIdfactura(rs.getInt("id_factura"));
                factura.setIdusuario(rs.getInt("id_usuario"));
                factura.setTotal(rs.getInt("total"));
                facturaList.add(factura);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturaList;
    }
}



