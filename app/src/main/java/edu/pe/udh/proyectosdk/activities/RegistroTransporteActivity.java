package edu.pe.udh.proyectosdk.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import edu.pe.udh.proyectosdk.R;

public class RegistroTransporteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_transporte);

        EditText etTipoVehiculo = findViewById(R.id.etTipoVehiculo);
        EditText etDistanciaKm = findViewById(R.id.etDistanciaKm);
        Button btnGuardar = findViewById(R.id.btnGuardarTransporte);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vehiculo = etTipoVehiculo.getText().toString();
                String distancia = etDistanciaKm.getText().toString();

                if (vehiculo.isEmpty() || distancia.isEmpty()) {
                    Toast.makeText(RegistroTransporteActivity.this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegistroTransporteActivity.this, "Guardado: " + vehiculo + " - " + distancia + "km", Toast.LENGTH_LONG).show();
                    finish(); // Cierra la pantalla y regresa al menú
                }
            }
        });
    }
}