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
public class Repositorio3 {
    private static DBManager database = new DBManager();
/*este metodo inserta los datos en la base de datos*/
    public static void crear (Persona persona) {
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formato3= DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm");
        try {
            String query = "INSERT INTO mayores (Documento, Nombre, Apellido,  Edad, FechaNacimiento, FechaRegistro, Foto, Puntaje) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
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
     /*este metodo edita los datos en la base de datos*/
    public static void editar (int documento, int puntaje) {
        
        try {
            String query = "UPDATE mayores SET Puntaje= ? WHERE Documento = ?;";
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
    /*obtiene los datos de la tabla infantil*/
    public static ArrayList<Persona> obtenerTodos() {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formato3= DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm");
        try {
            String query = "SELECT * FROM mayores;";
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
