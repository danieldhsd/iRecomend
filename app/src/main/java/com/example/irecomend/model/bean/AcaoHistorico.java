package com.example.irecomend.model.bean;

public class AcaoHistorico {
    private int idAcaoHistorico;
    private String descricao;

    public AcaoHistorico(String descricao) {
        this.descricao = descricao;
    }

    public int getIdAcaoHistorico() {
        return idAcaoHistorico;
    }

    public void setIdAcaoHistorico(int idAcaoHistorico) {
        this.idAcaoHistorico = idAcaoHistorico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
