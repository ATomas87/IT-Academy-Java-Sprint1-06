package n2exercici2;

public class GenericMethods<T> {

    public GenericMethods() {
    }

    public static <T> void printGenericObjects(T... objects){
        for (T t : objects){
            System.out.println(t);
        }
    }
}
