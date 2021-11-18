package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class Producto extends AppCompatActivity {

    EditText cod_produc, nom_produc, des_produc, can_produc, precio_produc, cat_produc, esta_produc, un_produc;
    Button btnguardar, btnLimpiar, btnActualizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        cod_produc = (EditText) findViewById(R.id.cod_produc);
        nom_produc = (EditText) findViewById(R.id.nom_produc);
        can_produc = (EditText) findViewById(R.id.can_produc);
        precio_produc = (EditText) findViewById(R.id.precio_produc);
        des_produc = (EditText) findViewById(R.id.des_produc);
        btnguardar = (Button) findViewById(R.id.btnguardar);
        cat_produc = (EditText) findViewById(R.id.cat_produc);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnActualizar = (Button) findViewById(R.id.btnActualizar);
        //esta_produc =(EditText)findViewById(R.id.esta_produc);
       // un_produc = (EditText) findViewById(R.id.un_produc);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cod_produc.setText("");
                nom_produc.setText("");
                can_produc.setText("");
                precio_produc.setText("");
                des_produc.setText("");
            }
        });

btnguardar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Insertar();
    }
});
        }

    private void Insertar() {

        String cod = cod_produc.getText().toString().trim();
        String nom = nom_produc.getText().toString().trim();
        String des = des_produc.getText().toString().trim();
        String can = can_produc.getText().toString().trim();
        String pre = precio_produc.getText().toString().trim();
        String cat = cat_produc.getText().toString().trim();
        //String esta =  esta_produc.getText().toString().trim();
        //String un = un_produc.getText().toString().trim();


     ProgressDialog progressDialog=new ProgressDialog(this);
     if(cod.isEmpty()){
         cod_produc.setError("Campo Codigo Vacio");
     } if(nom.isEmpty()){
            nom_produc.setError("Campo Nombre Vacio");
        } if(can.isEmpty()){
            can_produc.setError("Campo Cantidad Vacio");
        } if(pre.isEmpty()){
            precio_produc.setError("Campo Precio Vacio");
        } if(des.isEmpty()){
            des_produc.setError("Campo Descripcion Vacio");
        }if(cat.isEmpty()){
            cat_produc.setError("Campo Categoria Vacio");
        }
     else {
         StringRequest request=new StringRequest(Request.Method.POST, "https://regitrodeusuarios.000webhostapp.com/Conexion/guardar_productos.php", new Response.Listener<String>() {
             @Override
             public void onResponse(String response) {
                 if (response.equalsIgnoreCase("Datos Ingresados")) {
                     Toast.makeText(Producto.this, "Datos Ingresados", Toast.LENGTH_SHORT).show();
                     progressDialog.dismiss();

                 } else {
                     Toast.makeText(Producto.this, response, Toast.LENGTH_SHORT).show();
                     progressDialog.dismiss();
                 }

             }
         }, new Response.ErrorListener() {
             @Override
             public void onErrorResponse(VolleyError error) {
                 Toast.makeText(Producto.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                 progressDialog.dismiss();
             }
         }){
             @Override
             protected Map<String, String> getParams() throws AuthFailureError {
               Map<String, String>params=new HashMap<String, String>();

               params.put("id_producto", cod);
                 params.put("nombre_producto", nom);
                 params.put("descripcion_producto", des);
                 params.put("stock_producto", can);
                 params.put("precio_producto", pre);
                 params.put("categoria_producto", cat);
                 return super.getParams();         //carga los datos referenciados de nuestra base de gatos
             }
         };
            RequestQueue requestQueue= Volley.newRequestQueue(Producto.this);
            requestQueue.add(request);

        }


    }





    }




