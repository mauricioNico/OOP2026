public class Animal {
    //encapsulamiento: ocultar los atributos de la clase y proporcionar métodos públicos para acceder a ellos
    private String nombre;
    private int edad;
    private String especie;
    private double peso;
    private String color;
    private int cantidadPatas;

public Animal() {
        // Constructor vacío
    }
    public Animal(String nombre, int edad, String especie, double peso, String color, int cantidadPatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.color = color;
        this.cantidadPatas = cantidadPatas;
    }
//métodos getters y setters para acceder a los atributos privados
public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCantidadPatas() {
        return cantidadPatas;
    }
    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }
   

    // Método: comer
    public void comer() {
        System.out.println(getNombre() + " está comiendo");
    }
public void comer(String comida) {
        System.out.println(getNombre() + " está comiendo " + comida);
    }

    // Método: dormir
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo.");
    }

    // Método: hacer sonido
    public void hacerSonido() {
        System.out.println(getNombre() + " hace un sonido.");
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Especie: " + getEspecie());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Color: " + getColor());
        System.out.println("Cantidad de patas: " + getCantidadPatas());
    }
}