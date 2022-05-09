package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class TelaSobre extends AppCompatActivity {

    TextView txt_sobreDesc0, txt_sobreDesc1, txt_sobreDesc2, txt_sobreDesc3;
    ImageView img;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);
        setTitle(getIntent().getStringExtra("MESSAGE0"));

        this.txt_sobreDesc0 = findViewById(R.id.txt_sobreDesc0);
        this.txt_sobreDesc1 = findViewById(R.id.txt_sobreDesc1);
        this.txt_sobreDesc2 = findViewById(R.id.txt_sobreDesc2);
        this.txt_sobreDesc3 = findViewById(R.id.txt_sobreDesc3);
        this.img = findViewById(R.id.img);
        this.scrollView = findViewById(R.id.ScrollView);
    }
}
