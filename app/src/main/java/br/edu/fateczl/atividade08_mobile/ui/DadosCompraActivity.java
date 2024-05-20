package br.edu.fateczl.atividade08_mobile.ui;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import br.edu.fateczl.atividade08_mobile.R;

public class DadosCompraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_compra);

        TextView codigoTextView = findViewById(R.id.codigoTextView);
        TextView valorFinalTextView = findViewById(R.id.valorFinalTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String codigo = extras.getString("codigo");
            float valorFinal = extras.getFloat("valorFinal");

            codigoTextView.setText("Código do ingresso: " + codigo);
            valorFinalTextView.setText("Valor final: R$ " + String.format("%.2f", valorFinal));
        }
    }
}
