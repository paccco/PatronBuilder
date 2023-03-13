package p1s2;

public class Password {
    String password;
    Boolean length, upper, special;

    public Password (String password) {
        this.password = password;
        length = upper = special = false;
    }

    public String getPassword() {
        return password;
    }

    public void execute(){
        System.out.println("Contraseña segura");
    }
}
