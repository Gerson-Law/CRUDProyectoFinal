package com.itca.crud_proyecto_final.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.itca.crud_proyecto_final.R;

public class Productos extends AppCompatActivity {


    EditText et_id,  et_productos, ti_descripcion, ti_precio, ti_cantidad, ti_id, ti_productos, et_descripcion, et_precio, et_cantidad ;
    Button btnSave, btnLimpiar, btnActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productos);


        et_id = et_id.findViewById(R.id.et_id);
        ti_id = ti_id.findViewById(R.id.ti_id);
        et_productos = et_productos.findViewById(R.id.et_productos);
        ti_productos = ti_productos.findViewById(R.id.ti_productos);
        et_descripcion = et_descripcion.findViewById(R.id.et_descripcion);
        ti_descripcion = ti_descripcion.findViewById(R.id.ti_descripcion);
        et_precio = et_precio.findViewById(R.id.et_precio);
        ti_precio = ti_precio.findViewById(R.id.ti_precio);
        et_cantidad = et_cantidad.findViewById(R.id.et_cantidad);
        ti_cantidad = ti_cantidad.findViewById(R.id.ti_cantidad);
        btnSave = btnSave.findViewById(R.id.btnSave);
        btnLimpiar = btnLimpiar.findViewById(R.id.btnLimpiar);
        btnActualizar = btnActualizar.findViewById(R.id.btnActualizar);


    }
}