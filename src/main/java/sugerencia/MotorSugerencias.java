package sugerencia;

import java.util.List;
import usuario.Usuario;

public interface MotorSugerencias {

  List<Sugerencia> generarSugerencias(Usuario usuario);
}
