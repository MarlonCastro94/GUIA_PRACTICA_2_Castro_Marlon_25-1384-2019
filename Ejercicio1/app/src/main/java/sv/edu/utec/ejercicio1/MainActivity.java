package sv.edu.utec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvVariable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvVariable = findViewById(R.id.tvVariable);

        String nombre ="Marlon Castro";
        tvVariable.setText("Bienvenido "+ nombre);
    }
}