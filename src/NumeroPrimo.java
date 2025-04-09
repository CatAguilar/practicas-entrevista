import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
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
        }


    }
}
