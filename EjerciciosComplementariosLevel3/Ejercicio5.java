/*
Se posee una Lista con objetos de clase Alumno con los atributos:
apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate).
Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado
con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y
demostrar su funcionamiento.
En ejemplo se muestra solo con 1 Alumno a modo de abreviar
En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar
otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)
Input (Entrada)
List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));
Output (Salida):
{"Simpson Homero"=30}
 */
package Complementarios3;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos =
                List.of(
                        new Alumno("Roberto", "Ranura", LocalDate.of(1935, 10, 4)),
                        new Alumno("Rodolfo", "Pascueto", LocalDate.of(1974, 3, 21)),
                        new Alumno("Esteban", "Quito", LocalDate.of(1963, 8, 29)),
                        new Alumno("Estela", "Garto", LocalDate.of(2000, 2, 10)),
                        new Alumno("Kevin", "Chuca", LocalDate.of(1905, 9, 1)));
        Map<String, Integer> edades = new HashMap<>();
        for (Alumno alumno : alumnos) {
            edades.put(
                    alumno.getApellido() + " " + alumno.getNombre(),
                    alumno.getNacimiento().until(LocalDate.now()).getYears());
        }
        System.out.println(edades);
    }
}
