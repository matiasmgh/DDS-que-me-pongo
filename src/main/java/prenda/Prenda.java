package prenda;

/**
 * Clase para representar una prenda.
 */
public class Prenda {
  Tipo tipo;
  Categoria categoria;
  String material;
  Color colorPrimario;
  Color colorSecundario;

  /**
   * Constructor completo.
   *
   * @param tipo el tipo de la prenda.
   * @param categoria la categoria de la prenda.
   * @param material el material de la prenda.
   * @param colorPrimario el color primario de la prenda.
   * @param colorSecundario el color secundario de la prenda.
   */
  public Prenda(Tipo tipo, Categoria categoria, String material, Color colorPrimario, Color colorSecundario) {
    this.tipo = tipo;
    this.categoria = categoria;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}
