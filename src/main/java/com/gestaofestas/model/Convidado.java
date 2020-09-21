package com.gestaofestas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @GeneratedValue
    @Id
    private Long id;
    @Column
    private String nome;
    @Column
    private Integer quantidadeAcompanhante;

    public Convidado(Long id, String nome, Integer quantidadeAcompanhante) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAcompanhante = quantidadeAcompanhante;
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

    public Integer getquantidadeAcompanhante() {
        return this.quantidadeAcompanhante;
    }

    public void setquantidadeAcompanhante(Integer quantidadeAcompanhante) {
        this.quantidadeAcompanhante = quantidadeAcompanhante;
    }

    public Convidado id(Long id) {
        this.id = id;
        return this;
    }

    public Convidado nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Convidado quantidadeAcompanhante(Integer quantidadeAcompanhante) {
        this.quantidadeAcompanhante = quantidadeAcompanhante;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nome='" + getNome() + "'" + ", quantidadeAcompanhante='"
                + getquantidadeAcompanhante() + "'" + "}";
    }

}
