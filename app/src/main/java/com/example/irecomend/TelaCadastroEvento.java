package com.example.irecomend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.irecomend.connection.Conexao;

public class TelaCadastroEvento extends AppCompatActivity {

    EditText nomeEvento;
    EditText data;
    EditText horario;
    EditText cep;
    EditText rua;
    EditText numero;
    EditText bairro;
    EditText cidade;
    EditText pais;

    Conexao db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_evento);

        db = new Conexao( this);

        nomeEvento = (EditText)findViewById(R.id.nomeEvento);
        data = (EditText)findViewById(R.id.DataEvento);
        horario = (EditText)findViewById(R.id.Horario);
        cep = (EditText)findViewById(R.id.CEP);
        rua = (EditText)findViewById(R.id.CEP);
        numero = (EditText)findViewById(R.id.Numero);
        bairro = (EditText)findViewById(R.id.Bairro);
        cidade = (EditText)findViewById(R.id.Cidade);
        pais = (EditText)findViewById(R.id.Pais);
    }
}
