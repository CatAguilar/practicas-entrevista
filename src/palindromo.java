import java.util.Scanner;

public class palindromo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una palabra para saber si es un palindromo");
        String palindromo = sc.next();
        String invertido = "";
        for(int i = palindromo.length() - 1; i >= 0; i--){
            invertido += palindromo.charAt(i);
        }
        System.out.println(invertido);
        if(palindromo.equals(invertido)){
            System.out.println(palindromo + " es un palindromo");
        }else {
            System.out.println(palindromo + " NO es un palindromo");
        }

    }
}
