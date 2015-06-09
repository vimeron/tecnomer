package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.CatalogoDao;
import edu.uan.fis.jeesample.dto.Catalogo;
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
 * Catalogo DAO implementation using JDBC
 */
public class CatalogoDaoJdbc implements CatalogoDao {
    
    public Catalogo create(Catalogo catalogo) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the catalogo in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO catalogo VALUES(" + catalogo.getCatalogoId() + ",'" + catalogo.getName() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return catalogo;
    }
    
    public Catalogo update(Catalogo catalogo) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the catalogo in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE catalogo set nombre_catalogo='" + catalogo.getName() + "' where id_catalogo = "+catalogo.getCatalogoId()  );
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return catalogo;
    }
    
    public void delete(Catalogo catalogo) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the catalogo in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM catalogo where id_catalogo = "+catalogo.getCatalogoId()  );
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Catalogo findById(Integer catalogoId) {
        // Sample code
        Catalogo catalogo = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the catalogo in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_catalogo, nombre_catalago FROM catalogo where id_catalogo = "+ catalogoId);
            if(rs.next()){
                catalogo = new Catalogo();
                catalogo.setCatalogoId(rs.getInt("id_catalogo"));
                catalogo.setName(rs.getString("nombre_catalogo"));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return catalogo;
    }
    
    public List<Catalogo> findAll() {
         // Sample code
        List<Catalogo> catalogoList = new ArrayList<Catalogo>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the catalogo in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_catalogo, nombre_catalogo FROM catalogo");
            while(rs.next()){
                Catalogo catalogo = new Catalogo();
                catalogo.setCatalogoId(rs.getInt("id_catalogo"));
                catalogo.setName(rs.getString("nombre_catalogo"));
                catalogoList.add(catalogo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatalogoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return catalogoList;
    }
}
