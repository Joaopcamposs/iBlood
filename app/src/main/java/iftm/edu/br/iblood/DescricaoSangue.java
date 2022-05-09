package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DescricaoSangue extends AppCompatActivity {

    TextView txt_descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_sangue);

        setTitle(getIntent().getStringExtra("MESSAGE2"));

        this.txt_descricao = findViewById(R.id.txt_descricao);
        txt_descricao.setText(getIntent().getStringExtra("MESSAGE"));
    }
}
