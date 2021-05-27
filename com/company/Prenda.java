package com.company;

import java.util.List;

import static java.util.Objects.requireNonNull;


public class Prenda {
    TipoPrenda tipo;
    Material material;
    Trama trama;
    Color color;
    Color colorSecundario;
    List<Prenda> prendas;
    // lo usamos para filtrar por criterio de uso en los guardarropas
    CriterioUso criterioUso;

    Integer temperatura;

    public Prenda(TipoPrenda tipo, Material material,Trama trama ,Color color, Color colorSecundario) {
        this.tipo = requireNonNull(tipo,"el tipo de prenda es obligatorio");
        this.material = requireNonNull(material,"el material es obligatorio");
        this.trama = trama;
        this.color = requireNonNull(color,"el color es obligatorio");
        this.colorSecundario = colorSecundario;
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public Boolean aptaTemperatura(Integer tempActual) {
        return this.temperatura < tempActual;
    }

}
