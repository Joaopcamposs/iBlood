package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class DoeSangue extends AppCompatActivity {

    TextView txt_doeSangue, txt_maisProximo;
    ScrollView scrollView;
    ImageView img_tabela;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doe_sangue);
        setTitle(getIntent().getStringExtra("MESSAGE0"));

        this.txt_doeSangue = findViewById(R.id.txt_doeSangue);
        this.img_tabela = findViewById(R.id.img_tabela);
        this.scrollView = findViewById(R.id.ScrollView);
        this.txt_maisProximo = findViewById(R.id.txt_maisProximo);
        this.linear = findViewById(R.id.linear);

    }

    public void OnClickMostrar(View view){
        Intent intent = new Intent(this, Localizacoes.class);
        intent.putExtra("MESSAGE0", "Localização de Doações");

        startActivity(intent);
    }
}
