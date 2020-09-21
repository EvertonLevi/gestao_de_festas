package com.gestaofestas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @GeneratedValue
    @Id
    private Long id;
    private String nome;
    private Integer quantidadeDeAcompanhante;

    public Convidado(Long id, String nome, Integer quantidadeDeAcompanhante) {
        this.id = id;
        this.nome = nome;
        this.quantidadeDeAcompanhante = quantidadeDeAcompanhante;
    }

    public Convidado() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDeAcompanhante() {
        return this.quantidadeDeAcompanhante;
    }

    public void setQuantidadeDeAcompanhante(Integer quantidadeDeAcompanhante) {
        this.quantidadeDeAcompanhante = quantidadeDeAcompanhante;
    }

    public Convidado id(Long id) {
        this.id = id;
        return this;
    }

    public Convidado nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Convidado quantidadeDeAcompanhante(Integer quantidadeDeAcompanhante) {
        this.quantidadeDeAcompanhante = quantidadeDeAcompanhante;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nome='" + getNome() + "'" + ", quantidadeDeAcompanhante='"
                + getQuantidadeDeAcompanhante() + "'" + "}";
    }

}
