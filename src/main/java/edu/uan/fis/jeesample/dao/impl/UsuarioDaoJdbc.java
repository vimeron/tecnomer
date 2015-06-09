package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.UsuarioDao;
import edu.uan.fis.jeesample.dto.Usuario;
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
 * Usuario DAO implementation using JDBC
 */
public class UsuarioDaoJdbc implements UsuarioDao {
    
    public Usuario create(Usuario usuario) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the usuario in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO usuario (id_usuario, nombre_usuario, password, pregunta) VALUES(" + usuario.getIdusuario() + ",'" + usuario.getNombreusuario() + "','" + usuario.getPassword()+ "','" + usuario.getPregunta()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }
    
    public Usuario update(Usuario usuario) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the usuario in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE usuario set nombre_usuario='" + usuario.getNombreusuario() + "' where id_usuario = "+usuario.getIdusuario()  );
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }
    
    public void delete(Usuario cliente) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM usuario where id_usuario = "+cliente.getIdusuario()  );
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Usuario findById(Integer clienteId) {
        // Sample code
        Usuario cliente = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_usuario, nombre_usuario FROM cliente where id_usurio = "+ clienteId);
            if(rs.next()){
                cliente = new Usuario();
                cliente.setIdusuario(rs.getInt("id_cliente"));
                cliente.setNombreusuario(rs.getString("nombre_usuario"));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cliente;
    }
    
    public List<Usuario> findAll() {
         // Sample code
        List<Usuario> userList = new ArrayList<Usuario>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_usuario, nombre_usuario FROM usuario ORDER BY nombre_usuario");
            while(rs.next()){
                Usuario cliente = new Usuario();
                cliente.setIdusuario(rs.getInt("id_usuario"));
                cliente.setNombreusuario(rs.getString("nombre_usuario"));
                userList.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return userList;
    }
}
