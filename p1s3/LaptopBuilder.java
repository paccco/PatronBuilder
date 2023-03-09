public class LaptopBuilder implements Builder{
    String brand, type;

    @Override
    public void buildBrand(String brand){ this.brand = brand; }

    @Override
    public void buildType(String type){ this.type = type; }
    
    public SamsungLaptop getResult(){
        return new SamsungLaptop(brand,type,buildRam(),buildBateria(),buildProcesador());
    }
}