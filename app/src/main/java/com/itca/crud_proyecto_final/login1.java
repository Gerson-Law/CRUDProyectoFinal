package com.itca.crud_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class login1 extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    EditText usuario, contra;
    Button iniciosesion;
    FirebaseAuth FAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        btn1 = findViewById(R.id.iniciosesion);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });
    }
     public void regsitro(View view){
         Intent home = new Intent(getApplicationContext(), Registrar.class);
         startActivity(home);
     }

    }
