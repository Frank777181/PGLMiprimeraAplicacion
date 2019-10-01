package com.example.primeraaplicaccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombreRecibido;
    EditText textoDeVuelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreRecibido = findViewById(R.id.nombreUsuario);
    }

    public void buttonEnviar(View view) {

        String name = nombreRecibido.getText().toString();

        if(name.isEmpty())
            Toast.makeText(this, "Debe de ingresar texto", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Hola " + name, Toast.LENGTH_SHORT).show();

    }
}
