/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author David
 */
public class BBDDManager {

    Connection connect = null;

    public boolean connectionPool() {
        BasicDataSource bdSource = new BasicDataSource();
        bdSource.setUrl("jdbc:mysql://localhost:3306/discografia?serverTimezone=UTC");
        bdSource.setUsername("root");
        bdSource.setPassword("");
        boolean connected = false;
        try {
            connect = bdSource.getConnection();
            if (connect != null) { 
                return true;
            } else {
                System.err.println("Conexion no creada");

            }
        } catch (Exception e) {

        }
        return false;
    }

    public void close() {
        try {
            connect.close();
        } catch (Exception e) {
            System.err.println("No se puede desconectar");
        }
    }

    public ArrayList<String> getAlbum() {
        ArrayList<String> album = new ArrayList<String>();
        Statement sta;
        try {
            sta = connect.createStatement();
            String query = "SELECT nombre_album from albumes";
            ResultSet rs = sta.executeQuery(query);
            int i = 0;
            while (rs.next()) {
                album.add(rs.getString("nombre_album"));
            }
        } catch (Exception e) {
            System.err.println("No se encontraron los albumes");
        }
        return album;
    }

    public void deleteSong(String nameSong) {
        Statement sta;
        try {
            sta = connect.createStatement();
            sta.executeUpdate("Delete from canciones where nombre_cancion='" + nameSong + "';");
            sta.close();
        } catch (Exception e) {
            System.err.println("No se pudo borrar la cancion");
        }
    }

    public void updateSong(String nameSong, String newName, int newAlbum, String _newDuration) {
        Statement sta;
        String query = "UPDATE canciones SET";
        // Vamos añadiendo los distintos valores que queremos cambiar con una flag para 
        // que no nos de un error con la query
        boolean aux = false;
        if (!newName.equals("")) {
            query += " nombre_cancion = '" + newName+"'";
            aux = true;
        }
        if (newAlbum != 0) {
            if (aux) {
                query += ",";
            }
            query += " album='" + newAlbum + "' ";
            aux = true;
        }
        if (!_newDuration.equals("")) {
            if (aux) {
                query += ",";
            }
            int newDuration = Integer.parseInt(_newDuration);
            query += " duracion_seg='" + newDuration + "' ";
            aux = true;
        }
        try {
            if (aux) {
                sta = connect.createStatement();
                
                query += " WHERE nombre_cancion like '" + nameSong + "';";
                sta.executeUpdate(query);               
                sta.close();
            }
        } catch (Exception e) {
            System.err.println("No se pudo cambiar los datos de la cancion");
        }
    }

    public ArrayList<String> getSong() {
        ArrayList<String> song = new ArrayList<String>();
        Statement sta;
        try {
            sta = connect.createStatement();
            String query = "SELECT nombre_cancion from canciones";
            ResultSet rs = sta.executeQuery(query);
            int i = 0;
            while (rs.next()) {
                song.add(rs.getString("nombre_cancion"));
            }
        } catch (Exception e) {
            System.err.println("No se encontraron las canciones");
        }
        return song;
    }

    public String[][] getDataSongs(String _album) {
        
        String query;
        String[][] data;
        try {
            Statement sta = connect.createStatement();
            query = "select c.* , a.*  from canciones c inner join albumes a  on c.album = a.id_album WHERE a.nombre_album='" + _album + "'";
            ResultSet rs = sta.executeQuery(query);
            rs = sta.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            data = new String[3][16];
            int i = 0;
            while (rs.next()) {
                data[0][i] = rs.getString("nombre_cancion");
                data[1][i] = rs.getString("artista");
                data[2][i] = rs.getString("duracion_seg")+" seg.";
                i++;
            }
            return data;
        } catch (Exception e) {
            System.err.println("No se encontraron los albumes");
        }
        data = new String[0][0];
        return data;
    }
    
//    public void addColumn(){
//        try{
//            Statement sta =connect.createStatement();
//            String query="";
//            sta.execute(query);
//            sta.close();
//        }catch(Exception e) {
//            
//        }
//    }
    
    public void addSong(String songName, int album, int duration) {
        Statement sta;
        try {
            sta = connect.createStatement();
            sta.executeUpdate("INSERT INTO canciones ( nombre_cancion, album,duracion_seg) VALUES('" + songName + "', '" + album + "','" + duration + "');");
            sta.close();
        } catch (Exception e) {
            System.err.println("No se pudo añadir a albumes");
        }
    }

    public void addAlbum(String albumName, String artist, String date) {
        Statement sta;
        try {
            sta = connect.createStatement();
            sta.executeUpdate("INSERT INTO albumes (nombre_album, artista,fechaSalida) VALUES('" + albumName + "', '" + artist + "','" + date + "');");
            sta.close();
        } catch (Exception e) {
            System.err.println("No se pudo añadir a albumes");
        }
    }

    public void createDataBase() {
        //Ejecutamos todas las duncios 
        Statement sta;
        try {
            sta = connect.createStatement();
            String[] query = {
                "DROP DATABASE IF EXISTS discografia;",
                "CREATE DATABASE discografia;",
                "use discografia;",
                "CREATE TABLE IF NOT EXISTS albumes ( id_album int(11) NOT NULL AUTO_INCREMENT ,  nombre_album varchar(255) NOT NULL, artista varchar(255) NOT NULL,  fechaSalida DATE NOT NULL,PRIMARY KEY (id_album));",
                "CREATE TABLE IF NOT EXISTS canciones (id_cancion int(11) NOT NULL AUTO_INCREMENT ,nombre_cancion varchar(255) NOT NULL,album int(11) NOT NULL,duracion_seg varchar (255) NOT NULL,PRIMARY KEY (id_cancion));",
                "INSERT INTO canciones ( nombre_cancion, album,duracion_seg) VALUES( 'Ew', 1 ,'208'),( 'MODUS', 1 ,'207'),( 'Tick Tock', 1 ,'196'),( 'Daylight', 1 ,'164'),( 'Upgrade', 1 ,'90'),( 'Gimme Love', 1 ,'215'),('Realize', 2 ,'217'),( 'Rejection', 2 ,'246'),('Shot in the dark', 2 ,'185'),('Through the mist of time', 2 ,'212'),('Kick you when youre down', 2 ,'190');",
                "INSERT INTO albumes (nombre_album, artista,fechaSalida) VALUES('Nectar', 'Joji','2020-09-25'),( 'Power Up','AC/DC','2020-11-13');",
                "ALTER TABLE canciones ADD FOREIGN KEY (album) REFERENCES albumes(id_album);"};
            for (int i = 0; i < query.length; i++) {
                sta.executeUpdate(query[i]);
            }
            sta.close();
        } catch (Exception e) {
            System.err.println("No se pudo crear la base de datos");
        }
    }
}
