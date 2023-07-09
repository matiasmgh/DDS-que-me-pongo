package clima;

import clima.serviciometeorologico.ServicioMeteorologicoAccuWeather;
import prenda.Atuendo;
import prenda.Guardarropas;

import java.util.List;

public class AsesorDeImagen {
    private ServicioMeteorologicoAccuWeather servicioMeteorologicoAccuWeather;

    public AsesorDeImagen(ServicioMeteorologicoAccuWeather servicioMeteorologicoAccuWeather) {
        this.servicioMeteorologicoAccuWeather = servicioMeteorologicoAccuWeather;
    }

    public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {
        EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologicoAccuWeather.obtenerCondicionesClimaticas(direccion);
        List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones();
        return combinaciones
                .stream()
                .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.temperatura()))
                .filter(combinacion -> combinacion.aptaParaHumedad(estadoDelTiempo.humedad()))
                .findFirst()
                .get();

    }
}