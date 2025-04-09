import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        /**En el editor de código IntelliJ IDEA: Crear un programa que determine la categoría de edad de una persona (niño, adolescente, adulto, adulto mayor).
         Pistas:
         Define rangos de edad para cada categoría.
         Utiliza múltiples condiciones if-else if.***/

        System.out.println("ingresa tu edad por favor");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        if (edad > 18 && edad < 60) {
            System.out.println("Por tu edad de " + edad + " eres considerado un adulto");
        } else if (edad < 18 && edad > 12) {
            System.out.println("Por tu edad de " + edad + " eres considerado un adolescente");
        } else if (edad > 4 && edad < 12) {
            System.out.println("Por tu edad de " + edad + " eres considerado un niño");
        } else if (edad > 60) {
            System.out.println("Por tu edad de " + edad + " eres considerado un adulto mayor");
        }else {
            System.out.println("Por tu edad de " + edad + " eres considerado un bebe");
        }
    }
}
