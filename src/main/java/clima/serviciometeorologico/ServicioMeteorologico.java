package clima.serviciometeorologico;

import clima.EstadoDelTiempo;

public interface ServicioMeteorologico {
    EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
}