package p1s3;
import java.util.Random;

public class Ram extends Thread {
    private static final int fallo = 1, porc = 10;
    private static Random random;

    public Ram () { random = new Random(); }

    // esto iría en builder para cada componente
    /* static void buildRam () {
        Ram tarjetaRam = new Ram();
        tarjetaRam.start();
    } */

    @Override
    public void run() {
        int exito = random.nextInt(porc) + 1; // 1-10
        if ( exito >= fallo ) {
            System.out.println("Tarjeta RAM creada");
        } else{
            System.out.println("Error en RAM");
        }
    }
}