package usuario.guardarropas;

import prenda.Prenda;
import usuario.atuendo.Atuendo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guardarropas {
    private List<Prenda> prendas = new ArrayList<>();
    private List<Propuesta> propuestas = new ArrayList<>();

    public List<Atuendo> todasLasPosiblesCombinaciones() {
        return Arrays.asList(new Atuendo(null, null, null),
                new Atuendo(null, null, null),
                new Atuendo(null, null, null));
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda) {
        this.prendas.remove(prenda);
    }

    public void agregarPropuesta(Propuesta propuesta) {
        this.propuestas.add(propuesta);
    }

    public void quitarPropuesta(Propuesta propuesta) {
        this.propuestas.remove(propuesta);
    }

    public void propuestasPendientes() {
        this.propuestas.stream().filter(p -> p.getEstado().equals(EstadoPropuesta.PENDIENTE));
    }

    public void aceptar(Propuesta propuesta) {
        propuesta.aceptar(this);
    }

    public void rechazar(Propuesta propuesta) {
        propuesta.rechazar(this);
    }
}