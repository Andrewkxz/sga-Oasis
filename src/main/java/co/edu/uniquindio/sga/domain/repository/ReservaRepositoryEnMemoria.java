package co.edu.uniquindio.sga.domain.repository;

import co.edu.uniquindio.sga.domain.entity.Reserva;
import co.edu.uniquindio.sga.domain.valueobject.CodigoReserva;
import co.edu.uniquindio.sga.domain.valueobject.EstadoReserva;
import co.edu.uniquindio.sga.domain.valueobject.IdentificacionSolar;
import co.edu.uniquindio.sga.domain.valueobject.Periodo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ReservaRepositoryEnMemoria implements ReservaRepository {

    private final Map<CodigoReserva, Reserva> reservas = new HashMap<>();

    @Override
    public List<Reserva> buscarActivasPorSolar(
            IdentificacionSolar solar,
            Periodo periodo) {

        return reservas.values().stream()
                .filter(reserva -> reserva.getSolar().equals(solar))
                .filter(reserva -> reserva.getEstado().esActiva())
                .filter(reserva -> reserva.getEstancia().seSolapaCon(
                        new co.edu.uniquindio.sga.domain.valueobject.Estancia(
                                periodo.desde(),
                                periodo.hasta()
                        )
                ))
                .toList();
    }

    @Override
    public Optional<Reserva> obtenerPorCodigo(CodigoReserva codigo) {
        return Optional.ofNullable(reservas.get(codigo));
    }

    @Override
    public void guardar(Reserva reserva) {
        reservas.put(reserva.getCodigo(), reserva);
    }

    @Override
    public List<Reserva> buscarPorEstado(EstadoReserva estado) {
        return reservas.values().stream()
                .filter(reserva -> reserva.getEstado().equals(estado))
                .toList();
    }
}