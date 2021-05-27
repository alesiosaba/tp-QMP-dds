
public interface PropuestaAgregar {
  private boolean aceptada;
  Prenda prenda;

  @Overrride
  public void aceptar(Guardarropas unGuardarropa){
    aceptada = true;

    unGuardarropa.agregarPrenda(this.prenda);
  }

  @Override
  public void deshacer(Guardarropas unGuardarropa){
    aceptada = false;

    unGuardarropa.quitarPrenda(this.prenda);
  }

}