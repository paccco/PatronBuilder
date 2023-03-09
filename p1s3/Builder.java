interface Builder{
    Dispositivo dispo = new Dispositivo();
    default Ram buildRam() {
        Ram tarjetaRam = new Ram();
        tarjetaRam.run();
        dispo.ram=tarjetaRam;
        return dispo.ram;
    }
    default Bateria buildBateria() {
        Bateria bat = new Bateria();
        bat.run();
        dispo.bat=bat;
        return dispo.bat;
    }
    default Procesador buildProcesador() {
        Procesador cpu = new Procesador();
        cpu.run();
        dispo.cpu=cpu;
        return dispo.cpu;
    }

    public void buildBrand(String brand);
    public void buildType(String type);
}