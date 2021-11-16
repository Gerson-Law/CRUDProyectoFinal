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


public class Registrar extends AppCompatActivity {

    EditText nombreco,coreeo,contra1;
    Button crear;
    FirebaseAuth FAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);


        nombreco = findViewById(R.id.nombreco);
        coreeo = findViewById(R.id.coreeo);
        contra1 = findViewById(R.id.contra1);
        crear = findViewById(R.id.crear);
        nombreco = findViewById(R.id.nombreco);

        FAuth = FirebaseAuth.getInstance();


        if(FAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext() ,Registrar.class));
            finish();
        }

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emael = coreeo.getText().toString().trim();
                String contra = contra1.getText().toString().trim();

                // Especificaciones para crear usuarios
                if(TextUtils.isEmpty(emael)){
                    coreeo.setError("Correo requerido");
                    return;
                }

                if(TextUtils.isEmpty(contra)) {
                    contra1.setError("Contraseña requerida");
                    return;
                }
                    if(contra.length() < 6) {
                        contra1.setError("La Contraseña es muy corta");
                    return;

                }

                    //Registrar Usuario en Firebase

                FAuth.createUserWithEmailAndPassword(emael,contra).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Registrar.this, "Usuario Creado", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext() ,login1.class));

                        }else{
                            Toast.makeText(Registrar.this, "Error al crear usuario " + task.getException(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });


    }
}