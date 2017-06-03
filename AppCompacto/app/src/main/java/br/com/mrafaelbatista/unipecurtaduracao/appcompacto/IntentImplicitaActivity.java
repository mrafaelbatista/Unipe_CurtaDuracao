package br.com.mrafaelbatista.unipecurtaduracao.appcompacto;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class IntentImplicitaActivity extends DebugActivity {

    private Uri uri = null;
    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_implicita);
    }

    public void abrirURL(View v) {
        uri = Uri.parse("https://developer.android.com");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        dispararIntent(intent);
    }

    public void chamadaTel(View v) {
        uri = Uri.parse("tel:839999999999");
        intent = new Intent(Intent.ACTION_DIAL, uri);
        dispararIntent(intent);
    }

    public void localizacaoMapa(View v) {
        uri = Uri.parse("geo:0,0?q=Tapiocabana, João+Pessoa");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        dispararIntent(intent);
    }

    public void enviaSMS(View v) {
        uri = Uri.parse("sms:123456789");
        intent = new Intent(Intent.ACTION_VIEW, uri)
                .putExtra("sms_body", "Texto que vai para o corpo do SMS");
        dispararIntent(intent);
    }

    public void compartilha(View v) {
        intent = new Intent(Intent.ACTION_SEND)
                .putExtra(Intent.EXTRA_TEXT, "Compartilhando via intent")
                .setType("text/plain");
        dispararIntent(intent);
    }

    public void naofunfa(View v) {
        uri = Uri.parse("vnd.xyz:fdskjfhsdkfhdskj");
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
            Toast.makeText(this, "Houve algum problema!", Toast.LENGTH_SHORT).show();
        }
    }
}
