package sugerencia;

import java.util.List;
import com.google.common.collect.Lists;
import prenda.Formalidad;
import prenda.Prenda;
import prenda.componentes.Categoria;
import usuario.Usuario;

public class MotorSugerenciasFormalidad implements MotorSugerencias {

  @Override
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    List<Prenda> prendasSuperiores =
        this.getPrendasValidas(usuario).stream().filter(p -> p.getCategoria().equals(
            Categoria.PARTE_SUPERIOR)).toList();
    List<Prenda> prendasInferiores =
        this.getPrendasValidas(usuario).stream()
            .filter(p -> p.getCategoria().equals(Categoria.PARTE_INFERIOR)).toList();
    List<Prenda> calzados =
        this.getPrendasValidas(usuario).stream()
            .filter(p -> p.getCategoria().equals(Categoria.CALZADO)).toList();

    //Uso una biblioteca como Guava para el producto cartesiano
    List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores,
        prendasInferiores, calzados);

    return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2)))
        .toList();
  }

  protected List<Prenda> getPrendasValidas(Usuario usuario) {
    return usuario.getEdad() > 55 ? usuario.getPrendas().stream()
        .filter(p -> !p.getFormalidad().equals(Formalidad.INFORMAL)).toList() :
        usuario.getPrendas();
  }
}
