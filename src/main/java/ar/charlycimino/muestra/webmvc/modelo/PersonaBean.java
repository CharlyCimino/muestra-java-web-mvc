package ar.charlycimino.muestra.webmvc.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class PersonaBean implements Serializable {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public PersonaBean() {
    }

    public PersonaBean(String nombre, String apellido, String fechaNacimiento) {
        setNombre(nombre);
        setApellido(apellido);
        setFechaNacimiento(fechaNacimiento);
    }

    public String getNombreCompleto() {
        String nc;
        if (nombre.isEmpty() && apellido.isEmpty()) {
            nc = "desconocido/a";
        } else if (nombre.isEmpty()) {
            nc = apellido;
        } else if (apellido.isEmpty()) {
            nc = nombre;
        } else {
            nc = nombre + " " + apellido;
        }
        return nc;
    }

    public int getEdad() {
        int edad;
        if (this.fechaNacimiento.isAfter(LocalDate.now())) {
            edad = -1;
        } else {
            edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }
        return edad;
    }
    
    public boolean isCumpleanios() {
        LocalDate hoy = LocalDate.now();
        return this.fechaNacimiento.getDayOfMonth() == hoy.getDayOfMonth() &&
               this.fechaNacimiento.getMonthValue() == hoy.getMonthValue();
    }
    
    public char[] getLetrasDelNombre() {
        return this.nombre.toUpperCase().toCharArray();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new RuntimeException("No se ha provisto un nombre");
        } else {
            this.nombre = nombre.trim();
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null) {
            throw new RuntimeException("No se ha provisto un apellido");
        } else {
            this.apellido = apellido.trim();
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.isEmpty()) {
            throw new RuntimeException("No se ha provisto una fecha de nacimiento");
        } else {
            this.fechaNacimiento = LocalDate.parse(fechaNacimiento.trim());
        }
    }

}
