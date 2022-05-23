package n2exercici1;

public class Main {
    public static void main(String[] args) {

        GenericMethods.printGenericObjects(new Person("Antonio", "Tomás", 35), "Hola Mundo", 78);

        //Descomentar la línea de abajo para ver el resultado de que un argumento no sea Genérico:
        //newGenericMethods1.printGenericObjects("Hola", 42, new Person("Julia", "Navarro", 24));
    }
}
