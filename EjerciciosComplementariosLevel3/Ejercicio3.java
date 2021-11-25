/*
Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la
letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
Input (Entrada):
List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);
Output (Salida):
3
 */
package Complementarios3;
import java.util.List;
public class Ejercicio3 {
    private static final String LETRA_INICIO = "b";
    public static void main(String[] args) {
        List<String> palabras =
                List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long count = 0;
        for (String pal : palabras) {
            if (filtrarPorInicio(pal)) {
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean filtrarPorInicio(String s) {
        return s != null && !s.isEmpty() && LETRA_INICIO.equalsIgnoreCase(s.substring(0, 1));
    }
}
