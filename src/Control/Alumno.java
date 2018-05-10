
package Control;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Pingüi
 */
public class Alumno {
    String nombre;
    String apellidos;
    Date fechaNac;
    int edad;
    Date date = new Date();

public Alumno(String nombre, String apellido, Date fechaNac, int edad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNac = fechaNac;
    }
}
