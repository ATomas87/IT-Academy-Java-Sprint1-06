package n2exercici1;

public class GenericMethods<T> {
    public static <T> void printGenericObjects(Person object1, T object2, T object3){
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
    }
}
