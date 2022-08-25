package com.example.lista_compras;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText produto;
    EditText marca;
    EditText quantidade;
    List<lista> dados;
    ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        produto=findViewById(R.id.produtoid);
        marca=findViewById(R.id.marcaid);
        quantidade=findViewById(R.id.quantidadeid);

    }
}