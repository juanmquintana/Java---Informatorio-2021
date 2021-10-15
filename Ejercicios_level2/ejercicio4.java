/*
Cargar un arrayList con 12 nombres de estudiantes (String),
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?

*/
import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {
        List<String> estudiante = new ArrayList<>();
        estudiante.add("Raul");
        estudiante.add("Pepo");
        estudiante.add("Koki");
        estudiante.add("Ladri");
        estudiante.add("Pipa");
        estudiante.add("Andrea");
        estudiante.add("Trus");
        estudiante.add("Mara");
        estudiante.add("Toto");
        estudiante.add("Carlos");
        estudiante.add("Gonzalo");
        estudiante.add("Nuria");

        List<String> clase1 = estudiante.subList(0, 4);
        List<String> clase2 = estudiante.subList(4, 8);
        List<String> clase3 =estudiante.subList(8, 12);

        
        System.out.println("<<<<<<<<<Clase 1>>>>>>>>>");
        
        for (String cl1 : clase1) {

            System.out.println(cl1);

        }

        
        System.out.println("<<<<<<<<<<Clase 2>>>>>>>>>");
        

        for (String cl2 : clase2) {

            System.out.println(cl2);

        }


        
        System.out.println("<<<<<<<<<<<Clase 3>>>>>>>>>>");
        

        for (String cl3 : clase3) {

            System.out.println(cl3);
        }
    }
}
