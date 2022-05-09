package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

import java.util.ArrayList;
import java.util.List;

public class DescricaoSangue extends AppCompatActivity {

    public static final String LIST_KEY = "DescricaoSangue.LIST";
    public static final String LIST_KEY2 = "DescricaoSangue2.LIST";
    private ArrayList<String> strList;
    private ArrayList<String> strTitles;
    private CarouselView carouselView;
    Button btn_desjejum, btn_lancheManha, btn_almoco, btn_lancheTarde, btn_ceia, btn_sobre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_sangue);
        setTitle(getIntent().getStringExtra("MESSAGE0"));

        this.carouselView = findViewById(R.id.carousel);
        this.strTitles = getIntent().getStringArrayListExtra(LIST_KEY2);
        this.strList = getIntent().getStringArrayListExtra(LIST_KEY);
        this.carouselView.setPageCount(this.strList.size());
        this.carouselView.setViewListener(new ViewListener() {
            @Override
            public View setViewForPosition(int position) {
                View view = getLayoutInflater().inflate(R.layout.carousel_item, null);
                TextView txt_title = view.findViewById(R.id.txt_title);
                txt_title.setText(strTitles.get(position));
                TextView txtStr = view.findViewById(R.id.txtStr);
                txtStr.setText(strList.get(position));
                return view;
            }
        });

        this.btn_desjejum = findViewById(R.id.btn_desjejum);
        this.btn_lancheManha = findViewById(R.id.btn_lancheManha);
        this.btn_almoco = findViewById(R.id.btn_almoco);
        this.btn_lancheTarde = findViewById(R.id.btn_lancheTarde);
        this.btn_ceia = findViewById(R.id.btn_ceia);
        this.btn_sobre2 = findViewById(R.id.btn_sobre2);
    }

    public void OnClickDesjejum(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugestão de Desjejum");
        String str = getIntent().getStringExtra("MESSAGE1");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickLancheManha(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugestão de Lanche da Manhã");
        String str = getIntent().getStringExtra("MESSAGE2");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickAlmoco(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugestão de Almoço e Jantar");
        String str = getIntent().getStringExtra("MESSAGE3");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickLancheTarde(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugestão de Lanche da Tarde");
        String str = getIntent().getStringExtra("MESSAGE4");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickCeia(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugestão de Ceia");
        String str = getIntent().getStringExtra("MESSAGE5");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickSobre2(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sobre Sugestões de Alimentação");
        intent.putExtra("MESSAGE_X", "ADVERTÊNCIA: Este aplicativo não pretende substituir as recomendações dos médicos ou outras providências relacionadas à saúde. Ao contrário, seu objetivo é dar informações que ajude o usuário a cooperar com os médicos e profissionais da saúde em busca mútua por um estado ótimo de bem-estar.\n" +
                "\n" +
                "\n" +
                "   Os alimentos aqui listados e recomendados não devem ser utilizados para total substituição de sua alimentação diária. Estes são expostos como exemplos de alimentos que se encaixam em cada perfil sanguíneo, conforme o livro “A Dieta do Tipo Sanguíneo, de Peter J.D’Adamo com Catherine Whitney”. Para maiores detalhes e uma alimentação adequada, consulte seu Médico ou Nutricionista. \n" +
                "\n" +
                "\n" +
                "   Os exemplos de dieta apresentados foram montados por uma aluna concluinte do curso de Nutrição na faculdade UFTM campus Uberaba CE, sob a supervisão de sua Orientada de projetos. Todas as informações foram baseadas no livro “A Dieta do Tipo Sanguíneo, de Peter J.D’Adamo com Catherine Whitney”.\n");

        startActivity(intent);
    }
}
