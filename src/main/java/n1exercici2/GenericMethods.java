package n1exercici2;

public class GenericMethods {
    public static <T> void printGenericObjects(T object1, T object2, T object3){
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
    }
}
