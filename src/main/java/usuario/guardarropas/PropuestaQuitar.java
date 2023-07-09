package usuario.guardarropas;

import prenda.Prenda;


public class PropuestaQuitar extends AbstractPropuesta {
    private Prenda prenda;

    private EstadoPropuesta estado;

    public PropuestaQuitar(Prenda prenda) {
        super(prenda);
    }

    @Override
    protected void realizarAceptacion(Guardarropas guardarropas) {
        guardarropas.quitarPrenda(this.prenda);
    }

}
