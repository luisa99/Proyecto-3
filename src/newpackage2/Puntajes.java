
package newpackage2;

import java.time.LocalDateTime;

/**
 *
 * @author PERSONAL
 */
public class Puntajes {
    /*declaracion de las variables globales*/
    private int id = 0,edad,puntaje=0;
    private String  nombre, 
                    apellido,foto="",categoria;
     public Puntajes(String categoria,String nombre, String apellido, int edad,int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
       this.edad = edad;
        this.puntaje = puntaje;
        this.categoria=categoria;
    }  
     /*crea un nuevo objeto tipo puntajes*/
    public static Puntajes crear(String categoria,String nombre, String apellido,  int edad, int puntaje) {
        return new Puntajes(categoria,nombre, apellido, edad,puntaje);
    }     
    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
