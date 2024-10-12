package com.example.atividade1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getContador();
    }

    public void verImagem(View view){
        Intent it = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(it);
    }

    public void irParaTelaContador(View view){
        Intent it = new Intent(getApplicationContext(), Main3Activity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("cont", getContador());

        it.putExtras(bundle);
        startActivity(it);
    }

    public Integer getContador(){
        int contador = 0;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            contador = extras.getInt("cont");
        }

        contador++;

        Button button = findViewById(R.id.buttonContador);
        button.setText(Integer.toString(contador));

        return contador;
    }

}