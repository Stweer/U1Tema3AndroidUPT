package com.example.u1tema3androidupt.Ejemplo3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.u1tema3androidupt.R;

public class DetalleCorreoFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater,
                           ViewGroup container,
                           Bundle savedInstanceState) {
    return inflater.inflate(R.layout.activity_detalle_correo, container, false);
  }
  public void mostrarDetalle(String texto) {
    TextView txtDetalle =
            (TextView)getView().findViewById(R.id.txtresultado);
    txtDetalle.setText(texto);
  }
}