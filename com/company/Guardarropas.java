

public Guardarropas {

  // lista de prendas que se almacenan
  private List<Prenda> prendas;
  // define el uso de las prendas que se almacenan
  private CriterioUso criterioUso;
  // son las propuestas de modificacion (pendientes y aceptadas)
  // cuando se rechaza una propuesta es eliminada de esta lista
  private List<Propuesta> propuestas;

  public void guardarPropuesta(unaPropuesta){ this.propuestas.add(unaPropuesta) }

  public void aceptarPropuesta(unaPropuesta){
    // le indicamos a la propuesta el guardarropa sobre el que hace efecto
    unaPropuesta.aceptar(this)
  }

  public void rechazarPropuesta(unaPropuesta){
    // al rechazar la propuesta se borra de la lista
    this.propuestas.borrarDeUnaLista(unaPropuesta)  // no se que metodo se usa para esto
  }

  public void deshacerPropuesta(unaPropuesta){
    // le indicamos a la propuesta el guardarropa sobre el que hace efecto
    unaPropuesta.deshacer(this)
  }

  public void agregarPrenda(unaPrenda){ this.prendas.add(unaPrenda) }

  public void quitarPrenda(unaPrenda){ this.prendas.borrarDeUnaLista(unaPrenda) }

  // este metodo genera todas las combinaciones posibles con las prendas del guardaropa
  public List<Atuendo> todasLasPosiblesCombinaciones(){
    return combinaciones;
  }
}