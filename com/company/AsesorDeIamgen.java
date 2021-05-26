
//asumiremos que el Guardarropas ya es capaz de calcular la combinatoria de prendas y producir todos los atuendos posibles
//(sin considerar si son útiles o no). También asumiremos que el existe un objeto seleccionador de atuendos,
//que llamaremos AsesorDeImagen, que es responsable justamente de elegir entre los atuendos aquellos
//que son aptos para el clima (y quizás, nuestras preferencias de moda en el futuro)

public class AsesorDeImagen {
  private CondicionesClimaticas servicioMeteorologico;

  // se asigan la API de clima por constructor

  // habiamos hecho una clase Sugerencia pero lo reemplazamos con este metodo
  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {
    Map estadoDelTiempo = this.servicioMeteorologico.obtenerCondicionesClimaticas(direccion);

    int temperatura = estadoDelTiempo.get("Temperature")

    List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones();

    return combinaciones
        .filter( combinacion -> combinacion.aptaParaTemperatura(temperatura) )
        .first();
  }
}

