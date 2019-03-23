package com.example.irecomend.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.Historico;

public class HistoricoDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;
    private String tabela;
    private String query;

    public HistoricoDAO(Context context){
        this.conexao = new Conexao(context);
        this.banco = this.conexao.getWritableDatabase();
        this.tabela = "HISTORICO";
    }
    public long inserirHistorico(Historico historico){
        ContentValues values = new ContentValues();
        values.put("idCliente", historico.getCliente().getIdCliente());
        values.put("idAcaoHistorico", historico.getAcaoHistorico().getIdAcaoHistorico());
        values.put("idEvento", historico.getEvento().getIdEvento());

        return banco.insert(this.tabela, null, values);
    }
//
//    public boolean atualizarHistorico(Historico historico){
//
//    }
//
//    public boolean deletarHistorico(Historico historico){
//
//    }
//
//    public ArrayList<Historico> selecionaTodosHistoricos(){
//
//    }
//
//    public Historico selecionaHistoricoById(int id){
//
//    }
//    public void criaTabela(){
//
//    }

}
