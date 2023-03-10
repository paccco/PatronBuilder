public class main {
    public static void main(String[] args){
        Director director = new Director();

        LaptopBuilder laptopB = new LaptopBuilder();
        SmarthPhoneBuilder phoneB = new SmarthPhoneBuilder();

        director.constructLaptop(laptopB);
        director.constructSmartphone(phoneB);

        SamsungLaptop samsungLaptop = laptopB.getResult();
        SamsungSmarthPhone samsungSmartPhone = phoneB.getResult();

        System.out.println(samsungLaptop);
        System.out.println(samsungSmartPhone);

    }
}
