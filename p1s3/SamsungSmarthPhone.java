public class SamsungSmarthPhone extends LaptopBuilder{
    public void buildBrand(){
        dispo.setBrand("Samsung");
    };
    public void buildType(){
        dispo.setType("SmarthPhone");
    };
    public void getResult(){
        this.buildBateria();
        this.buildRam();
        this.buildProcesador();
        this.buildBrand();
        this.buildType();
    };
}