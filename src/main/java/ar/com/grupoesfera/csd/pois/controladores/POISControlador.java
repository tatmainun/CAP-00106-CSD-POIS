package ar.com.grupoesfera.csd.pois.controladores;

import ar.com.grupoesfera.csd.pois.modelos.Poi;
import ar.com.grupoesfera.csd.pois.modelos.Pong;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

@RestController
@CrossOrigin
public class POISControlador {

    @GetMapping("/obtenerPOI")
    public ResponseEntity<Poi> obtenerPOI(@RequestParam("latitud") double latitud, @RequestParam("longitud") double longitud){

        if (latitud == 40.74858271884297 && longitud == -73.9856644020032)  {
            return ResponseEntity.ok(new Poi(40.74847518710113,-73.98620961865707, "Tacombi", "Funky bar & restaurant for tacos & other Mexican eats plus fresh juices & aguas frescas."));
        }else{
            return ResponseEntity.ok(null);
        }
    }

    @GetMapping("/obtenerPOIs")
    public ResponseEntity<List<Poi>> obtenerPOIs(double lat, double lon){

        List<Poi> POIList =  new ArrayList<Poi>();
        if (lat == 40.74858271884297 && lon == -73.9856644020032){
            POIList.add(new Poi(40.74784606929049,-73.98693581853294, "Turntable LP Bar & Karaoke", "Korean fried chicken, global plates & cocktails fuel patrons enjoying LP tunes & karaoke singers."));
            POIList.add(new Poi(40.747769917515846,-73.98502067197738, "Bochon", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats."));
            POIList.add(new Poi(40.74847518710113,-73.98620961865707, "Tacombi", "Funky bar & restaurant for tacos & other Mexican eats plus fresh juices & aguas frescas."));
            POIList.add(new Poi(40.74805958012065, -73.98585912759083, "Legens", "Soccer fans converge at this popular sports bar housing TVs, easy pub grub & cocktails, beer & wine."));
            POIList.add(new Poi(40.7477882797183, -73.98618295085856, "NewYork Roll'n Katsu", "Our Menu Features Sushi Rolls, Poke Bowls, Katsu, Teriyaki Dishes, Omelet Rice and More."));
        }

        return ResponseEntity.ok(POIList);
    }

//    @GetMapping("/obtenerPOIsCliente")
//    public ResponseEntity<List<Poi>> obtenerPOIDeCliente(int idCliente){
//
//        List<Poi> POIList =  new ArrayList<Poi>();
//
//        switch(idCliente) {
//            case 1:
//                POIList.add(new Poi(40.74784606929049,-73.98693581853294, "Turntable LP Bar & Karaoke", "Korean fried chicken, global plates & cocktails fuel patrons enjoying LP tunes & karaoke singers."));
//                POIList.add(new Poi(40.7477882797183, -73.98618295085856, "NewYork Roll'n Katsu", "Our Menu Features Sushi Rolls, Poke Bowls, Katsu, Teriyaki Dishes, Omelet Rice and More."));
//                POIList.add(new Poi(40.74805958012065, -73.98585912759083, "Legens", "Soccer fans converge at this popular sports bar housing TVs, easy pub grub & cocktails, beer & wine."));
//                break;
//            case 2:
//                POIList.add(new Poi(40.747769917515846,-73.98502067197738, "Bochon", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats."));
//                POIList.add(new Poi(40.74847518710113,-73.98620961865707, "Tacombi", "Funky bar & restaurant for tacos & other Mexican eats plus fresh juices & aguas frescas."));
//                break;
//            case 3:
//                POIList.add(new Poi(40.74784606929049,-73.98693581853294, "Turntable LP Bar & Karaoke", "Korean fried chicken, global plates & cocktails fuel patrons enjoying LP tunes & karaoke singers."));
//                POIList.add(new Poi(40.747769917515846,-73.98502067197738, "Bochon", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats."));
//                POIList.add(new Poi(40.74847518710113,-73.98620961865707, "Tacombi", "Funky bar & restaurant for tacos & other Mexican eats plus fresh juices & aguas frescas."));
//                break;
//            case 4:
//                POIList.add(new Poi(40.7477882797183, -73.98618295085856, "NewYork Roll'n Katsu", "Our Menu Features Sushi Rolls, Poke Bowls, Katsu, Teriyaki Dishes, Omelet Rice and More."));
//                break;
//            default:
//                break;
//        }
//
//        return ResponseEntity.ok(POIList);
//    }
//
//    @GetMapping("/obtenerPOIsADistancia")
//    public ResponseEntity<List<Poi>> obtenerPOIADistancia(double lat, double lon, double distance){
//
//        List<Poi> POIList =  new ArrayList<Poi>();
//        POIList.add(new Poi(40.74784606929049,-73.98693581853294, "Turntable LP Bar & Karaoke", "Korean fried chicken, global plates & cocktails fuel patrons enjoying LP tunes & karaoke singers."));
//        POIList.add(new Poi(40.747769917515846,-73.98502067197738, "Bochon", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats."));
//        POIList.add(new Poi(40.74847518710113,-73.98620961865707, "Tacombi", "Funky bar & restaurant for tacos & other Mexican eats plus fresh juices & aguas frescas."));
//        POIList.add(new Poi(40.74805958012065, -73.98585912759083, "Legens", "Soccer fans converge at this popular sports bar housing TVs, easy pub grub & cocktails, beer & wine."));
//        POIList.add(new Poi(40.7477882797183, -73.98618295085856, "NewYork Roll'n Katsu", "Our Menu Features Sushi Rolls, Poke Bowls, Katsu, Teriyaki Dishes, Omelet Rice and More."));
//
//        List<Poi> POIListOfInterest =  new ArrayList<Poi>();
//
//        for (int i = 0; i < POIList.size(); i++) {
//            Poi p = POIList.get(i);
//
//            double d =  DirectDistance(lat, lon, p.getLatitud(),p.getLongitud());
//            if (d <= distance){
//                POIListOfInterest.add(p);
//            }
//        }
//
//        return ResponseEntity.ok(POIListOfInterest);
//    }

    double ToRadians(double degrees)
    {
        double radians = degrees * 3.1415926535897932385 / 180;
        return radians;
    }

    double DirectDistance(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 3958.75;
        double dLat = ToRadians(lat2 - lat1);
        double dLng = ToRadians(lng2 - lng1);
        double a = sin(dLat / 2) * sin(dLat / 2) +
                cos(ToRadians(lat1)) * cos(ToRadians(lat2)) *
                        sin(dLng / 2) * sin(dLng / 2);
        double c = 2 * atan2(sqrt(a), sqrt(1 - a));
        double dist = earthRadius * c;
        double meterConversion = 1609.00;
        return dist * meterConversion;
    }
}
