public class SamsungLaptop{
    private String brand, type;
    private Ram ram;
    private Bateria bateria;
    private Procesador procesador;

    public SamsungLaptop(String brand, String type, Ram ram, Bateria bat, Procesador proc) {
        this.brand = brand;
        this.type = type;
        this.ram = ram;
        this.procesador = proc;
        this.bateria = bat;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getType(){
        return this.type;
    }

    public Ram getRam(){
        return this.ram;
    }

    public Bateria getBateria(){
        return this.bateria;
    }

    public Procesador getProcesador(){
        return this.procesador;
    }
    
}
