package n3exercici1;

public class Generic {
    public static <T extends Phone> void usePhone(T phone) {
        phone.call();
        //No se puede usar el método takePhoto de la clase Smartphone porque estamos limitando la funcionalidad del método
        //a la implementación de los métodos de la interfaz Phone únicamente, dejando fuera a los métodos propios
        //de la clase Smartphone.
        //phone.takePhoto();
    }

    public static <T extends Smartphone> void useSmartphone(T phone) {
        phone.call();
        phone.takePhoto();
    }
}
