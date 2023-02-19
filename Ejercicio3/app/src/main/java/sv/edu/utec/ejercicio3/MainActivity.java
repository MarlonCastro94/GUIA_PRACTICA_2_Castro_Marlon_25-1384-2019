package sv.edu.utec.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
            EditText edtNum1, edtNum2, edtOperacion;
            TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        edtOperacion = findViewById(R.id.edtOperacion);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void operar(View view){
        String num1 = edtNum1.getText().toString();
        int n1 = Integer.parseInt(num1);
        String num2 = edtNum2.getText().toString();
        int n2 = Integer.parseInt(num2);
        String operacion = "";
        operacion = edtOperacion.getText().toString();
        double resul = 0;


        switch (operacion){

            case "+":
                resul = n1 + n2;
                tvResultado.setText("El resultado de la operacion "+num1+""+operacion+""+num2+" es: "+resul);
                break;
            case "-":
                resul = n1 - n2;
                tvResultado.setText("El resultado de la operacion "+num1+""+operacion+""+num2+" es: "+resul);
                break;
            case "*":
                resul = n1 * n2;
                tvResultado.setText("El resultado de la operacion "+num1+""+operacion+""+num2+" es: "+resul);
                break;
            case "/":
                if(n2 == 0){
                    tvResultado.setText("No se puede dividir entre 0");
                }else{
                    resul =  (double) n1 / n2;
                    tvResultado.setText("El resultado de la operacion "+num1+""+operacion+""+num2+" es: "+resul);
                }
                break;
            default:
                tvResultado.setText("Operacion Incorrecta");
                break;
        }

    }
}