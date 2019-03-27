package com.example.irecomend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_evento);


    }
}
