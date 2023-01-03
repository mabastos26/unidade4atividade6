package com.unidade4ativiade6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cidadao")
public class Cidadao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String cpf;
    private String nome;
    private String endereco;
    private String sexo;

    protected Cidadao(){}

    public Cidadao(String cpf, String nome, String endereco, String sexo){
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
        this.sexo=sexo;
    }

    public Long getId(){
        return this.id;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getSexo(){
        return this.sexo;
    }
    
}
