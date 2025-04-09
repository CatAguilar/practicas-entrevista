package Ejercecio;

public class Perro extends Animal{

    
    public Perro() {
    }

    public Perro(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
    }
}
