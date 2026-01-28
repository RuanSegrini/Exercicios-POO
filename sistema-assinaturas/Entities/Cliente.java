package Entities;

import java.time.LocalDate;

public class Cliente {

    private Long id;
    private String nome;
    private LocalDate dataCadastro;

    public Cliente(Long id, String nome, LocalDate dataCadastro){

        this.id = id;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
