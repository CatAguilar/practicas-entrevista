import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        System.out.println("ingresa el largo que quieres para la secuencia de fibonacci");
        int secuencia = sc.nextInt();

        System.out.println(num1);
        System.out.println(num2);

        for(int i = 2; i<=secuencia; i++){

            int siguiente = num1 + num2;
            System.out.println(siguiente);
            num1 = num2;
            num2 = siguiente;
        }

    }
}
