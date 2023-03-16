/**
 * Clase main del patrón Filtros de intercepción.
 * Práctica 1, sesión 2, ejemplo 2.
 */
package p1s2;
import javax.swing.JOptionPane;

public class MainPassword {
 
    public static void main(String[] args) {
        // creamos el gestor de filtros y pedimos una contraseña
        String password;
        FilterManager filterManager = new FilterManager();
        
        // uso de la GUI
        password = JOptionPane.showInputDialog("Introduce una contraseña");
        
        // mandamos la solicitud al cliente a través del gestor de filtros
        filterManager.filterRequest(password);
    }
}
