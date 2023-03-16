/**
 * Filtro que comprueba la existencia de al menos una mayúscula
 * en la contraseña usando el estándar Unicode.
 */

package p1s2;

public class UpperCaseFilter implements Filter {
    private static final int UPPERMIN = 65, UPPERMAX = 90;
    
    @Override
    public boolean execute (String password) {
        boolean upperExist = false;
        
        for (int i = 0; i < password.length(); i++)
            if ( password.codePointAt(i) < UPPERMAX && password.codePointAt(i) > UPPERMIN )
                upperExist = true;
        
        return upperExist;
    }
}
