package Ejercecio;

public class Animal {

    /**Clases y Herencia
     Crea una clase Animal con atributos nombre y edad, y un metodo hacerSonido().
     Crea una subclase Perro que sobrescriba hacerSonido() para imprimir "Guau".***/

    //Atributos
    private String nombre;
    private Integer edad;

    public Animal(){}

    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void hacerSonido(){

    }

}
