import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenNombres {
    //Pide por consola nombres de usuarios y guárdalos en una ArrayList. Luego ordena la lista y muéstrala por consola.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos empleados deseas ingresar?");
        int cantidadEmpleados = sc.nextInt();

        List<String> nombres = new ArrayList<>();

        for(int i = 0; i < cantidadEmpleados; i++){
            System.out.println("Agrega al empleado n°: " + i);
            String nombre = sc.next();
            nombres.add(nombre);
        }

        System.out.println("Lista completa de empleados: ");
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
}
