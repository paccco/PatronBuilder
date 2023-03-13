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

    // método que añade filtros concretos en un orden determinado y ejecuta la cadena
    void filterRequest (String password) {
        addLengthFilter();
        addUpperCaseFilter();
        addSpecialCharFilter();

        // enviamos la "peticion" a la cadena de filtros
        filterChain.setTarget(new Password(password));
        filterChain.execute();
    }
}
