package com.example.irecomend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.irecomend.R;
import com.example.irecomend.connection.Conexao;

public class TelaLogin extends AppCompatActivity {

    EditText mTextUsuario;
    EditText mTextSenha;
    Button mButtonLogin;
    TextView mTextViewRegistrar;
    Conexao db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        db = new Conexao(this);
        mTextUsuario = (EditText)findViewById(R.id.edittext_usuario);
        mTextSenha = (EditText)findViewById(R.id.edittext_senha);
        mButtonLogin = (Button) findViewById(R.id.button_login);
        mTextViewRegistrar = (TextView) findViewById(R.id.textview_registrar);
        mTextViewRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent (TelaLogin.this , TelaCadastroCliente.class);
                startActivity(registerIntent);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mTextUsuario.getText().toString().trim();
                String senha = mTextSenha.getText().toString().trim();
                boolean res = db.checaUsuario(email, senha);
                if(res==true)
                    Toast.makeText(TelaLogin.this, "Sucesso!", Toast.LENGTH_SHORT).show();
                else Toast.makeText(TelaLogin.this, "Erro!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
