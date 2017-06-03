package br.com.mrafaelbatista.unipecurtaduracao.fragmentado;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Suportanto Fragmentos
        FragmentManager fm = getSupportFragmentManager();
        HelloFragment frag = (HelloFragment) fm.findFragmentById(R.id.frag);
    }
}
