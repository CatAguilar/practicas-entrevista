import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Bienvenido al convertidor de temperaturas");
        System.out.println("¿Con que unidad viene?");
        String unidad = sc.nextLine();
        System.out.println("¿A que unidad quiere convertir?");
        String unidad2 = sc.nextLine();
        System.out.println("¿Que temperatura vamos a convertir?");
        double temperatura = sc.nextDouble();

        switch (unidad) {
            case "c":
                if (unidad2.equals("f")) {
                    double temperaturaCf = (temperatura * 1.8) + 32;
                    System.out.println(temperaturaCf);
                }else if (unidad2.equals("k")) {
                    double temperaturaCk = temperatura + 273.15;
                    System.out.println(temperaturaCk);
                }break;
                case "f":
                    if (unidad2.equals("c")) {
                        double temperaturaFc = (temperatura - 32) / 1.8;
                        System.out.println(temperaturaFc);
                    }else if (unidad2.equals("k")) {
                        double temperaturaFk = (((temperatura - 32)*5)/9) + 273.15;
                        System.out.println(temperaturaFk);
                    }break;
                    case "k":
                        if (unidad2.equals("c")) {
                            double temperaturaKc = temperatura - 273.15;
                            System.out.println(temperaturaKc);
                        }else if (unidad2.equals("f")) {
                            double temperaturaKf = (temperatura - 273.15) + 32;
                            System.out.println(temperaturaKf);
                        }break;
        }

        //Para convertir de °F a °C: °C = (°F - 32) / 1.8
        //Para convertir de °C a °F: °F = (°C x 1.8) + 32
        //Para convertir de °C a K: K = °C + 273.15
        //Para convertir de °F a K: K = 5/9 (°F - 32) + 273.15
        //Para convertir de K a °C: °C = K - 273.15
        //Para convertir de K a °F: °F = 1.8(K - 273.15) + 32*/

        //Pide al usuario ingresar tres números y luego imprímelos en orden ascendente.

        System.out.println("Cuantos números quieres ingresar");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingresa el indice " + i);
            numeros[i] = sc.nextInt();
        }
        System.out.println("El arreglo es: " + Arrays.toString(numeros));
        Arrays.sort(numeros); //Java realiza un cambio permanente sobre el arreglo que recibe como argumento.
        System.out.println("El arreglo en orden ascendente: " + Arrays.toString(numeros));






    }
}
