package com.example.irecomend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) this.findViewById(R.id.btnLogin);
        Button btnCadastroCliente = (Button) this.findViewById(R.id.btnCadastroCliente);
        Button btnCriacaoEvento = (Button) this.findViewById(R.id.btnCriacaoEvento);
        Button btnCarregamentoEvento = (Button) this.findViewById(R.id.btnCarregamentoEvento);
//
//        btnLogin.setOnClickListener((View) this);
//        btnCadastroCliente.setOnClickListener((View.OnClickListener) this);
//        btnCriacaoEvento.setOnClickListener((View.OnClickListener) this);
//        btnCarregamentoEvento.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view){
        if(view.getId() == R.id.btnCadastroCliente){
            Toast.makeText(this, "Cadastro de cliente", Toast.LENGTH_LONG);
        }
        else if(view.getId() == R.id.btnLogin){
            Toast.makeText(this, "Login", Toast.LENGTH_LONG);
        }
        else if(view.getId() == R.id.btnCriacaoEvento){
            Toast.makeText(this, "Criacao de Evento", Toast.LENGTH_LONG);
        }
        else if(view.getId() == R.id.btnCarregamentoEvento){
            Toast.makeText(this, "Carregamento de evento", Toast.LENGTH_LONG);
        }
    }
}
