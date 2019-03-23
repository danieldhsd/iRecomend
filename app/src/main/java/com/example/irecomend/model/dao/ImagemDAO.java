package com.example.irecomend.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.Imagem;

public class ImagemDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;
    private String tabela;
    private String query;

    public ImagemDAO(Context context){
        this.conexao = new Conexao(context);
        this.banco = this.conexao.getWritableDatabase();
        this.tabela = "IMAGEM";
    }
    public long inserirImagem(Imagem imagem){
        ContentValues values = new ContentValues();
        values.put("nome", imagem.getNome());
        values.put("caminho", imagem.getCaminho());
        values.put("idEvento", imagem.getEvento().getIdEvento());

        return banco.insert(this.tabela, null, values);
    }
//
//    public boolean atualizarImagem(Imagem imagem){
//
//    }
//
//    public boolean deletarImagem(Imagem imagem){
//
//    }
//
//    public ArrayList<Imagem> selecionaTodasImagens(){
//
//    }
//
//    public Imagem selecionaImagemById(int id){
//
//    }
//    public void criaTabela(){
//
//    }
}
