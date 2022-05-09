package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SugestaoAlimentacao extends AppCompatActivity {

    TextView txt_descSugestao;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugestao_alimentacao);
        setTitle(getIntent().getStringExtra("MESSAGE0"));
        this.scrollView = findViewById(R.id.ScrollView);

        this.txt_descSugestao = findViewById(R.id.txt_descSugestao);

        txt_descSugestao.setText(getIntent().getStringExtra("MESSAGE_X"));
    }
}
