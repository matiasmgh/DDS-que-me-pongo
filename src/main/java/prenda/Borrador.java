package prenda;

import exception.IncorrectColorPrimarioPrendaException;
import exception.IncorrectFormalidadException;
import exception.IncorrectMaterialPrendaException;
import prenda.componentes.Color;
import prenda.componentes.Material;
import prenda.componentes.Tipo;
import prenda.componentes.Trama;
import java.util.Objects;

public class Borrador {

  // Componentes de una prenda.
  private final Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;
  private Formalidad formalidad;

  /**
   * Constructor para el tipo unicamente.
   *
   * @param tipo el tipo de prenda deseado.
   */
  public Borrador(Tipo tipo) {
    this.tipo = tipo;
  }

  /**
   * Construye una prenda con las configuraciones del borrador.
   *
   * @return una prenda.
   */
  public Prenda buildPrenda() {
    return new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario,
        formalidad, this.trama);
  }

  public Borrador seleccionarMaterial(Material material) throws IncorrectMaterialPrendaException {
    if(Objects.nonNull(material) && this.materialIsValid(material)) {
      this.material = material;
    } else {
      throw new IncorrectMaterialPrendaException();
    }
    return this;
  }

  public Borrador seleccionarColorPrimario(Color color) throws IncorrectColorPrimarioPrendaException {
    if(Objects.nonNull(color)) {
      this.colorPrimario = color;
    } else {
      throw new IncorrectColorPrimarioPrendaException();
    }
    return this;
  }

  public Borrador seleccionarColorSecundario(Color color) {
    this.colorSecundario = color;
    return this;
  }

  public Borrador seleccionarTrama(Trama trama) {
    if (Objects.isNull(trama)) {
      this.trama = Trama.LISO;
    } else {
      this.trama = trama;
    }
    return this;
  }

  public Borrador seleccionarFormalidad(Formalidad formalidad)
      throws IncorrectFormalidadException {
    if (Objects.nonNull(formalidad)) {
      this.formalidad = formalidad;
    } else {
      throw new IncorrectFormalidadException();
    }
    return this;
  }

  private Boolean materialIsValid(Material material) {
    return material.isValidForCategoria(this.tipo.getCategoria());
  }
}
