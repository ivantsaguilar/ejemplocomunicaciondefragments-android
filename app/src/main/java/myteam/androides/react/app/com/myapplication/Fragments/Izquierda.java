package myteam.androides.react.app.com.myapplication.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.Inflater;

import myteam.androides.react.app.com.myapplication.EnviarMensaje;
import myteam.androides.react.app.com.myapplication.R;

/**
 * Created by ivants on 8/12/16.
 */

public class Izquierda extends Fragment {
    View rootView;
    EditText editText;
    Button button;
    EnviarMensaje enviarMensaje;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.izquierda,container,false);

        editText = (EditText)rootView.findViewById(R.id.campoTxt);
        button = (Button)rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = editText.getText().toString();
                editText.setText("");
                enviarMensaje.enviarDatos(mensaje);
            }
        });
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //Debemos contemplar que algo le puede pasar al fragment
        try {
            enviarMensaje = (EnviarMensaje)context;
        }catch (ClassCastException e){
            throw new ClassCastException("Necesitas implementar");
        }
    }
}
