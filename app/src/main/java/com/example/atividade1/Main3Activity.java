package com.example.atividade1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getContador();
    }

    public void voltar(View view){
        Intent it = new Intent(getApplicationContext(), MainActivity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("cont", getContador());

        it.putExtras(bundle);
        startActivity(it);
        finish();
    }

    public Integer getContador(){
        int contador = 0;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            contador = extras.getInt("cont");
        }

        contador++;

        Button button = findViewById(R.id.button3);
        button.setText(Integer.toString(contador));

        return contador;
    }
}