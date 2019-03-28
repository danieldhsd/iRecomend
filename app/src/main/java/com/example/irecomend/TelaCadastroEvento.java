package com.example.irecomend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.irecomend.connection.Conexao;
import com.example.irecomend.model.bean.Evento;
import com.example.irecomend.model.dao.EventoDAO;

public class TelaCadastroEvento extends AppCompatActivity {

    private Evento evento;
    private EventoDAO eventoDAO;

    EditText nomeEvento;
    EditText data;
    EditText preco;
    EditText cep;
    EditText rua;
    EditText numero;
    EditText bairro;
    EditText cidade;
    EditText estado;
    EditText pais;
    Button btnConfirmar;

    double precoFinal;
    int numRua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_evento);


        nomeEvento = (EditText)findViewById(R.id.nomeEvento);
        data = (EditText)findViewById(R.id.DataHoraEvento);
        preco = (EditText)findViewById(R.id.Preco);
        precoFinal = Double.parseDouble(preco.getText().toString());
        cep = (EditText)findViewById(R.id.CEP);
        rua = (EditText)findViewById(R.id.Rua);
        numero = (EditText)findViewById(R.id.Numero);
        numRua = Integer.parseInt(numero.getText().toString());
        bairro = (EditText)findViewById(R.id.Bairro);
        cidade = (EditText)findViewById(R.id.Cidade);
        estado = (EditText)findViewById(R.id.Estado);
        pais = (EditText)findViewById(R.id.Pais);
        btnConfirmar = (Button)findViewById(R.id.Confirmar);

        eventoDAO = new EventoDAO(this);
        evento = new Evento(this.nomeEvento.getText().toString(), this.data.getText().toString(), this.precoFinal, this.rua.getText().toString(), cep.getText().toString(), this.numRua, this.bairro.getText().toString(), this.cidade.getText().toString(), this.estado.getText().toString(), this.pais.getText().toString());
        eventoDAO.inserirEvento(evento);
    }
}