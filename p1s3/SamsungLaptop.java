public class SamsungLaptop extends LaptopBuilder{
    public void buildBrand(){
        dispo.setBrand("Samsung");
    };
    public void buildType(){
        dispo.setType("Laptop");
    };
    public void getResult(){
        this.buildBateria();
        this.buildRam();
        this.buildProcesador();
        this.buildBrand();
        this.buildType();
    };
}
