package ar.com.grupoesfera.csd.pois.unitarias.servicios;

import ar.com.grupoesfera.csd.pois.controladores.ServicioPOIControlador;
import ar.com.grupoesfera.csd.pois.modelos.Poi;
import ar.com.grupoesfera.csd.pois.repositorio.RepositorioDePoi;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ObtenerPOIMasCercanoTest {

    private ServicioPOIControlador servicioPOI;
    private RepositorioDePoi repositorio;

    @Test
    public void seDevuelveElPOIMasCercano(){
        final Double LATIUD_VALIDA = -34.6048789;
        final Double LONGITUD_VALIDA = -58.3793919;
        List<Poi> poiDisponibles = new LinkedList<>();

        repositorio = mock(RepositorioDePoi.class);
        when(this.repositorio.findAll()).thenReturn(poiDisponibles);


        servicioPOI = new ServicioPOIControlador(repositorio);
        Poi poi = servicioPOI.ObtenerPoiMasCercano(LATIUD_VALIDA, LONGITUD_VALIDA);
        assertThat(poi).isNotNull();
    }

}
