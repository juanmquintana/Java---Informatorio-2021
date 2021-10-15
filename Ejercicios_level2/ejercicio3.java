/*
Crear una lista que contenga como elementos la numeración de cartas de
una baraja francesa (solo los valores, no figuras). Se deberá cargar el 
ArrayList (en orden), imprimir, imprimir en orden inverso (reverse),
desordenar (mezclar) el arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, 
existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
    
    ArrayList <String> cartasFran = new ArrayList();
        cartasFran.add("2");
        cartasFran.add("3");
        cartasFran.add("4");
        cartasFran.add("5");
        cartasFran.add("6");
        cartasFran.add("7");
        cartasFran.add("8");
        cartasFran.add("9");
        cartasFran.add("10");
        cartasFran.add("J");
        cartasFran.add("Q");
        cartasFran.add("K");
        cartasFran.add("A");
        System.out.println("Inicio ordenado");
        for (int k = 0; k <cartasFran.size() ; k++) {
            System.out.println(cartasFran.get(k));
        }
        System.out.println("Fin ordenado");
        System.out.println("Para ver el mazo en orden inverso ingrese 'r' o si lo quiere mezclado ingrese 'm'");
        Scanner scan = new Scanner(System.in);
        String var1 = scan.next();
        if (var1 == "r"){
            System.out.println("Inicio reverso");
            Collections.reverse(cartasFran);
            for (int i = 0; i <cartasFran.size() ; i++) {
            System.out.println(cartasFran.get(i));}
            System.out.println("Fin reverso");
        }else {
            
            System.out.println("Inicio mezclado");
            Collections.shuffle(cartasFran);
            for (int j = 0; j <cartasFran.size() ; j++) {
            System.out.println(cartasFran.get(j));}
            System.out.println("Fin mezclado");
            
            }
            
            scan.close();
    }
}
