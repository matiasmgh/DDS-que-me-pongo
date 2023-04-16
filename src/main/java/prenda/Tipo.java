package prenda;

/**
 * Clase para representar los tipos de prendas.
 */
public class Tipo {
  String alias;
  Categoria categoria;

  /**
   * Constructor completo.
   *
   * @param alias el alias del tipo.
   * @param categoria la categoria a la que pertenece el tipo.
   */
  public Tipo(String alias, Categoria categoria) {
    this.alias = alias;
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
