package Entities;

import Enum.TipoPlano;

public class Plano {

    private Long id;
    private TipoPlano tipo;
    private Double valor;

    public Plano(Long id, TipoPlano tipo, Double valor){

        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPlano getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlano tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
