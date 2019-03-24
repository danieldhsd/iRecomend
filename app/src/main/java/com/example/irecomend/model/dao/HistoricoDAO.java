package com.example.irecomend.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.Historico;

import java.util.ArrayList;
import java.util.HashSet;

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
//        ArrayList<Historico> historicos = new ArrayList<>();
//        String[] args = {"idHistorico", "idCliente", "idAcaoHistorico", "idEvento"};
//        Cursor cursor = this.banco.query(this.tabela, args, null, null, null, null, null, null);
//
//        while(cursor.moveToNext()){
//            Historico h = new Historico(cursor.getInt(1), cursor.getInt(2), cursor.getInt(3));
//
//        }
//    }
//
//    public Historico selecionaHistoricoById(int id){
//
//    }
//    public void criaTabela(){
//
//    }

}
