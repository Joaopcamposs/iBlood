package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

import java.util.ArrayList;
import java.util.List;

public class DescricaoSangue extends AppCompatActivity {

    public static final String LIST_KEY = "DescricaoSangue.LIST";
    private ArrayList<String> strList;
    private CarouselView carouselView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_sangue);
        setTitle(getIntent().getStringExtra("MESSAGE0"));

        this.carouselView = findViewById(R.id.carousel);
        this.strList = getIntent().getStringArrayListExtra(LIST_KEY);
        this.carouselView.setPageCount(this.strList.size());
        this.carouselView.setViewListener(new ViewListener() {
            @Override
            public View setViewForPosition(int position) {
                View view = getLayoutInflater().inflate(R.layout.carousel_item, null);
                TextView txtStr = view.findViewById(R.id.txtStr);
                txtStr.setText(strList.get(position));
                return view;
            }
        });
    }
}
