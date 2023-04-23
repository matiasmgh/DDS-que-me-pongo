package prenda.componentes;

/**
 * Clase para representar los tipos de prendas.
 */
public class Tipo {
  private final Categoria categoria;

  /**
   * Constructor completo.
   *
   * @param categoria la categoria a la que pertenece el tipo.
   */
  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
