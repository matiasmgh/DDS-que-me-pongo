package prenda.componentes;

public class Material {
  private final TipoMaterial tipoMaterial;

  /**
   * Constructor de un material.
   *
   * @param tipoMaterial el tipo de tela.
   */
  public Material(TipoMaterial tipoMaterial) {
    this.tipoMaterial = tipoMaterial;
  }

  /**
   * Obtiene el tipo de material.
   *
   * @return el tipo de material.
   */
  public TipoMaterial getTipoMaterial() {
    return tipoMaterial;
  }

}
