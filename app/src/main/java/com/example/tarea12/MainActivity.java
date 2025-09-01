package com.example.tarea12;

import android.os.Bundle;

import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Martin Alarcon, Martin Araya, Julian Ojeda

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void EnviarDatos(View view) {

        // Referencia al campo
        TextInputEditText campo = findViewById(R.id.campoTexto);

        // Obtener lo que escribió el usuario
        String mensaje = campo.getText().toString();

        // Crear un Intent explícito para abrir Actividad2
        Intent intent = new Intent(this, Actividad2.class);

        // Agregar datos al Intent
        intent.putExtra("mensaje", mensaje);

        // Iniciar la Activity
        startActivity(intent);
    }

}