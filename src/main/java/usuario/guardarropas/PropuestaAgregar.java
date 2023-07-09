package usuario.guardarropas;

import prenda.Prenda;

public class PropuestaAgregar extends AbstractPropuesta {

    public PropuestaAgregar(Prenda prenda) {
        super(prenda);
    }

    @Override
    protected void realizarAceptacion(Guardarropas guardarropas) {
        guardarropas.agregarPrenda(this.prenda);
    }

}
