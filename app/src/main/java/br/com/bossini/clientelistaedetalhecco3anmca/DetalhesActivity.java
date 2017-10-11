package br.com.bossini.clientelistaedetalhecco3anmca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DetalhesActivity extends AppCompatActivity {

    private TextView exibeNomeTextView;
    private static String nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        exibeNomeTextView = (TextView) findViewById(R.id.exibeNomeTextView);
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        exibeNomeTextView.setText(nome);
        exibeNomeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetalhesActivity.this, ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
