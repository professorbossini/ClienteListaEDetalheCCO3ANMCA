package br.com.bossini.clientelistaedetalhecco3anmca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Intent origem = getIntent();
        String busca = origem.getStringExtra("busca");
        Toast.makeText(this, busca, Toast.LENGTH_SHORT).show();
    }
}
