public abstract class LaptopBuilder implements Builder{
    public void buildBateria(){
        Builder.buildBateria();
    }

    public void buildRam(){
        Builder.buildRam();
    }

    public void buildProcesador(){
        Builder.buildProcesador();
    }

    public void buildBrand(){};
    public void buildType(){};
    public void getResult(){};
}