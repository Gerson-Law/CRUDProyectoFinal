package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete_producto extends AppCompatActivity {

    EditText codigo1, nombre1, descripcion1,cantidad1,precio1;
    Button eliminar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_producto);

        codigo1 = findViewById(R.id.codigo1);
        nombre1 = findViewById(R.id.nombre1);
        descripcion1 = findViewById(R.id.descripcion1);
        cantidad1 = findViewById(R.id.cantidad1);
        precio1 = findViewById(R.id.precio1);
        eliminar1 = findViewById(R.id.eliminar);

        eliminar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                codigo1.setText("", null);

                nombre1.setText("", null);

                descripcion1.setText("", null);

                cantidad1.setText("", null);

                precio1.setText("", null);

                Toast.makeText(Delete_producto.this, "Eliminado con exito", Toast.LENGTH_SHORT).show();
            }
        });


    }
}