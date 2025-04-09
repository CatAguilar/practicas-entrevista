import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Contar caracteres en una cadena
        /*System.out.println("Ingresa una palabra");
        String palabra = sc.nextLine();

        System.out.println("su palabra tiene: " + palabra.length());*/

        //Contar caracteres en una cadena
        /*System.out.println("Ingrese el primer numero: ");
        int num2 = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }

        System.out.println(num + "!= " + factorial);*/

        //Escribe un programa que determine si un número ingresado por el usuario es primo.

        /*System.out.println("Ingrese un numero: ");
        int num3 = sc.nextInt();
        int contadorDivisor = 0;

        for (int i = 1; i <= num3; i++) {
            if (num3 % i == 0) {
                contadorDivisor+=1;
            }

        }if (contadorDivisor > 2) {
            System.out.println(num3 + " NO es primo");
        } else {
            System.out.println(num3 + " es Primo");
        }*/

        //Crea un programa que pida al usuario ingresar varios números (usando un array) y luego calcule el promedio de esos números.

        int[]numbers= new int[5];
        for(int i=0;i < 5; i++) {
            System.out.println("Ingrese un número en posición: " + i);
            numbers[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int suma=0;

        for (int i = 0; i < 5; i++) {
            suma += numbers[i];

        }
        System.out.println("la suma de todos los numeros de arreglo es " + suma);

        System.out.println(numbers.length);

        System.out.println("El promedio del arreglo es " + suma/numbers.length);

        sc.close();














    }
}