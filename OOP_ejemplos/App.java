public class App {
    public static void main(String[] args) {
        // Crear un objeto de la clase Animal
        //instancia y objeto son lo mismo, se refiere a la creación de un ejemplar de una clase
        Animal miAnimal = new Animal(); //llamada al método constructor vacío o por defecto
        miAnimal.setNombre("Fido"); //uso del método setter para asignar un valor al atributo privado nombre
        miAnimal.setEdad(3);
        miAnimal.setEspecie("Perro");
        miAnimal.setPeso(15.5);
        miAnimal.setColor("Marrón");
        miAnimal.setCantidadPatas(4);
        Animal otroAnimal = new Animal("Miau", 2, "Gato", 4.2, "Negro", 4); //llamada al método constructor con parámetros  

        // Llamar a los métodos del objeto
        miAnimal.comer();
        miAnimal.comer("croquetas");
        miAnimal.dormir();
        miAnimal.hacerSonido();
        miAnimal.mostrarInformacion();
        otroAnimal.mostrarInformacion();
    }
}
