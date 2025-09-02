package com.example.tarea12;

import android.os.Bundle;

import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Martin Alarcon, Martin Araya, Julian Ojeda
//prueba
public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_actividad2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Recuperar el Intent y extraer el dato enviado desde MainActivity
                String mensaje = getIntent().getStringExtra("mensaje");

        // Mostrarlo en un TextView
        TextView texto = findViewById(R.id.textoMensaje);
        texto.setText(mensaje);
    }
}