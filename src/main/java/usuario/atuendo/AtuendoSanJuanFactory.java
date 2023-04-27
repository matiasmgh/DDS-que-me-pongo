package usuario.atuendo;

import exception.IncorrectColorPrimarioPrendaException;
import exception.IncorrectMaterialPrendaException;
import prenda.Borrador;
import prenda.Prenda;
import prenda.componentes.Categoria;
import prenda.componentes.Color;
import prenda.componentes.Material;
import prenda.componentes.Tipo;
import prenda.componentes.TipoMaterial;

public class AtuendoSanJuanFactory extends AtuendoFactory {

  @Override
  protected Prenda fabricarParteSuperior()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException {
    Tipo tipo = new Tipo(Categoria.PARTE_SUPERIOR);
    Color colorVerde = new Color(0, 255, 0);

    Borrador borradorPrenda = new Borrador(tipo);
    borradorPrenda.seleccionarMaterial(new Material(TipoMaterial.PIQUE));
    borradorPrenda.seleccionarColorPrimario(colorVerde);
    return borradorPrenda.buildPrenda();
  }

  @Override
  protected Prenda fabricarParteInferior()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException {
    Tipo tipo = new Tipo(Categoria.PARTE_INFERIOR);
    Color colorGris = new Color(130, 130, 130);

    Borrador borradorPrenda = new Borrador(tipo);
    borradorPrenda.seleccionarMaterial(new Material(TipoMaterial.ACETATO));
    borradorPrenda.seleccionarColorPrimario(colorGris);
    return borradorPrenda.buildPrenda();
  }

  @Override
  protected Prenda fabricarCalzado()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException {
    Tipo tipo = new Tipo(Categoria.CALZADO);
    Color colorBlanco = new Color(255, 255, 255);

    Borrador borradorPrenda = new Borrador(tipo);
    borradorPrenda.seleccionarMaterial(new Material(TipoMaterial.CUERO));
    borradorPrenda.seleccionarColorPrimario(colorBlanco);
    return borradorPrenda.buildPrenda();
  }
}
