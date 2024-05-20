package br.edu.fateczl.atividade08_mobile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.fateczl.atividade08_mobile.R;
import br.edu.fateczl.atividade08_mobile.model.Ingresso;

public class CompraIngressoActivity extends AppCompatActivity {

    private EditText codigoEditText, valorEditText, taxaEditText;
    private Button comprarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_ingresso);

        codigoEditText = findViewById(R.id.codigoEditText);
        valorEditText = findViewById(R.id.valorEditText);
        taxaEditText = findViewById(R.id.taxaEditText);
        comprarButton = findViewById(R.id.comprarButton);

        comprarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codigo = codigoEditText.getText().toString();
                float valor = Float.parseFloat(valorEditText.getText().toString());
                float taxa = Float.parseFloat(taxaEditText.getText().toString());

                Ingresso ingresso = new Ingresso(codigo, valor);
                float valorFinal = ingresso.valorFinal(taxa);

                Intent intent = new Intent(CompraIngressoActivity.this, DadosCompraActivity.class);
                intent.putExtra("codigo", codigo);
                intent.putExtra("valorFinal", valorFinal);
                startActivity(intent);
            }
        });
    }
}
