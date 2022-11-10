package com.example.sharedpreferencejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnSalvar;
    private EditText txtNome;
    private TextView labelResultado;
    private static String ARQUIVO_PREFERENCIA = "arquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        btnSalvar = findViewById(R.id.btnSalvar);
        labelResultado = findViewById(R.id.labelResultado);

        //Ativar o código ao clicar no botão Salvar
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cria ou chama o arquivo texto gravado no celular
                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);

                //Faz a ligação entre o aplicativo e o arquivo, habilita a edição no arquivo
                SharedPreferences.Editor editor = preferences.edit();

                //Validar o nome
                if (txtNome.getText().toString().equals("")){
                    //Toast vai criar na tela uma label temporaria mostrando o conteudo do text abaixo se o edi
                    Toast.makeText(getApplicationContext(), "Preencha seu nome", Toast.LENGTH_LONG).show();
                }else{
                    //nome recebe o valor digitado no txtNome
                    String nome = txtNome.getText().toString();
                    //Salva no arquivo no arquivo na chave nome a variavel nome
                    editor.putString("nome", nome);
                    editor.commit();
                    //Exibe na labelResultado o valor da variavel nome
                    labelResultado.setText("Olá, "+nome);
                }

            }
        });

        //Recuperar dados salvos
        //Cria ou chama o arquivo texto gravado no celular
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        //Validar se o arquivo está vazio
        if(preferences.contains("nome")){
            String nome = preferences.getString("nome", "\"usuário não definido\"");
            labelResultado.setText("Olá, " + nome);
        }else{
            labelResultado.setText("Olá, usuário não definido");
        }

    }
}