package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;


public class Registrar extends AppCompatActivity {

    EditText nombreco,coreeo,contra1,telefono;
    Button crear;
    FirebaseAuth FAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);


        nombreco = findViewById(R.id.nombreco);
        coreeo = findViewById(R.id.coreeo);
        contra1 = findViewById(R.id.contra1);
        telefono = findViewById(R.id.telefono);
        crear = findViewById(R.id.crear);
        nombreco = findViewById(R.id.nombreco);

        FAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);
    }
}