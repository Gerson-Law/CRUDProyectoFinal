package com.itca.crud_proyecto_final.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.VolleyError;
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



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.productos, container, false);

            ti_id = view.findViewById(R.id.ti_id);
            ti_productos = view.findViewById(R.id.ti_productos);
            ti_descripcion = view.findViewById(R.id.ti_descripcion);
            ti_precio = view.findViewById(R.id.ti_precio);
            ti_cantidad = view.findViewById(R.id.ti_cantidad);

            et_id = view.findViewById(R.id.et_id);
            et_productos = view.findViewById(R.id.et_productos);
            et_descripcion = view.findViewById(R.id.et_descripcion);
            et_cantidad = view.findViewById(R.id.et_cantidad);
            et_precio = view.findViewById(R.id.et_precio);
            btnSave = view.findViewById(R.id.btnSave);
            btnLimpiar = view.findViewById(R.id.btnLimpiar);
            btnActualizar = view.findViewById(R.id.btnActualizar);
            
        }

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = et_id.getText().toString();
                String nombre = et_productos.getText().toString();
                String descripcion = et_descripcion.getText().toString();
                String cantidad = et_cantidad.getText().toString();
                String precio = et_precio.getText().toString();

                if(id.length() == 0){
                    et_id.setError("Campo obligatorio.");
                }else if(nombre.length() == 0){
                    et_productos.setError("Campo obligatorio.");
                }else if(descripcion.length() == 0){
                    et_descripcion.setError("Campo obligatorio.");
                }else if(cantidad.length() == 0){
                    et_cantidad.setError("Campo obligatorio.");
                }else if(precio.length() == 0){
                    et_precio.setError("Campo obligatorio.");
                    btnSave(getContext(), id, nombre, descripcion, cantidad, precio);

                }
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSave();
            }
        });

        return view;
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(context, "Error. Compruebe su acceso a Internet.", Toast.LENGTH_SHORT).show();
    }
});

        {
protected Map<String, string> getParams() throws AuthFailureError {

        Map<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json; charset=utf-8");
        map.put("Accept", "application/json");
        map.put("id_prod", id_prod);
        map.put("nom_prod", nom_prod);
        map.put("des_prod", des_prod);
        map.put("cantidad", cantidad);
        map.put("precio", precio);
        return map;
        }
        }; {

        MySingleton.getInstance(context).addToRequestQueue(stringRequest);


private void new_product() {
        et_id.setText(null);
        et_nombre_prod.setText(null);
        et_descripcion.setText(null);
        et_stock.setText(null);
        et_precio.setText(null);
        }




