package usuario;

import java.util.ArrayList;
import java.util.List;
import usuario.atuendo.Atuendo;

public class Usuario {

  private Integer dni;
  private String nombre;
  private final List<Atuendo> atuendos = new ArrayList<>();

  public Usuario(Integer dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;
  }

  public void addAtuendo(Atuendo atuendo) {
    this.atuendos.add(atuendo);
  }
}
