package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lista_cate extends AppCompatActivity {

    EditText id0, name0,es0;
    Button limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cate);

        id0 = (EditText) findViewById(R.id.id0);
        name0 = (EditText) findViewById(R.id.nom_produc);
        es0 = (EditText) findViewById(R.id.can_produc);
        limpiar = (Button) findViewById(R.id.limpiar);

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id0.setText("");
               name0.setText("");
                es0.setText("");

                limpiar.setText("", null);
                Toast.makeText(Lista_cate.this, "Se Listo", Toast.LENGTH_SHORT).show();

            }
        });


    }
}