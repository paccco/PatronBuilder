/**
 * Filtro que comprueba la existencia de al menos 1 caracter especial
 * en la contraseña usando el estándar Unicode.
 * 
 * Algunos de los caracteres especiales que podemos usar son:
 * '.' ',' '+' '-' '(' ')' y números
 */

package p1s2;

public class SpecialCharFilter implements Filter{
    private static final int SPECIALMIN = 33, SPECIALMAX = 63;
    
    @Override
    public boolean execute (String password) {
        boolean specialCharExist = false;

        for (int i = 0; i < password.length(); i++)
            if ( password.codePointAt(i) < SPECIALMAX && password.codePointAt(i) > SPECIALMIN )
                specialCharExist = true;
        
        return specialCharExist;
    }
}
