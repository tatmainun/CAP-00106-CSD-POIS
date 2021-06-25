package ar.com.grupoesfera.csd.pois.aceptacion.configuracion;

import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.ResultActions;

@Component
public class ContextoCompartido {

    private ResultActions resultado;
    private double ubicacionUsuario[];

    public void agregarResultado(ResultActions resultado) {
        this.resultado = resultado;
    }

    public ResultActions obtenerResultado() {
        return resultado;
    }

    public void agregarUbicacionUsuario(double latitud, double longitud){
        this.ubicacionUsuario = new double[]{latitud, longitud};
    }
    public double[] obtenerUbicacionUsuario(){
        return this.ubicacionUsuario;
    }
}
