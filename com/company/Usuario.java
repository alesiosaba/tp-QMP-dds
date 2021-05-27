
public class Usuario {
  // un usuario puede conocer mas de 1 guardarropas
  private List<Guardarropas> guardarropas;

  public void crearGuardarropa(criterioUso, usuariosQueLoComparten){
      Guardarropas nuevoGuardarropas = new Guardarropas(Lista vacia de prendas, criterioUso, Lista vacia de propuestas);

      // cada usuario debe conocer el nuevo guardarropa compartido
      usuariosQueLoComparten.forEach(u -> u.agregarUnGuardarropa(nuevoGuardarropas));
  }

  public void agregarUnGuardarropa(unGuardarropa){ guardarropas.add(unGuardarropa) }

}