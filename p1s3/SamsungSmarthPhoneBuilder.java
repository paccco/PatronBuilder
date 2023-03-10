public class SamsungSmarthPhoneBuilder implements Builder{
    private String brand, type;
    private Ram ram;
    private Bateria bateria;
    private Procesador procesador;

    @Override
    public void buildBrand(String brand){ this.brand = brand; }

    @Override
    public void buildType(String type){ this.type = type; }

    @Override
    public void buildRam (Ram ram) {
        this.ram = ram;
        this.ram.start();
    }

    @Override
    public void buildBateria (Bateria bateria) {
        this.bateria = bateria;
        this.bateria.start();
    }

    @Override
    public void buildProcesador (Procesador procesador) {
        this.procesador = procesador;
        this.procesador.start();
    }
    
    public SamsungSmarthPhone getResult(){
        return new SamsungSmarthPhone(ram,bateria,procesador);
    }
}