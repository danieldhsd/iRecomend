package com.example.irecomend.model.bean;

import java.util.Date;

public class Evento {
    private int id;
    private String nome;
    private Date dataHora;
    private float preco;
    private String rua;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String caminhoImagem;

    public Evento(String nome, Date dataHora, float preco, String rua, String cep, String numero, String bairro, String cidade, String estado, String caminhoImagem) {
        this.setNome(nome);
        this.setDataHora(dataHora);
        this.setPreco(preco);
        this.setRua(rua);
        this.setCep(cep);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setCaminhoImagem(caminhoImagem);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
}
