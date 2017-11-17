/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.time.LocalDateTime;

/**
 *
 * @author PERSONAL
 */
public class Puntajes {
    private int id = 0,edad,puntaje=0;
    private String  nombre, 
                    apellido,foto="";
     public Puntajes(String nombre, String apellido, int edad,int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
       this.edad = edad;
        this.puntaje = puntaje;
    }  
    public static Puntajes crear(String nombre, String apellido,  int edad, int puntaje) {
        return new Puntajes(nombre, apellido, edad,puntaje);
    }     

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
