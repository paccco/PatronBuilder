package p1s2;
import javax.swing.JOptionPane;

public class MainPassword {
 
    public static void main(String[] args) {
 
        String password;
        FilterManager filterManager = new FilterManager();

        password = JOptionPane.showInputDialog("Introduce una contraseña");
        
        filterManager.filterRequest(password);

        String email;
        boolean emailCorrecto;
        do{
            email=JOptionPane.showInputDialog("Introduce un email");
            emailCorrecto=email.matches("[-\\w\\.]+@\\w+\\.\\w+");
        }while(!emailCorrecto);
 
        System.out.println("El email "+email+" es correcto");
    }
}
