package br.com.mrafaelbatista.unipecurtaduracao.intentimplicita;

import android.app.SearchManager;
import android.content.Intent;
import android.location.SettingInjectorService;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Uri uri = null;
    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirURL(View v) {
        uri = Uri.parse("https://developer.android.com");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        dispararIntent(intent);

    }

    public void chamadaTel(View v) {
        uri = Uri.parse("tel:83999999999");
        intent = new Intent(Intent.ACTION_DIAL, uri);
        dispararIntent(intent);

    }

    public void localizacaoMapa(View v) {
        uri = Uri.parse("geo:0,0?q=Tapiocabana, João+Pessoa");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        dispararIntent(intent);

    }

    public void enviaSMS(View v) {
        uri = Uri.parse("sms:123456");
        intent = new Intent(Intent.ACTION_VIEW, uri).putExtra("sms_body", "Corpo do SMS");
        dispararIntent(intent);

    }

    public void compartilha(View v) {
        intent = new Intent(Intent.ACTION_SEND)
                .putExtra(Intent.EXTRA_TEXT, "Compartilhando via Intent")
                .setType("text/plain");
        dispararIntent(intent);

    }

    public void naofunfa(View v) {
        uri = Uri.parse("vnd.xyz:Y2VF8tmLFHw");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        dispararIntent(intent);
    }

    public void configuracoes(View v) {
        intent = new Intent(Settings.ACTION_SETTINGS);
        dispararIntent(intent);

    }


    private void dispararIntent(Intent intent) {
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "Houver algum problema!", Toast.LENGTH_SHORT).show();
        }
    }
}
