package com.example.irecomend.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.Cliente;
import com.twitter.sdk.android.core.models.TwitterCollection;

public class ClienteDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;
    private String tabela;
    private String query;

    public ClienteDAO(Context context){
        this.conexao = new Conexao(context);
        this.banco = this.conexao.getWritableDatabase();
        this.tabela = "CLIENTE";
    }

    public long inserirCliente(Cliente cliente){
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNome());
        values.put("sobrenome", cliente.getSobrenome());
        values.put("email", cliente.getEmail());
        values.put("senha", cliente.getSenha());
        return banco.insert(this.tabela, null, values);
    }
//
//    public boolean atualizarCliente(Cliente cliente){
//
//    }
//
//    public boolean deletarCliente(Cliente cliente){
//
//    }
//
//    public ArrayList<Cliente> selecionaTodosClientes(){
//
//    }
//
//    public Cliente selecionaClienteById(int id){
//
//    }
//    public void criaTabela(){
//
//    }
}
