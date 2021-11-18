package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Agregar_cate extends AppCompatActivity {

    EditText id1, productos1, descripcion1;
    Button guardar, limpiar, actualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_cate);



         id1 = findViewById(R.id.id1);
        productos1 = findViewById(R.id.productos1);
        descripcion1 = findViewById(R.id.descripcion1);
        guardar = findViewById(R.id.guardar);
        limpiar = findViewById(R.id.limpiar);
        actualizar = findViewById(R.id.actualizar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Agregar_cate.this, "Guardado", Toast.LENGTH_SHORT).show();
            }
        });
// Link del fichero php "https://regitrodeusuarios.000webhostapp.com/Conexion/guardar_categorias.php"

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                id1.setText("", null);

                productos1.setText("", null);

                descripcion1.setText("", null);

                Toast.makeText(Agregar_cate.this, "Se Limpio con exito", Toast.LENGTH_SHORT).show();
            }
        });


        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                id1.setText("", null);

                productos1.setText("", null);

                descripcion1.setText("", null);

                Toast.makeText(Agregar_cate.this, "Actualizado Correcto", Toast.LENGTH_SHORT).show();
            }
        });


    }
}