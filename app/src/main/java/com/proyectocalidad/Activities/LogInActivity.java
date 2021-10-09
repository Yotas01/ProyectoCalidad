package com.proyectocalidad.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.proyectocalidad.R;

public class LogInActivity extends AppCompatActivity {

    EditText correo;
    EditText psw;
    Button iniciar;
    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inflate();

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), UserMainActivity.class));
            }
        });
    }

    private void inflate() {
        correo = findViewById(R.id.editTextCorreo);
        psw = findViewById(R.id.editTextPsw);
        iniciar = findViewById(R.id.buttonIniciar);
        crear = findViewById(R.id.crearCuenta);
    }
}