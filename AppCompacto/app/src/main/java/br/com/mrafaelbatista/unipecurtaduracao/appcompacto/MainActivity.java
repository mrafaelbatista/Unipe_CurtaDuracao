package br.com.mrafaelbatista.unipecurtaduracao.appcompacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegarActivity(View v) {
        Intent i = new Intent(this, NaveganteActivity.class);
        startActivity(i);
    }

    public void navegarIntentImplicita(View v) {
        Intent i = new Intent(this, IntentImplicitaActivity.class);
        startActivity(i);
    }
}
