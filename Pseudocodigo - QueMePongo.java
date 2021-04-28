class Prenda {
    TipoPrenda tipoPrenda
    Material material
    Color colorPrincipal
    Color colorSecundario

    constructor(tipoDePrenda, material, colorPrincipal)
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio")
        this.material = requireNonNull(material, "material es obligatorio")
        this.colorPrincipal = requireNonNull(colorPrincipal, "color principal es obligatorio")

    constructor(tipoDePrenda, material, colorPrincipal,colorSecundario)
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio")
        this.material = requireNonNull(material, "material es obligatorio")
        this.colorPrincipal = requireNonNull(colorPrincipal, "color principal es obligatorio")
        this.colorSecundario = requireNonNull(colorSecundario, "color secundario es obligatorio")

    Categoria categoria()
        return this.tipoPrenda.categoria()
}
--------------------------------------------------------------------------------------------------------------
class TipoDePrenda {
    Categoria categoria

    constructor(Categoria categoria)
      this.categoria = categoria

    Categoria categoria()
        return this.categoria
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
enum Categoria {
    PARTE_SUPERIOR,
    CALZADO,
    PARTE_INFERIOR,
    ACCESORIOS
}
--------------------------------------------------------------------------------------------------------------
