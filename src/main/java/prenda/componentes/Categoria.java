package prenda.componentes;

import java.util.List;

/**
 * Clase con las categorias de las prendas.
 */
public enum Categoria {

  PARTE_SUPERIOR(TipoMaterial.telasParteSuperior()),
  PARTE_INFERIOR(TipoMaterial.telasParteInferior()),

  CALZADO(TipoMaterial.telasCalzado()),
  ACCESORIOS(TipoMaterial.telasAccesorios());
  private final List<TipoMaterial> tipoMateriales;

  Categoria(List<TipoMaterial> tipoMateriales) {
    this.tipoMateriales = tipoMateriales;
  }

  /**
   * Obtiene los tipos de materiales.
   *
   * @return los tipos de materiales asociados al enum.
   */
  public List<TipoMaterial> getTipoMateriales() {
    return this.tipoMateriales;
  }
}
