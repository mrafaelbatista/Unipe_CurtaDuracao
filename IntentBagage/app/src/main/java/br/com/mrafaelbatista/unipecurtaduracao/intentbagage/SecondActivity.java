package br.com.mrafaelbatista.unipecurtaduracao.intentbagage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends DebugActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Recupera a informação da Intent
        Intent it = getIntent();
        String nome = it.getStringExtra("texto");

        //Define o valor do textview com base no valor recebido
        tv = (TextView) findViewById(R.id.tV_recebe);
        tv.setText(nome);

        //Adicionar botão voltar na action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            //destruímos a activity com o método finish()
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
