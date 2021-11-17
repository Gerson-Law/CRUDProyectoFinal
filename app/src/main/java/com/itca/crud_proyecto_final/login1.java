package com.itca.crud_proyecto_final;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login1 extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    EditText usuario, contra;
    Button iniciosesion, registro;
    FirebaseAuth FAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);



        usuario = findViewById(R.id.usuario);
        contra = findViewById(R.id.contra);
        iniciosesion = findViewById(R.id.iniciosesion);
        btn1 = findViewById(R.id.iniciosesion);
        registro = findViewById(R.id.registro);
        FAuth = FirebaseAuth.getInstance();

        registro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent home = new Intent(getApplicationContext(),Registrar.class);
                startActivity(home);
            }
        });

        iniciosesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usuario.getText().toString().trim();
                String contraseña = contra.getText().toString().trim();

                if(TextUtils.isEmpty(user)){
                    usuario.setError("Correo Invalido");
                    return;
                }

                if(TextUtils.isEmpty(contraseña)) {
                    contra.setError("Contraseña Requerida");
                    return;
                }
                if(contra.length() < 6) {
                    contra.setError("La Contraseña Incorrecta");
                    return;

                }
               // Toast.makeText(login1.this, "Acceso Concedido", Toast.LENGTH_SHORT).show();
               FAuth.signInWithEmailAndPassword(user,contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(login1.this, "Acceso Concedido", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(login1.this, MainActivity.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(login1.this, "ERROR", Toast.LENGTH_SHORT).show();
                        }
                        }


                });
            }
        });

    }


    }
