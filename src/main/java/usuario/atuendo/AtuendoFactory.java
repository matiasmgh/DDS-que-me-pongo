package usuario.atuendo;

import exception.IncorrectColorPrimarioPrendaException;
import exception.IncorrectMaterialPrendaException;
import prenda.Prenda;

public abstract class AtuendoFactory {

  protected Atuendo fabricarAtuendo()
      throws IncorrectColorPrimarioPrendaException, IncorrectMaterialPrendaException {
    Prenda parteSuperior = fabricarParteSuperior();
    Prenda parteInferior = fabricarParteInferior();
    Prenda calzado = fabricarCalzado();
    return new Atuendo(parteSuperior, parteInferior, calzado, null);
  }

  protected abstract Prenda fabricarParteSuperior()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException;

  protected abstract Prenda fabricarParteInferior()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException;

  protected abstract Prenda fabricarCalzado()
      throws IncorrectMaterialPrendaException, IncorrectColorPrimarioPrendaException;
}
