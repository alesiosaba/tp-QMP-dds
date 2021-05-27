
public interface PropuestaQuitar {
  private boolean aceptada;
  Prenda prenda;

  @Overrride
  public void aceptar(Guardarropas unGuardarropa){
    aceptada = true;

    unGuardarropa.quitarPrenda(this.prenda);
  }

  @Override
  public void deshacer(Guardarropas unGuardarropa){
    aceptada = false;

    unGuardarropa.agregarPrenda(this.prenda);
  }
}