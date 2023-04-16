package prenda.builder;

import exception.*;
import prenda.Categoria;
import prenda.Color;
import prenda.Prenda;
import prenda.Tipo;
import java.util.Objects;

/**
 * Clase para construir prendas.
 */
public class PrendaBuilder {

  private Prenda prenda;

  private Tipo tipo;
  private Categoria categoria;
  private String material;
  private Color colorPrimario;
  private Color colorSecundario;

  /**
   * Construye la prenda.
   *
   * @return el objeto de tipo Prenda.
   * @throws IncompatibleTipoPrendaException si se intenta construir una prenda con un tipo incompatible con la categoria.
   */
  public Prenda build() throws IncompatibleTipoPrendaException {
    if (this.prendaIsValid()) {
      prenda = new Prenda(this.tipo, this.categoria, this.material, this.colorPrimario, this.colorSecundario);
      this.reset();
    } else {
      throw new IncompatibleTipoPrendaException();
    }
    return prenda;
  }

  /**
   * Agrega un tipo al constructor de prenda.
   * @param tipo el tipo a agregar.
   * @return la misma referencia al constructor, luego de agregar un tipo.
   * @throws IncorrectTipoPrendaException si el tipo agregado es incorrecto.
   */
  public PrendaBuilder withTipo(Tipo tipo) throws IncorrectTipoPrendaException {
    if (Objects.nonNull(tipo)) {
      this.tipo = tipo;
    } else {
      throw new IncorrectTipoPrendaException();
    }
    return this;
  }


  /**
   * Agrega una categoria al constructor de prenda.
   * @param categoria la categoria a agregar.
   * @return la misma referencia al constructor, luego de agregar una categoria.
   * @throws IncorrectCategoriaPrendaException si la categoria agregada es incorrecta.
   */
  public PrendaBuilder withCategoria(Categoria categoria) throws IncorrectCategoriaPrendaException {
    if (Objects.nonNull(categoria)) {
      this.categoria = categoria;
    } else {
      throw new IncorrectCategoriaPrendaException();
    }
    return this;
  }

  /**
   * Agrega un material al constructor de prenda.
   * @param material el material a agregar.
   * @return la misma referencia al constructor, luego de agregar un material.
   * @throws IncorrectMaterialPrendaException si el material agregado es incorrecta.
   */
  public PrendaBuilder withMaterial(String material) throws IncorrectMaterialPrendaException {
    if (Objects.nonNull(material)) {
      this.material = material;
    } else {
      throw new IncorrectMaterialPrendaException();
    }
    return this;
  }

  /**
   * Agrega un color primario al constructor de prenda.
   *
   * @param color el color primario a agregar.
   * @return la misma referencia al constructor, luego de agregar un color primario.
   * @throws IncorrectColorPrimarioPrendaException si el color primario agregado es incorrecto.
   */
  public PrendaBuilder withColorPrimario(Color color) throws IncorrectColorPrimarioPrendaException {
    if (Objects.nonNull(color)) {
      this.colorPrimario = color;
    } else {
      throw new IncorrectColorPrimarioPrendaException();
    }
    return this;
  }

  public PrendaBuilder withColorSecundario(Color color) {
    this.colorSecundario = color;
    return this;
  }

  private PrendaBuilder reset() {
    this.categoria = null;
    this.prenda = null;
    this.tipo = null;
    this.material = null;
    this.colorPrimario = null;
    this.colorSecundario = null;
    return this;
  }

  private Boolean prendaIsValid() {
    return this.tipo.getCategoria().equals(this.categoria);
  }
}
