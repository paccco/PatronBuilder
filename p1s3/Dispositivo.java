public class Dispositivo {
    private String brand, type;
    Ram ram;
    Procesador cpu;
    Bateria bat;

    public Dispositivo () {
        this.brand = "N/A";
        this.type = "N/A";
    }

    public Dispositivo (String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    public String getType () { return this.type; }
    public String getBrand() { return this.brand; }
    
    public void setType (String newType)  { this.type = newType; }
    public void setBrand(String newBrand) { this.brand = newBrand; }
}