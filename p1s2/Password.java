/**
 * Clase Objetivo (target) que será ejecutado por FilterChain una vez pasado todos los filtros
 */

package p1s2;
import javax.swing.JOptionPane;

public class Password {
    String password;
    Boolean securePassword;

    public Password (String password) {
        this.password = password;
        this.securePassword = true;
    }

    public String getPassword() {
        return password;
    }


    public void setSecurity (boolean filterChain) {
        this.securePassword = filterChain;
    }

    public void execute(){
        if (securePassword) JOptionPane.showMessageDialog(null,"Contraseña segura, creando cuenta de cliente...");
        else                JOptionPane.showMessageDialog(null, "Contraseña inválida!");
    }
}
