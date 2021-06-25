package ar.com.grupoesfera.csd.pois.controladores;

import ar.com.grupoesfera.csd.pois.modelos.Poi;
import ar.com.grupoesfera.csd.pois.modelos.Pong;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;
import static java.lang.Math.sqrt;

@RestController
@CrossOrigin
public class HealthcheckControlador {

    public final static double AVERAGE_RADIUS_OF_EARTH_KM = 6371;

    @GetMapping("/ping")
    public ResponseEntity<Pong> obtengoElPongDeLaAplicacion(){
        return ResponseEntity.ok(new Pong());
    }

}
