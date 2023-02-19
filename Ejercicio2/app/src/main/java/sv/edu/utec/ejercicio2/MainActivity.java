package sv.edu.utec.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText edtPrecio;
     TextView tvPagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrecio = findViewById(R.id.edtPrecio);
        tvPagar = findViewById(R.id.tvPagar);
    }
    public void operar(View view){

        String valor1 = edtPrecio.getText().toString();
        double v1 = Double.parseDouble(valor1);
        String resultado="";
        double IVA = v1 * 0.134;
        double preciofinal = IVA + v1;
        resultado = ("El precio con IVA es: " + preciofinal);
        tvPagar.setText(resultado);
    }
}



