package com.proyectocalidad.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

import com.proyectocalidad.R;

public class SignUp extends AppCompatActivity {

    EditText correo;
    EditText psw;
    Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        inflate();

    }

    private void inflate() {
        correo = findViewById(R.id.editTextCorreo);
        psw = findViewById(R.id.editTextPsw);
        iniciar = findViewById(R.id.buttonIniciar);
    }
}