package sv.edu.utec.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMensaje = findViewById(R.id.tvMensaje);

        int N = 1;
        int inc = 77, dec = 3;
        int resultadoI = 0;
        int resultadoD = 0;
        int resultadoDup = 0;
        resultadoI = N+inc;
        resultadoD = resultadoI-dec;
        resultadoDup = resultadoD*2;

        tvMensaje.setText("El valor inicial de N es: " + N+
                "\nN + 77: "+resultadoI+"\nN - 3: "+resultadoD+"\nN * 2: "+resultadoDup
        );

    }
}