
package newpackage2;

import java.time.LocalDateTime;

/**
 *
 * @author PERSONAL
 */
public class Persona {
    /*creacion de variables globales*/
    private int id = 0,edad,documento,puntaje=0;
    private String fecha;
    private LocalDateTime fechas;
    private String  nombre, 
                    apellido,foto="";
    /*constructor de la clase persona */
     public Persona(int id, int documento, String nombre, String apellido, int edad, String fecha, int puntaje) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.edad = edad;
        this.puntaje = puntaje;
        this.fechas = fechas;
    }  
    /*Crea un objeto tipo persona  */
    public static Persona crear(int id, int documento, String nombre, String apellido,  int edad, String fecha, int puntaje) {
        return new Persona(id, documento, nombre, apellido, edad, fecha, puntaje);
    }          
/*metodos para insertar y obtener informacion de la clase*/
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

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFechas() {
        return this.fechas;
    }

    public void setFechas(LocalDateTime fechas) {
        this.fechas = fechas;
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
