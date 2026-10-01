package co.edu.uniquindio.sga.domain.valueobject;

import co.edu.uniquindio.sga.domain.exception.ReglaDominioException;

// L-04: la identificación de cada solar es única y estable
public record IdentificacionSolar(String valor) {

    public IdentificacionSolar {
        if (valor == null || valor.isBlank()) {
            throw new ReglaDominioException("La identificación del solar es obligatoria.");
        }
        valor = valor.trim().toUpperCase();
    }
}