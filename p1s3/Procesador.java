import java.util.Random;

public class Procesador extends Thread {
    private static final int fallo = 3, porc = 10;
    private static Random random;
    
    public Procesador () { random = new Random(); }

    @Override
    public void run() {
        int exito = random.nextInt(porc) + 1; // 1-10
        if ( exito >= fallo ) {
            System.out.println("Procesador creado");
        } else{
            System.out.println("Error en procesador");
        }
    }
}