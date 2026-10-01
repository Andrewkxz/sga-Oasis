package co.edu.uniquindio.sga.domain.valueobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Test para un objeto de valor
class IdentificacionsolarTest {

    @Test
    void verificarDosIdentificadoresConElMismoValorSonIguales(){
        IdentificacionSolar idUno = new IdentificacionSolar("apto:01");
        IdentificacionSolar idDos = new IdentificacionSolar("APTO:01");

        assertEquals(idUno,idDos);
        assertEquals(idUno.hashCode(),idDos.hashCode());
    }

    @Test
    void normalizarAMayusculas(){
        IdentificacionSolar idUno = new IdentificacionSolar("apto:01");

        assertEquals("APTO:01",idUno.valor());
    }

}