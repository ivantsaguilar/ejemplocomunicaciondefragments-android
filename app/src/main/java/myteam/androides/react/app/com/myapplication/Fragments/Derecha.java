package myteam.androides.react.app.com.myapplication.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import myteam.androides.react.app.com.myapplication.R;

/**
 * Created by ivants on 8/12/16.
 */

public class Derecha extends Fragment {
    View rootView;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.derecha,container,false);

        textView = (TextView)rootView.findViewById(R.id.txt);
        return rootView;
    }

    public void obtenerDatos(String mensaje){
        textView.setText(mensaje);
    }
}
