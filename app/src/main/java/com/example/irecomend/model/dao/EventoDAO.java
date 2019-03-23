package com.example.irecomend.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.Evento;

import java.util.ArrayList;

public class EventoDAO {
    private String tabela;
    private Conexao conexao;
    private SQLiteDatabase banco;
    private String query;

    public EventoDAO(Context context){
        this.conexao = new Conexao(context);
        this.banco = conexao.getWritableDatabase();
        this.tabela = "EVENTO";
    }

    public long inserirEvento(Evento evento){
        ContentValues values = new ContentValues();
        values.put("nome", evento.getNome());
        values.put("data", evento.getDataHora());
        values.put("preco", evento.getPreco());
        values.put("endereco", evento.getEndereco());
        values.put("numero", evento.getNumero());
        values.put("bairro", evento.getBairro());
        values.put("cep", evento.getCep());
        values.put("cidade", evento.getCidade());
        values.put("estado", evento.getEstado());
        values.put("pais", evento.getPais());
        values.put("like", evento.getLikes());
        values.put("deslike", evento.getDeslikes());
        values.put("latitude", evento.getLatitude());
        values.put("longitude", evento.getLongitude());

        return banco.insert(this.tabela, null, values);
    }
//
//    public boolean atualizarEvento(Evento evento){
//
//    }
//
//    public boolean deletarEvento(Evento evento){
//
//    }
//
//    public ArrayList<Evento> selecionaTodosEventos(){
//
//    }
//
//    public Evento selecionaEventoById( int id){
//
//    }
//    public void criaTabela(){
//
//    }
}
