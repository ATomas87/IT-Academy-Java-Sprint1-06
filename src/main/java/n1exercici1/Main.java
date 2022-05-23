package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Antonio", "Tomás");
        Person person2 = new Person("Miguel", "Ríos");
        Person person3 = new Person("Laura", "Lago");
//        Person person4 = new Person("Fernando", "Moreno");
//        Person person5 = new Person("Ana", "Luján");
//        Person person6 = new Person("María", "Fernández");

        NoGenericMethods<Person> noGenericMethods = new NoGenericMethods<>(person1, person2, person3);
        NoGenericMethods<Person> noGenericMethods1 = new NoGenericMethods<>(person2, person3, person1);

        System.out.println("Obtención de los primeros objetos de las dos instancias de la clase NoGenericMethods:");
        System.out.println(noGenericMethods.getObject1());
        System.out.println(noGenericMethods1.getObject1());
        System.out.println();

        System.out.println("Obtención de los segundos objetos de las dos instancias de la clase NoGenericMethods:");
        System.out.println(noGenericMethods.getObject2());
        System.out.println(noGenericMethods1.getObject2());
        System.out.println();

        System.out.println("Obtención de los terceros objetos de las dos instancias de la clase NoGenericMethods:");
        System.out.println(noGenericMethods.getObject3());
        System.out.println(noGenericMethods1.getObject3());

    }
}
