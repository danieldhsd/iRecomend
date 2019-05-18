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
import com.example.irecomend.model.bean.Cliente;
import com.example.irecomend.model.dao.ClienteDAO;

public class TelaLogin extends AppCompatActivity {

    private EditText mTextUsuario;
    private EditText mTextSenha;
    private Button mButtonLogin;
    private TextView mTextViewRegistrar;
    private Conexao db;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        db = new Conexao(this);
        
        
        this.mTextUsuario = (EditText)findViewById(R.id.edittext_usuario);
        this.mTextSenha = (EditText)findViewById(R.id.edittext_senha);
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
                
                String emailDeLogin = mTextUsuario.getText().toString().trim();
                String senhaDeLogin = mTextSenha.getText().toString().trim();

                Cliente login = new Cliente();

                login.setSenha(senhaDeLogin);
                login.setEmail(emailDeLogin);

                if(chamaBanco(login)){
                    Toast.makeText(TelaLogin.this,"Login feito com sucesso!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(TelaLogin.this, MapsActivity.class));
                }
                else{
                    Toast.makeText(TelaLogin.this,"Erro ao fazer login!", Toast.LENGTH_SHORT).show();
                    mTextUsuario.setText("");
                    mTextSenha.setText("");
                    mTextUsuario.requestFocus();
                }

            }
        });
    }

    private boolean chamaBanco(Cliente cliente)
    {
        ClienteDAO cDao = new ClienteDAO(this);

        Cliente banco = new Cliente();
        banco = cDao.selecionaClienteByEmail(cliente.getEmail());

        if(banco == null)
            return false;
        if(banco.getSenha().equals(cliente.getSenha()))
            return true;
        else
            return false;
    }

}
