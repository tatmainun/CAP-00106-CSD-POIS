package ar.com.grupoesfera.csd.pois.aceptacion.pasos;

import ar.com.grupoesfera.csd.pois.aceptacion.configuracion.ContextoCompartido;
import ar.com.grupoesfera.csd.pois.modelos.Poi;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class ObtenerPOIPasos {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ContextoCompartido contextoCompartido;


    @Given("El usuario se encuentra en la latitud {double} y longitud {double}")
    public void elUsuarioSeEncuentraEn(double latitud, double longitud) throws Exception {
        contextoCompartido.agregarUbicacionUsuario(latitud, longitud);
    }

    @Given("Existe un punto de interes {string} en la latitud {double} y longitud {double} con descripcion {string}")
    public void elPOISeEncuentraEn(String nombre, double latitud, double longitud, String descripcion) throws Exception {
        Poi poi = new Poi(latitud,longitud, nombre, descripcion);
    }
}