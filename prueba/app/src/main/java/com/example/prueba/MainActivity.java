package com.example.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campoNombre;  //mapeo de componentes a referenciar
    TextView etiNombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNombre=findViewById(R.id.txtNombre);
        etiNombre=findViewById(R.id.etiNombre);

    }

    public void onclic(View view) {
        switch (view.getId()) {
            case R.id.btnIngresar:
                String nombre= campoNombre.getText().toString(); //defino variable = al camponombre
                etiNombre.setText("Bienvenido:"+nombre);
                break;
        }
    }
}
