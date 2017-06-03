package br.com.mrafaelbatista.unipecurtaduracao.temperaturaagora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {



    private String preurl = "http://api.openweathermap.org/data/2.5/weather?q=";
    private String posurl = "&APPID=2f2f555888d23e5a36c5aad583ebfae9";


    private EditText editText = null;
    private TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.et_cidade);
        textView = (TextView) findViewById(R.id.tv_temp);

    }

    public void requisitar(View v) throws IOException {
        run();
    }

    public void run() throws IOException {

        String url = preurl + editText.getText().toString() + posurl;

        //Instancia um novo client OkHttp
        OkHttpClient client = new OkHttpClient();

        //Preparando a url para a requisição
        Request request = new Request.Builder()
                .url(url)
                .build();

        //realizando a requisição
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String myResponse = response.body().string();
                Log.i("CursoAndroid", myResponse);
            }
        });

    }

}
