package co.edu.uniquindio.sga.domain.repository;

import co.edu.uniquindio.sga.domain.entity.Solar;
import co.edu.uniquindio.sga.domain.repository.SolarRepository;
import co.edu.uniquindio.sga.domain.valueobject.IdentificacionSolar;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SolarRepositoryEnMemoria implements SolarRepository {

    private final Map solares = new HashMap<>();

    @Override
    public Optional obtenerPorIdentificacion(IdentificacionSolar identificacion) {
        return Optional.ofNullable(solares.get(identificacion));
    }

    @Override
    public void guardar(Solar solar) {
        solares.put(solar.getIdentificacion(), solar);
    }
}