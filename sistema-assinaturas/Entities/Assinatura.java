package Entities;

import java.time.LocalDate;
import java.util.Set;

public class Assinatura<T> {

    private Long id;
    private Cliente cliente;
    private Plano plano;
    private Set<T> servicos;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Assinatura(Long id, Cliente cliente, Plano plano, Set<T> servicos, LocalDate dataInicio, LocalDate dataFim){
        this.id = id;
        this.cliente = cliente;
        this.plano = plano;
        this.servicos = servicos;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Set<T> getServicos() {
        return servicos;
    }

    public void setServicos(Set<T> servicos) {
        this.servicos = servicos;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
