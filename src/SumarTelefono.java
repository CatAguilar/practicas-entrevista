import java.util.Scanner;

public class SumarTelefono {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu número de telefono");
        String telefono = sc.next();
        int suma = 0;
        for(int i = 0; i <= telefono.length() - 1; i++){
            int num = telefono.charAt(i) - '0';
            suma += num;
        }System.out.println(suma);



    }
}
