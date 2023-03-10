public class SamsungSmarthPhone extends Dispositivo{

    public SamsungSmarthPhone(Ram ram, Bateria bat, Procesador proc) {
        super(ram,bat,proc);
        this.brand = "Samsung";
        this.type = "SmartPhone";
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
    
    @Override
    public String toString() {
        return "\nDispositivo " + getType() + "\nRam: " +  getRam().toString() +
                "\nBateria: " + getBateria().toString() + "\nProcesador: " + getProcesador().toString();
    }
}
