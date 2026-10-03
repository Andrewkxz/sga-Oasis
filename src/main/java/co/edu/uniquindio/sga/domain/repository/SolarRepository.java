package co.edu.uniquindio.sga.domain.repository;

import java.util.Optional;

import co.edu.uniquindio.sga.domain.entity.Solar;
import co.edu.uniquindio.sga.domain.valueobject.IdentificacionSolar;

public interface SolarRepository {
    
    Optional obtenerPorIdentificacion(IdentificacionSolar identificacion);

    void guardar(Solar solar);
}
