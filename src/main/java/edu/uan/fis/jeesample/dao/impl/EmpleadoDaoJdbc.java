package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.EmpleadoDao;
import edu.uan.fis.jeesample.dto.Empleado;
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
 * Empleado DAO implementation using JDBC
 */
public class EmpleadoDaoJdbc implements EmpleadoDao {
    
    public Empleado create(Empleado empleado) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the empleado in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO empleado (id_empleado, nombre_empleado, direccion, telefono) VALUES(" + empleado.getIdempleado() + ",'" + empleado.getNombreempleado() + "','" + empleado.getDireccion()+ "','" + empleado.getTelefono()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return empleado;
    }
    
    public Empleado update(Empleado empleado) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the empleado in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE empleado set nombre_empleado='" + empleado.getNombreempleado() + "', direccion = '" + empleado.getDireccion()+ "', telefono = '" + empleado.getTelefono()+ " ' where id_empleado = "+empleado.getIdempleado()  );
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return empleado;
    }
    
    public void delete(Empleado cliente) {
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
            stmt.executeUpdate("DELETE FROM empleado where id_empleado = "+cliente.getIdempleado()  );
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Empleado findById(Integer clienteId) {
        // Sample code
        Empleado cliente = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_empleado, nombre_empleado FROM cliente where id_usurio = "+ clienteId);
            if(rs.next()){
                cliente = new Empleado();
                cliente.setIdempleado(rs.getInt("id_cliente"));
                cliente.setNombreempleado(rs.getString("nombre_empleado"));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cliente;
    }
    
    public List<Empleado> findAll() {
         // Sample code
        List<Empleado> userList = new ArrayList<Empleado>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tiendapc","vimeron","vimer");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_empleado, nombre_empleado, direccion, telefono  FROM empleado ORDER BY nombre_empleado");
            while(rs.next()){
                Empleado cliente = new Empleado();
                cliente.setIdempleado(rs.getInt("id_empleado"));
                cliente.setNombreempleado(rs.getString("nombre_empleado"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                userList.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return userList;
    }
}
