package com.example.u1tema3androidupt.Ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.u1tema3androidupt.R;

public class DetalleCorreo extends AppCompatActivity {
  String texto,de,asunto;
  TextView txtresultado;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detalle_correo);
    Bundle extras = getIntent().getExtras();
    texto = extras.getString("texto");
    texto = extras.getString("de");
    texto = extras.getString("asunto");
    txtresultado=findViewById(R.id.txtresultado);

  }
}
