import java.util.Random;

public class Ram extends Thread {
    private static final int fallo = 1, porc = 10;
    private static Random random;
    private final String tecnologia, capacidad;

    public Ram (String tecnologia, String capacidad) {
        random = new Random();
        this.tecnologia = tecnologia;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return tecnologia + " " + capacidad;
    }

    @Override
    public void run() {
        int exito = random.nextInt(porc) + 1; // 1-10
        if ( exito >= fallo ) {
            System.out.println("Tarjeta RAM creada\n");
        } else{
            System.out.println("Error en RAM\n");
        }
    }
}