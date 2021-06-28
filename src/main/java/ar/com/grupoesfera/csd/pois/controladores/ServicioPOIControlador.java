package ar.com.grupoesfera.csd.pois.controladores;

import ar.com.grupoesfera.csd.pois.modelos.Poi;
import ar.com.grupoesfera.csd.pois.repositorio.RepositorioDePoi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPOIControlador {
    @Autowired
    public ServicioPOIControlador(RepositorioDePoi repositorioPOI) {
        this.repositorioPOI = repositorioPOI;
    }

    private RepositorioDePoi repositorioPOI;

    public Poi ObtenerPoiMasCercano (double latUsuario, double lonUsuario){
        List<Poi> pois = repositorioPOI.findAll();
        double distancia = Double.MAX_VALUE;
        Poi poiMasCercano = null;

        for(Poi poi : pois){
            double distanciaCalculada = calcularDistancia(poi.getLatitud(), poi.getLongitud(), latUsuario, lonUsuario);
            if (distanciaCalculada < distancia) {
                distancia = distanciaCalculada;
                poiMasCercano = poi;
            }
        }

        return poiMasCercano;
    }

    private double calcularDistancia(double latPoi, double lngPoi, double latUsuario, double lngUsuario){

        double dLat = Math.toRadians(latPoi - latUsuario);
        double dLng = Math.toRadians(lngPoi - lngUsuario);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);

        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(latUsuario)) * Math.cos(Math.toRadians(latPoi));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));

        final int radioTierra = 6371; // Radius of the earth
        double distancia = radioTierra * va2;

        return  distancia;

    }
}
