package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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
        this.scrollView = findViewById(R.id.scrollView);
        this.txt_maisProximo = findViewById(R.id.txt_maisProximo);
        this.linear = findViewById(R.id.linear);
    }
}
