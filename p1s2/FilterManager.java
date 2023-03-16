/**
 * Gestor de Filtros que pasará la solicitud del cliente (MainPassword)
 * a la cadena de filtros (FilterChain) que él mismo creará con los filtros necesarios.
 */

package p1s2;

public class FilterManager {
    FilterChain filterChain;
    
    public FilterManager () {
        filterChain = new FilterChain();
    }

    
    void addLengthFilter () {
        filterChain.addFilter(new LengthFilter());
    }

    void addUpperCaseFilter () {
        filterChain.addFilter(new UpperCaseFilter()); // CREAR
    }
    
    void addSpecialCharFilter () {
        filterChain.addFilter(new SpecialCharFilter()); // CREAR
    }

    // añade los filtros necesarios en el orden necesario y ejecuta la cadena de filtros
    void filterRequest (String password) {
        addLengthFilter();
        addUpperCaseFilter();
        addSpecialCharFilter();

        // enviamos la "peticion" a la cadena de filtros
        filterChain.setTarget(new Password(password));
        filterChain.execute();
    }
}
