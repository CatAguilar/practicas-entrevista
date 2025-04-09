import java.util.Scanner;

public class Despegue {
    public static void main(String[] args){
        System.out.println("Ingrese el contador");

        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando despeque en t menos...");

        int contador = sc.nextInt();

        for(int i=contador; i>=0; i--){
            System.out.println(i + "...");
            //timer espera un segundo
        }
        System.out.println("DESPEGUEN!");
    }

}
