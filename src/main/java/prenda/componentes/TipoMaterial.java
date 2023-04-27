package prenda.componentes;

import java.util.List;

/**
 * Enumerado de los tipos de tela/material.
 */
public enum TipoMaterial {
  LANA,
  ALGODON,
  PIQUE,
  ACETATO,
  CUERO;

  public static List<TipoMaterial> telasParteSuperior() {
    return List.of(TipoMaterial.LANA, TipoMaterial.ALGODON, TipoMaterial.PIQUE, TipoMaterial.ACETATO);
  }

  public static List<TipoMaterial> telasParteInferior() {
    return List.of(TipoMaterial.LANA, TipoMaterial.ALGODON, TipoMaterial.PIQUE, TipoMaterial.ACETATO);

  }

  public static List<TipoMaterial> telasCalzado() {
    return List.of(TipoMaterial.CUERO);
  }

  public static List<TipoMaterial> telasAccesorios() {
    return List.of(TipoMaterial.values());
  }

  public Boolean isValidForCategoria(Categoria categoria) {
    return categoria.getTipoMateriales().contains(this);
  }
}
