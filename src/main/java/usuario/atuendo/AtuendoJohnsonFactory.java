package usuario.atuendo;

import exception.IncorrectColorPrimarioPrendaException;
import exception.IncorrectMaterialPrendaException;
import prenda.Borrador;
import prenda.Prenda;
import prenda.componentes.Categoria;
import prenda.componentes.Color;
import prenda.componentes.Tipo;
import prenda.componentes.Material;

public class AtuendoJohnsonFactory extends AtuendoFactory {

  @Override
  protected Prenda fabricarParteSuperior()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException {
    Tipo tipo = new Tipo(Categoria.PARTE_SUPERIOR);
    Color colorBlanco = new Color(255, 255, 255);

    Borrador borradorPrenda = new Borrador(tipo);
    borradorPrenda.seleccionarMaterial(Material.PIQUE);
    borradorPrenda.seleccionarColorPrimario(colorBlanco);
    return borradorPrenda.buildPrenda();
  }

  @Override
  protected Prenda fabricarParteInferior()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException {
    Tipo tipo = new Tipo(Categoria.PARTE_INFERIOR);
    Color colorNegro = new Color(0, 0, 0);

    Borrador borradorPrenda = new Borrador(tipo);
    borradorPrenda.seleccionarMaterial(Material.ACETATO);
    borradorPrenda.seleccionarColorPrimario(colorNegro);
    return borradorPrenda.buildPrenda();
  }

  @Override
  protected Prenda fabricarCalzado()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException {
    Tipo tipo = new Tipo(Categoria.CALZADO);
    Color colorNegro = new Color(0, 0, 0);

    Borrador borradorPrenda = new Borrador(tipo);
    borradorPrenda.seleccionarMaterial(Material.CUERO);
    borradorPrenda.seleccionarColorPrimario(colorNegro);
    return borradorPrenda.buildPrenda();
  }
}
