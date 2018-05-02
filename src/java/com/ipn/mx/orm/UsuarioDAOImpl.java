/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue May 01 20:32:32 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.ipn.mx.orm;

import com.ipn.mx.model.UsuarioKey;
import com.ipn.mx.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import com.ipn.mx.dao.UsuarioDAO;

/**
 * This class provides methods to populate DB Table of Usuario
 */
public class UsuarioDAOImpl implements UsuarioDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO Usuario ("
        + "idUsuarios, email, nombre, apellidoPaterno, apellidoMaterno, username, password"
        + ") VALUES (?, ?, ?, ?, ?, ?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "idUsuarios, email, nombre, apellidoPaterno, apellidoMaterno, username, password "
        + "FROM Usuario WHERE "
        + "idUsuarios = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE Usuario SET "
        + "email = ?, nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, username = ?, password = ? "
        + "WHERE "
        + "idUsuarios = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM Usuario WHERE "
        + "idUsuarios = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Usuario bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, bean.getIdusuarios());
            ps.setString(2, bean.getEmail());
            ps.setString(3, bean.getNombre());
            ps.setString(4, bean.getApellidopaterno());
            ps.setString(5, bean.getApellidomaterno());
            ps.setString(6, bean.getUsername());
            ps.setString(7, bean.getPassword());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }

    /**
     * Retrive a record from Database.
     * @param beanKey   The PK Object to be retrived.
     * @param conn      JDBC Connection.
     * @exception       SQLException if something is wrong.
     */
    public Usuario load(UsuarioKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setInt(1, key.getIdusuarios());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Usuario) results.get(0);
            else
                return null;
        }finally {
            close(rs);
            close(ps);
        }
    }

    /**
     * Update a record in Database.
     * @param bean   The Object to be saved.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void update(Usuario bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getEmail());
            ps.setString(2, bean.getNombre());
            ps.setString(3, bean.getApellidopaterno());
            ps.setString(4, bean.getApellidomaterno());
            ps.setString(5, bean.getUsername());
            ps.setString(6, bean.getPassword());
            ps.setInt(7, bean.getIdusuarios());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }

    /**
     * Create a new record in Database.
     * @param bean   The PK Object to be deleted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void delete(UsuarioKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, key.getIdusuarios());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }
    
    /**
     * Populate the ResultSet.
     * @param rs     The ResultSet.
     * @return       The Object to retrieve from DB.
     * @exception    SQLException if something is wrong.
     */
    protected List<Usuario> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Usuario>();
        while (rs.next()) {
            Usuario bean = new Usuario();
            bean.setIdusuarios(rs.getInt("idUsuarios"));
            bean.setEmail(rs.getString("email"));
            bean.setNombre(rs.getString("nombre"));
            bean.setApellidopaterno(rs.getString("apellidoPaterno"));
            bean.setApellidomaterno(rs.getString("apellidoMaterno"));
            bean.setUsername(rs.getString("username"));
            bean.setPassword(rs.getString("password"));
            results.add(bean);
        }
        return results;
    }

    /**
     * Close JDBC Statement.
     * @param stmt  Statement to be closed.
     */
    protected void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            }catch(SQLException e){}
        }
    }

    /**
     * Close JDBC ResultSet.
     * @param rs  ResultSet to be closed.
     */
    protected void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            }catch(SQLException e){}
        }
    }
}