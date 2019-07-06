package com.cursoandroid.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "É pra frente que se anda, é pra cima que se olha e é lutando que se conquista.",
            "Ciclo da vida: tentar, cair, levantar, recomeçar. Nunca desistir.",
            "Treine sua mente para ver o lado bom de qualquer situação."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        //textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
