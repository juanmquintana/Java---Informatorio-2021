/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
luego imprimir por pantalla el ranking
Input (Entrada):
Bariloche
Córdoba
Resistencia

Output (Salida):
#1 - Bariloche
#2 - Córdoba
#3 - Resistencia

*/


public class ejercicio1 {
    public static void main(String[] args){
        String [] ciudades = {"#1 - Bariloche", "#2 - Buenos Aires", "#3 - Resistencia"};
 
         for (String i : ciudades) {
             System.out.println(i);
         }
     }
}
