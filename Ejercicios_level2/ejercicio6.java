/*
Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.

*/

package Ejercicios_level2;
import java.util.*;
public class ejercicio6 {
    public static void main(String[] args) {

        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Employee("Roberto Ranura", 123456, 7, 278));
        empleado.add(new Employee("Estel Ares", 2345678, 6, 305));
        empleado.add(new Employee("Muñeco Mateico", 456789, 8, 601));
        empleado.add(new Employee("Valeria Gra", 9876542, 5, 700));
        empleado.add(new Employee("Kevin Chuca", 6780943, 4, 220));

        System.out.println("Calculo del salario de los empleados");

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario percibido:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}

