package prenda.componentes;

import java.util.List;

/**
 * Clase con las categorias de las prendas.
 */
public enum Categoria {

  PARTE_SUPERIOR(Material.telasParteSuperior()),
  PARTE_INFERIOR(Material.telasParteInferior()),

  CALZADO(Material.telasCalzado()),
  ACCESORIOS(Material.telasAccesorios());
  private final List<Material> tipoMateriales;

  Categoria(List<Material> tipoMateriales) {
    this.tipoMateriales = tipoMateriales;
  }

  /**
   * Obtiene los tipos de materiales.
   *
   * @return los tipos de materiales asociados al enum.
   */
  public List<Material> getTipoMateriales() {
    return this.tipoMateriales;
  }
}
