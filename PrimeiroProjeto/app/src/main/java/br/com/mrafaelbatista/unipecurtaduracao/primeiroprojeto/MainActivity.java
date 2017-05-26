package br.com.mrafaelbatista.unipecurtaduracao.primeiroprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.et_texto);
        textView = (TextView) findViewById(R.id.tv_hello);
    }

    public void mostrarTexto(View view) {
        String texto = editText.getText().toString();
        textView.setText(texto);
        textView.setAllCaps(true);
    }
}
