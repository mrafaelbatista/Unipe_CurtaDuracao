package br.com.mrafaelbatista.unipecurtaduracao.fragmentado;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HelloFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        //Cria a view do Fragment
        View view = inflater.inflate(R.layout.fragment_hello, v , false);

        //Podemos gerar uma lógica aqui

        return view;

    }

}
