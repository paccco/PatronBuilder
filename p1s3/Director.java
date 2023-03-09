public class Director {
    public void constructLaptop (Builder builder) {
        builder.buildBrand("Samsung");
        builder.buildType("Laptop");
        builder.buildRam();
        builder.buildBateria();
        builder.buildProcesador();
    }

    public void constructSmartphone (Builder builder) {
        builder.buildBrand("Samsung");
        builder.buildType("Smartphone");
        builder.buildRam();
        builder.buildBateria();
        builder.buildProcesador();
    }
}
