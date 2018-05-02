/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue May 01 20:32:32 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.ipn.mx.orm;

import com.ipn.mx.model.PreguntaKey;
import com.ipn.mx.model.Pregunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import com.ipn.mx.dao.PreguntaDAO;

/**
 * This class provides methods to populate DB Table of Pregunta
 */
public class PreguntaDAOImpl implements PreguntaDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO Pregunta ("
        + "idPregunta, texto, examen_idexamen, RespuestaCorrecta"
        + ") VALUES (?, ?, ?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "idPregunta, texto, examen_idexamen, RespuestaCorrecta "
        + "FROM Pregunta WHERE "
        + "idPregunta = ? AND examen_idexamen = ? AND RespuestaCorrecta = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE Pregunta SET "
        + "texto = ? "
        + "WHERE "
        + "idPregunta = ? AND examen_idexamen = ? AND RespuestaCorrecta = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM Pregunta WHERE "
        + "idPregunta = ? AND examen_idexamen = ? AND RespuestaCorrecta = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Pregunta bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, bean.getIdpregunta());
            ps.setString(2, bean.getTexto());
            ps.setInt(3, bean.getExamenIdexamen());
            ps.setInt(4, bean.getRespuestacorrecta());
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
    public Pregunta load(PreguntaKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setInt(1, key.getIdpregunta());
            ps.setInt(2, key.getExamenIdexamen());
            ps.setInt(3, key.getRespuestacorrecta());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Pregunta) results.get(0);
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
    public void update(Pregunta bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getTexto());
            ps.setInt(2, bean.getIdpregunta());
            ps.setInt(3, bean.getExamenIdexamen());
            ps.setInt(4, bean.getRespuestacorrecta());
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
    public void delete(PreguntaKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, key.getIdpregunta());
            ps.setInt(2, key.getExamenIdexamen());
            ps.setInt(3, key.getRespuestacorrecta());
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
    protected List<Pregunta> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Pregunta>();
        while (rs.next()) {
            Pregunta bean = new Pregunta();
            bean.setIdpregunta(rs.getInt("idPregunta"));
            bean.setTexto(rs.getString("texto"));
            bean.setExamenIdexamen(rs.getInt("examen_idexamen"));
            bean.setRespuestacorrecta(rs.getInt("RespuestaCorrecta"));
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