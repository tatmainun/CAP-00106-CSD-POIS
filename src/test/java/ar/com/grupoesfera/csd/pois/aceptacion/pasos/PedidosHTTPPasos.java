package ar.com.grupoesfera.csd.pois.aceptacion.pasos;

import ar.com.grupoesfera.csd.pois.aceptacion.configuracion.ContextoCompartido;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.javacrumbs.jsonunit.core.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static net.javacrumbs.jsonunit.spring.JsonUnitResultMatchers.json;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PedidosHTTPPasos {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ContextoCompartido contextoCompartido;

    @When("el cliente hace un GET a {string}")
    public void elClienteHaceUnGETA(String ruta) throws Exception {
        ResultActions resultado = mockMvc.perform(get(ruta));
        this.contextoCompartido.agregarResultado(resultado);
    }

    @Then("recibe la respuesta con codigo de estado {int} y contenido")
    public void recibeLaRespuestaConCodigoDeEstadoYContenido(int codigoDeEstado, String respuesta) throws Exception {

        ResultActions resultado = this.contextoCompartido.obtenerResultado();

        resultado.andExpect(status().is(codigoDeEstado))
                .andExpect(json()
                        .when(Option.IGNORING_ARRAY_ORDER)
                        .isEqualTo(respuesta)
                );
    }

    @Given("El usuario se encuentra en la latitud {double} y longitud {double}")
    public void elUsuarioSeEncuentraEn(double latitud, double longitud) throws Exception {


    }

    @Given("El usuario se encuentra en la latitud {string} y longitud {string}")
    public void el_usuario_se_encuentra_en_la_latitud_y_longitud(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("Existe un punto de interes en la latitud {string} y longitud {string}")
    public void existe_un_punto_de_interes_en_la_latitud_y_longitud(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        
    }
}
