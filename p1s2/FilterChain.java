/**
 * Cadena de filtros que añade filtros indicados por el gestor y
 * define un objetivo (target), que será la clase Password.
 */

package p1s2;
import java.util.ArrayList;

public class FilterChain {
    ArrayList<Filter> filters;
    Password target;

    public FilterChain(){
        filters = new ArrayList<Filter>();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Password password) {
        target = password;
    }

    // método donde se llama al ejecutar de cada filtro y de el objetivo
    public void execute() {
        boolean error = false;
        String pass = target.getPassword();
        
        // filters
        for (Filter i : filters) {
            if ( !i.execute(pass) ){
                target.setSecurity(error);
                break;
            } else
                System.out.println ("filtro pasado!");
        }
        // target
        target.execute();
        
    }
}
