package p1s2;

public class LengthFilter implements Filter {
    @Override
    public boolean execute() {
        String password = "Ejemplo";

        if (password.length() < 8) return false;
        return true;
    }
}
