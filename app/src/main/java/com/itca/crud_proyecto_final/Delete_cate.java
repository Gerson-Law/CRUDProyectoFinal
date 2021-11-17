package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete_cate extends AppCompatActivity {

    EditText codigo, category, descripcion;
    Button eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_cate);


        codigo = findViewById(R.id.codigo);
        category = findViewById(R.id.category);
        descripcion = findViewById(R.id.descripcion);
        eliminar = findViewById(R.id.eliminar);

        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                codigo.setText("", null);

                category.setText("", null);

                descripcion.setText("", null);
                Toast.makeText(Delete_cate.this, "Eliminado con exito", Toast.LENGTH_SHORT).show();
            }
        });


    }
}