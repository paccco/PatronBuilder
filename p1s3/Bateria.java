import java.util.Random;

public class Bateria extends Thread {
    private static final int fallo = 2, porc = 10;
    private static Random random;
    
    public Bateria () { random = new Random(); }

    @Override
    public void run() {
        int exito = random.nextInt(porc) + 1; // 1-10
        if ( exito >= fallo ) {
            System.out.println("Batería creada");
        } else{
            System.out.println("Error en batería");
        }
    }
}