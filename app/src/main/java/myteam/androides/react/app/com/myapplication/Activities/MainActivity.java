package myteam.androides.react.app.com.myapplication.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import myteam.androides.react.app.com.myapplication.EnviarMensaje;
import myteam.androides.react.app.com.myapplication.Fragments.Derecha;
import myteam.androides.react.app.com.myapplication.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha)getFragmentManager().findFragmentById(R.id.derecha);
        derecha.obtenerDatos(mensaje);
    }
}