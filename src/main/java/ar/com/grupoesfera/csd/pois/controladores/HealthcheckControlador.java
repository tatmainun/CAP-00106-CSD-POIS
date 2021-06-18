package ar.com.grupoesfera.csd.pois.controladores;

import ar.com.grupoesfera.csd.pois.modelos.Poi;
import ar.com.grupoesfera.csd.pois.modelos.Pong;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class HealthcheckControlador {

    @GetMapping("/ping")
    public ResponseEntity<Pong> obtengoElPongDeLaAplicacion(){
        return ResponseEntity.ok(new Pong());
    }

    @GetMapping("/obtenerPOI")
    public ResponseEntity<List<Poi>> obtenerPOI(double lat, double lon){

        List<Poi> POIList =  new ArrayList<Poi>();
        if (lat == 40.74858271884297 && lon == -73.9856644020032){
            POIList.add(new Poi(40.74784606929049,-73.98693581853294, "Turntable LP Bar & Karaoke", "Korean fried chicken, global plates & cocktails fuel patrons enjoying LP tunes & karaoke singers."));
         //   POIList.add(new Poi(40.747769917515846,-73.98502067197738, "Bochon", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats."));
        }

        return ResponseEntity.ok(POIList);
    }
}
