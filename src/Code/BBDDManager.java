/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author David
 */
public class BBDDManager {

    Connection conect = null;

    public void connectionPool() {
        BasicDataSource bdSource=new BasicDataSource();
        bdSource.setUrl ("jdbc:mysql://localhost:3306/discografica?serverTimezone=UTC");
        bdSource.setUsername("root");
        bdSource.setPassword ("");
        try {
            conect=bdSource.getConnection();
            if(conect!=null){
                System.out.println("Conexion creada");
            } else {
                System.out.println("Conexion no creada");
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void conection() {
        try {
            String url = "jdbc:mysql://localhost:3306/discografica?serverTimezone=UTC";
            String user = "root";
            String password = "";

            conect = DriverManager.getConnection(url, user, password);
            if (conect != null) {
                System.out.println("Conectado!");
            }

        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }

    public void close() {
        try {
            conect.close();
            System.out.println("Desconectado!");
        } catch (Exception e) {
            System.out.println("No se puede desconectar");
        }
    }
}
