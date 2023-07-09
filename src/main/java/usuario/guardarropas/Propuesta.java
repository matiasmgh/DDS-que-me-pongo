package usuario.guardarropas;

public interface Propuesta {

    void aceptar(Guardarropas guardarropas);

    void rechazar(Guardarropas guardarropas);

    EstadoPropuesta getEstado();
}
