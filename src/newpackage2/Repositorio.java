/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import newpackage1.DBManager;

/**
 *
 * @author PERSONAL
 */
public class Repositorio {
    private static DBManager database = new DBManager();

    public static void crear (Persona persona) {
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formato3= DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm");
        try {
            String query = "INSERT INTO infantil (Documento, Nombre, Apellido,  Edad, FechaNacimiento, FechaRegistro, Foto, Puntaje) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            
            sentenciaP.setString(1, String.valueOf(persona.getDocumento()));
            sentenciaP.setString(2, persona.getNombre());
            sentenciaP.setString(3, persona.getApellido());
            sentenciaP.setInt(4, persona.getEdad());
            sentenciaP.setString(5, persona.getFecha());
            LocalDateTime regis= LocalDateTime.now();
            sentenciaP.setString(6, (regis).format(formato3));
            sentenciaP.setString(7, persona.getFoto());
            sentenciaP.setString(8, String.valueOf(persona.getPuntaje()));
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void editar (int documento, int puntaje) {
        
        try {
            String query = "UPDATE infantil SET Puntaje= ? WHERE Documento = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, String.valueOf(puntaje));
            sentenciaP.setString(2, String.valueOf(documento));

            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

     public static ArrayList<Puntajes> obtenerTodos1() {
        ArrayList<Puntajes> puntajes = new ArrayList<Puntajes>();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formato3= DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm");
        try {
            String query = "SELECT * FROM infantil;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                puntajes.add(Puntajes.crear("Infantil",resultado.getString("Nombre"), resultado.getString("Apellido"), resultado.getInt("Edad"), Integer.parseInt(resultado.getString("Puntaje"))));

            }
            String query1 = "SELECT * FROM juvenil;";
            PreparedStatement sentenciaP1 = database.open().prepareStatement(query1);
            ResultSet resultado1 = sentenciaP1.executeQuery();

            while (resultado1.next()) {
                puntajes.add(Puntajes.crear("Juvenil",resultado1.getString("Nombre"), resultado1.getString("Apellido"), resultado1.getInt("Edad"), Integer.parseInt(resultado1.getString("Puntaje"))));

            }
            String query2 = "SELECT * FROM mayores;";
            PreparedStatement sentenciaP2 = database.open().prepareStatement(query2);
            ResultSet resultado2 = sentenciaP2.executeQuery();

            while (resultado2.next()) {
                puntajes.add(Puntajes.crear("Mayores",resultado2.getString("Nombre"), resultado2.getString("Apellido"), resultado2.getInt("Edad"), Integer.parseInt(resultado2.getString("Puntaje"))));

            }
            sentenciaP.close();
            sentenciaP1.close();
            sentenciaP2.close();
            database.close();

            return puntajes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return puntajes;
    }



    public static ArrayList<Persona> obtenerTodos() {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formato3= DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm");
        try {
            String query = "SELECT * FROM infantil;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                personas.add(Persona.crear(resultado.getInt("Id"), Integer.parseInt(resultado.getString("Documento")), resultado.getString("Nombre"), resultado.getString("Apellido"), resultado.getInt("Edad"), resultado.getString("FechaNacimiento"),Integer.parseInt(resultado.getString("Puntaje"))));

            }

            sentenciaP.close();
            database.close();

            return personas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personas;
    }
}
