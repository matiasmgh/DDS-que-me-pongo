package usuario;

import java.util.ArrayList;
import java.util.List;

import usuario.guardarropas.Guardarropas;
import prenda.Prenda;
import sugerencia.MotorSugerencias;
import sugerencia.Sugerencia;

public class Usuario {

  private final Integer dni;
  private final String nombre;

  private final Integer edad;

  private final MotorSugerencias motorSugerencias;
  private final List<Prenda> prendas = new ArrayList<>();

  private final List<Guardarropas> guardarropas = new ArrayList<>();

  public Usuario(Integer dni, String nombre, Integer edad,
                 MotorSugerencias motorSugerencias) {
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
  }

  public void addPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public List<Sugerencia> generarSugerencias() {
    return this.motorSugerencias.generarSugerencias(this);
  }

  /**
   * Obtiene el campo dni.
   *
   * @return el valor del campo dni
   */
  public Integer getDni() {
    return dni;
  }

  /**
   * Obtiene el campo nombre.
   *
   * @return el valor del campo nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Obtiene el campo edad.
   *
   * @return el valor del campo edad
   */
  public Integer getEdad() {
    return edad;
  }

  /**
   * Obtiene el campo motorSugerencias.
   *
   * @return el valor del campo motorSugerencias
   */
  public MotorSugerencias getMotorSugerencias() {
    return motorSugerencias;
  }

  /**
   * Obtiene el campo atuendos.
   *
   * @return el valor del campo atuendos
   */
  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.add(guardarropas);
  }

  public void quitarGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.remove(guardarropas);
  }
}
