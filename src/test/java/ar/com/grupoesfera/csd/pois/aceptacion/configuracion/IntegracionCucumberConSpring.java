package ar.com.grupoesfera.csd.pois.aceptacion.configuracion;

import ar.com.grupoesfera.csd.pois.PoisApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@CucumberContextConfiguration
@SpringBootTest(classes = PoisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(value = { ConfiguracionParaPruebasDeAceptacion.class })
public class IntegracionCucumberConSpring {


}
