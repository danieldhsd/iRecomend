package com.example.irecomend.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.AcaoHistorico;

public class AcaoHistoricoDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;
    private String tabela;
    private String query;

    public void AcaoHistoricoDAO(Context context){
        this.conexao = new Conexao(context);
        this.banco = this.conexao.getWritableDatabase();
        this.tabela = "ACAOHISTORICO";
    }

    public long inseriraAcaoHistorico(AcaoHistorico acaoHistorico){
        ContentValues values = new ContentValues();
        values.put("descricao", acaoHistorico.getDescricao());
        return banco.insert(this.tabela, null, values);

    }
//
//    public boolean atualizarAcaoHistorico(AcaoHistorico acaoHistorico){
//
//    }
//
//    public boolean deletarAcaoHistorico(AcaoHistorico acaoHistorico){
//
//    }
//
//    public ArrayList<AcaoHistorico> selecionaTodosAcaoHistoricos(){
//
//    }
//
//    public AcaoHistorico selecionaAcaoHistoricoById(int id){
//
//    }
//    public void criaTabela(){
//
//    }
}
