public class Director {
    public void constructLaptop (Builder builder) {
        builder.buildBrand();
        builder.buildType();
        builder.buildRam(new Ram("DDR4","32GB"));
        builder.buildBateria(new Bateria("R519"));
        builder.buildProcesador(new Procesador("i7"));
    }

    public void constructSmartphone (Builder builder) {
        builder.buildBrand();
        builder.buildType();
        builder.buildRam(new Ram("LPDDR4", "8GB"));
        builder.buildBateria(new Bateria("R730"));
        builder.buildProcesador(new Procesador("Exynos"));
    }
}
