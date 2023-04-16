package prenda;

import exception.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.builder.PrendaBuilder;

/**
 * Clase para testear la clase PrendaBuilder con sus validaciones.
 */
public class PrendaBuilderTest {
  private PrendaBuilder prendaBuilder;

  private Tipo tipo;

  @BeforeEach
  public void setUp() {
    this.prendaBuilder = new PrendaBuilder();
    this.tipo = new Tipo("remera corta", Categoria.PARTE_SUPERIOR);
  }

  @Test
  public void testBuildPrendaWithNullTipo() {
    Assertions.assertThrows(IncorrectTipoPrendaException.class,
        () -> prendaBuilder.withTipo(null));
  }

  @Test
  public void testBuildPrendaWithNullCategoria() {
    Assertions.assertThrows(IncorrectCategoriaPrendaException.class,
        () -> prendaBuilder.withCategoria(null));
  }

  @Test
  public void testBuildPrendaWithNullMaterial() {
    Assertions.assertThrows(IncorrectMaterialPrendaException.class,
        () -> prendaBuilder.withMaterial(null));
  }

  @Test
  public void testBuildPrendaWithNullColorPrimario() {
    Assertions.assertThrows(IncorrectColorPrimarioPrendaException.class,
        () -> prendaBuilder.withColorPrimario(null));
  }

  @Test
  public void testBuildWithTipoIncompatibleForPrendaCategoria() {
    Assertions.assertThrows(IncompatibleTipoPrendaException.class,
        () -> prendaBuilder.withTipo(tipo).withCategoria(Categoria.CALZADO).build());
  }
}
