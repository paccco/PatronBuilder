import java.util.Random;

public class Bateria extends Thread {
    private static final int fallo = 2, porc = 10;
    private static Random random;
    private final String marca;
    
    public Bateria (String marca) {
        random = new Random();
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca;
    }

    @Override
    public void run() {
        int exito = random.nextInt(porc) + 1; // 1-10
        if ( exito >= fallo ) {
            System.out.println("Batería creada\n");
        } else{
            System.out.println("Error en batería\n");
        }
    }
}