package Complementarios3;
import java.time.LocalDate;
import java.util.Objects;
public class Alumno {
    private final String nombre;
    private final String apellido;
    private final LocalDate nacimiento;
    public Alumno(String nombre, String apellido, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    @Override
    public String toString() {
        return "Alumno{"
                + "nombre='"
                + nombre
                + '\''
                + ", apellido='"
                + apellido
                + '\''
                + ", nacimiento="
                + nacimiento
                + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre)
                && Objects.equals(apellido, alumno.apellido)
                && Objects.equals(nacimiento, alumno.nacimiento);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, nacimiento);
    }
}

