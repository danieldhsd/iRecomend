package com.example.irecomend.model.bean;

public class Imagem {
    private String idImagem;
    private String nome;
    private String caminho;
    private Evento evento;


    public Imagem(String nome, String caminho, Evento evento) {
        this.setNome(nome);
        this.setCaminho(caminho);
        this.setEvento(evento);
    }

    public String getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(String idImagem) {
        this.idImagem = idImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
