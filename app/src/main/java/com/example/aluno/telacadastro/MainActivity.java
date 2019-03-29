package com.example.aluno.telacadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private  EditText nome;
    private  EditText sobrenome;
    private  EditText email;
    private  EditText nomeUsuario;
    private  EditText senha;
    private  EditText confirmarSenha;
    private  Button confirmar;
    private  Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nome);
        sobrenome = (EditText) findViewById(R.id.sobrenome);
        email = (EditText) findViewById(R.id.email);
        nomeUsuario = (EditText) findViewById(R.id.nomeUsuario);
        senha = (EditText) findViewById(R.id.senha);
        confirmarSenha = (EditText) findViewById(R.id.confirmarSenha);
        confirmar = (Button) findViewById(R.id.btnConfirmar);
        limpar = (Button) findViewById(R.id.btnLimpar);


        confirmar.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String pass = senha.getText().toString();
                String passConfirm = confirmarSenha.getText().toString();

                if(pass.equals(passConfirm)) {
                    Toast.makeText(MainActivity.this, "As senhas coincidem. Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(MainActivity.this,"As senhas não coincidem. Tente novamente!",Toast.LENGTH_LONG).show();
                }


            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick (View v) {

                nome.setText("");
                sobrenome.setText("");
                email.setText("");
                nomeUsuario.setText("");
                senha.setText("");
                confirmarSenha.setText("");
            }
        });
    }
}
