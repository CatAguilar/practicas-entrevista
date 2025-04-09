import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para sacar el factorial de este");
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i<=num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
