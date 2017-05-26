package br.com.mrafaelbatista.unipecurtaduracao.intentbagage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends DebugActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.eT_texto);

    }

    public void enviarDados(View v){

        String str = et.getText().toString();

        Intent it = new Intent(this, SecondActivity.class);
        it.putExtra("texto", str);
        startActivity(it);

    }
}
