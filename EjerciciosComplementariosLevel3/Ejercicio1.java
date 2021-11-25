/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean
null o vacío ("").
Input (Entrada):
List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
Output (Salida):
["Hola", "Informatorio"]
 */
package Complementarios3;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("HOLA");
        palabras.add("");
        palabras.add(null);
        palabras.add("MUNDO");
        List<String> endPalabras = new ArrayList<>();
        for (String s : palabras) {
            if (s != null && !s.isEmpty()) {
                endPalabras.add(s);
            }
        }
        System.out.println(endPalabras);
    }
}

