package prenda;

import prenda.componentes.Categoria;
import prenda.componentes.Color;
import prenda.componentes.Material;
import prenda.componentes.Tipo;
import prenda.componentes.Trama;

/**
 * Clase para representar una prenda.
 */
public class Prenda {
  private final Tipo tipo;
  private final Material material;
  private final Color colorPrimario;
  private final Color colorSecundario;
  private final Formalidad formalidad;
  private final Trama trama;

  /**
   * Constructor completo.
   *
   * @param tipo            el tipo de la prenda.
   * @param material        el material de la prenda.
   * @param colorPrimario   el color primario de la prenda.
   * @param colorSecundario el color secundario de la prenda.
   * @param formalidad      si es formal o informal.
   * @param trama           la trama de la prenda.
   */
  public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario,
                Formalidad formalidad, Trama trama) {
    this.tipo = tipo;
    this.formalidad = formalidad;
    this.trama = trama;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  /**
   * Obtiene el campo tipo.
   *
   * @return el valor del campo tipo
   */
  public Tipo getTipo() {
    return tipo;
  }

  public Categoria getCategoria() {
    return this.getTipo().getCategoria();
  }

  /**
   * Obtiene el campo material.
   *
   * @return el valor del campo material
   */
  public Material getMaterial() {
    return material;
  }

  /**
   * Obtiene el campo colorPrimario.
   *
   * @return el valor del campo colorPrimario
   */
  public Color getColorPrimario() {
    return colorPrimario;
  }

  /**
   * Obtiene el campo colorSecundario.
   *
   * @return el valor del campo colorSecundario
   */
  public Color getColorSecundario() {
    return colorSecundario;
  }

  /**
   * Obtiene el campo formalidad.
   *
   * @return el valor del campo formalidad
   */
  public Formalidad getFormalidad() {
    return formalidad;
  }

  /**
   * Obtiene el campo trama.
   *
   * @return el valor del campo trama
   */
  public Trama getTrama() {
    return trama;
  }
}
