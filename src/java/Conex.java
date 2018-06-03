
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Conex {

    public Conex() {
    }
        public Connection obtenerConexion() throws ClassNotFoundException, SQLException{
        try{
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/unicourse";
        String usuario="root";
        String clave="1234";
        con= DriverManager.getConnection(url,usuario,clave);
        return con;
        }catch(ClassNotFoundException|SQLException e){
             System.out.println(e);
         }
            return null;
        
    }
}
