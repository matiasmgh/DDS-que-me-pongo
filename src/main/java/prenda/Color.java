package prenda;

/**
 * Clase para representar un color.
 */
public class Color {
  Long codigo;
  String alias;

  /**
   * Constructor completo.
   *
   * @param codigo codigo hexadecimal de un color.
   * @param alias alias del color.
   */
  public Color(Long codigo, String alias) {
    this.codigo = codigo;
    this.alias = alias;
  }
}

