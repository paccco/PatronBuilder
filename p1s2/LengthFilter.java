/**
 * Filtro que comprueba la longitud de la contraseña.
 * Debe de ser mínimo de 8 caracteres
 */

package p1s2;

public class LengthFilter implements Filter {
    private static final int LENGTHMIN = 8, LENGTHMAX = 16;

    @Override
    public boolean execute(String password) {
        if (password.length() > LENGTHMIN && password.length() < LENGTHMAX) return true;
        return false;
    }
}
