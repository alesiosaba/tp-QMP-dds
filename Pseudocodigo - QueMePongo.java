class Prenda {
    TipoPrenda tipoPrenda
    Material material
    Color colorPrincipal
    Color colorSecundario
    Trama trama

    constructor(tipoDePrenda, material, colorPrincipal,colorSecundario,trama)
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio")
        this.material = requireNonNull(material, "material es obligatorio")
        this.colorPrincipal = requireNonNull(colorPrincipal, "color principal es obligatorio")
        this.colorSecundario = colorSecundario
        
        if(trama == null)
            this.trama = TipoDePrenda.LISA
        else
            this.trama = trama

    Categoria categoria()
        return this.tipoPrenda.categoria()
}
--------------------------------------------------------------------------------------------------------------
class TipoDePrenda {
    Categoria categoria
    TipoDePrenda tipoDePrenda

    constructor(Categoria categoria)
      this.categoria = categoria

    Categoria categoria()
        return this.categoria
}
--------------------------------------------------------------------------------------------------------------
enum Categoria {
    PARTE_SUPERIOR,
    CALZADO,
    PARTE_INFERIOR,
    ACCESORIOS
}
--------------------------------------------------------------------------------------------------------------
class Color {
    int rojo
    int verde
    int azul

    constructor(int rojo,int verde,int azul)
        this.rojo = rojo
        this.verde = verde
        this.azul = azul
}
--------------------------------------------------------------------------------------------------------------
enum Material {
    CUERO,
    JEAN,
    ALGODON,
    ...
}
--------------------------------------------------------------------------------------------------------------
enum Trama {
    LISA,
    RAYADA,
    CON_LUNARES,
    A_CUADROS,
    ESTAMPADO
}
--------------------------------------------------------------------------------------------------------------
enum TipoDePrenda {
    ZAPATO,
    REMERA,
    CAMISA,
    ...
}
--------------------------------------------------------------------------------------------------------------
class Borrador {
    TipoPrenda tipoPrenda
    Material material
    Color colorPrincipal
    Color colorSecundario
    Trama trama

    void cargarTipoDePrenda(tipo)
        this.TipoPrenda = tipo
    
    void cargarDatosRestantes(colorP,colorS,material,trama)
        this.colorP = colorPrincipal
        this.colorS = colorSecundario
        this.material = material
        this.trama = trama

    Prenda crearPrenda()
        return new Prenda(tipoPrenda,material,colorPrincipal,colorSecundario,trama)
}
--------------------------------------------------------------------------------------------------------------
class Sugerencia {
    Uniforme uniformeSugerido

    constructor(uniformeSugerido)
        this.uniformeSugerido = requireNonNull(uniformeSugerido, "Falta el uniforme sugerido")
}
--------------------------------------------------------------------------------------------------------------
class Uniforme {
    Prenda parteSuperior
    Prenda parteInferior
    Prenda calzado

    constructor(parteSuperior,parteInferior,calzado)
        this.parteSuperior = requireNonNull(parteSuperior, "Falta la parte superior")
        this.parteInferior = requireNonNull(parteSuperior, "Falta la parte inferior")
        this.calzado = requireNonNull(calzado, "Falta el calzado")
}
--------------------------------------------------------------------------------------------------------------
class Institucion {
    String nombre
    Uniforme uniforme

    constructor(nombre,uniforme)
        if usuario.esAdmin(){
            this.nombre = requireNonNull(nombre,"Falta el nombre de la institucion")
            this.Uniforme = requireNonNull(uniforme,"Falta el uniforme de la institucion")
        }
}
--------------------------------------------------------------------------------------------------------------



