package n2exercici2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Con 3 argumentos:");
        GenericMethods.printGenericObjects(new Person("Antonio", "Tomás", 35), "Hola Mundo", 78);
        System.out.println();

        System.out.println("Con 7 argumentos:");
        GenericMethods.printGenericObjects(new Person("Antonio", "Tomás", 35), "Hola Mundo", 78,
                1231, "Esto es una prueba de varargs", 123.1231, new Person("Martín", "Pérez", 42));

    }
}
