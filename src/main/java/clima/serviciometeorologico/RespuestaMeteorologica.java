package clima.serviciometeorologico;

import clima.EstadoDelTiempo;

import java.time.LocalDateTime;

public record RespuestaMeteorologica(EstadoDelTiempo estadoDelTiempo, LocalDateTime expiracion) {
    public boolean expiro() {
        return this.expiracion.isAfter(LocalDateTime.now());
    }

    public EstadoDelTiempo estadoDelTiempo() {
        return estadoDelTiempo;
    }
}
