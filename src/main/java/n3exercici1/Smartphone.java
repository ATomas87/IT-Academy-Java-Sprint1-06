package n3exercici1;

public class Smartphone implements Phone {
    @Override
    public void call() {
        System.out.println("El teléfono está llamando");
    }

    public void takePhoto() {
        System.out.println("El teléfono está haciendo una foto");
    }
}
