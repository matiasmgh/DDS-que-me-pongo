package prenda.componentes;

/**
 * Clase para representar un color.
 */
public class Color {

  private Integer rojo;
  private Integer verde;
  private Integer azul;

  /**
   * Constructor de un color.
   *
   * @param rojo valor de rojo (0-255)
   * @param verde valor de verde (0-255)
   * @param azul valor de azul (0-255)
   */
  public Color(Integer rojo, Integer verde, Integer azul) {
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }
}

