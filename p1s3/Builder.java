interface Builder{
    Dispositivo dispo = new Dispositivo();
    static void buildRam() {
        Ram tarjetaRam = new Ram();
        tarjetaRam.run();
        dispo.ram=tarjetaRam;
    }
    static void buildBateria() {
        Bateria bat = new Bateria();
        bat.run();
        dispo.bat=bat;
    }
    static void buildProcesador() {
        Procesador cpu = new Procesador();
        cpu.run();
        dispo.cpu=cpu;
    }

    public void buildBrand();
    public void buildType();
    public void getResult();
}