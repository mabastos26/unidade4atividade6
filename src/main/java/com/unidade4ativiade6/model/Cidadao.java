package com.unidade4ativiade6.model;

public class Cidadao {
    private String cpf;
    private String nome;
    private String endereco;
    private String sexo;

    public Cidadao(String cpf, String nome, String endereco, String sexo){
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
        this.sexo=sexo;
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
