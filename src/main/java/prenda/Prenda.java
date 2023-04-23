package prenda;

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
  private final Trama trama;

  /**
   * Constructor completo.
   *
   * @param tipo            el tipo de la prenda.
   * @param trama           la trama de la prenda.
   * @param material        el material de la prenda.
   * @param colorPrimario   el color primario de la prenda.
   * @param colorSecundario el color secundario de la prenda.
   */
  public Prenda(Tipo tipo, Trama trama, Material material, Color colorPrimario, Color colorSecundario) {
    this.tipo = tipo;
    this.trama = trama;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}
