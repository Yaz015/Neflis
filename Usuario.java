package PaqueNeflis;

import java.util.stream.Collectors;

public class Usuario {
    Integer minTotalSerie;

    public Boolean vioContenidoCompleto(Contenido contenido) {return contenidoVisto.contains(contenido);
    }
    public Boolean contQueVio(Contenido contenido){
        return contQueVio.Stream().map(Contenido->contenido.getGenero()).
    distint().collect( Collectors.toSet());}
}
