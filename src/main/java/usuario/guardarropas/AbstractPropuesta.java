package usuario.guardarropas;

import prenda.Prenda;

public abstract class AbstractPropuesta implements Propuesta {

    protected Prenda prenda;
    protected EstadoPropuesta estado;

    public AbstractPropuesta(Prenda prenda) {
        this.prenda = prenda;
        this.estado = EstadoPropuesta.PENDIENTE;
    }

    public void aceptar(Guardarropas guardarropas) {
        this.realizarAceptacion(guardarropas);
        this.estado = EstadoPropuesta.ACEPTADO;
    }
    public void rechazar(Guardarropas guardarropas) {
        this.estado = EstadoPropuesta.RECHAZADO;
    }

    @Override
    public EstadoPropuesta getEstado() {
        return estado;
    }

    abstract void realizarAceptacion(Guardarropas guardarropas);

}
