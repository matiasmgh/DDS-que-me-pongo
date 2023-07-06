package prenda.componentes;

import java.util.List;

/**
 * Enumerado de los tipos de tela/material.
 */
public enum Material {
  LANA,
  ALGODON,
  PIQUE,
  ACETATO,
  CUERO;

  public static List<Material> telasParteSuperior() {
    return List.of(Material.LANA, Material.ALGODON, Material.PIQUE, Material.ACETATO);
  }

  public static List<Material> telasParteInferior() {
    return List.of(Material.LANA, Material.ALGODON, Material.PIQUE, Material.ACETATO);

  }

  public static List<Material> telasCalzado() {
    return List.of(Material.CUERO);
  }

  public static List<Material> telasAccesorios() {
    return List.of(Material.values());
  }

  public Boolean isValidForCategoria(Categoria categoria) {
    return categoria.getTipoMateriales().contains(this);
  }
}
