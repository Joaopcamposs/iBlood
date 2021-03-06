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
        intent.putExtra("MESSAGE0", "iBlood - Sugest??o de Desjejum");
        String str = getIntent().getStringExtra("MESSAGE1");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickLancheManha(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugest??o de Lanche da Manh??");
        String str = getIntent().getStringExtra("MESSAGE2");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickAlmoco(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugest??o de Almo??o e Jantar");
        String str = getIntent().getStringExtra("MESSAGE3");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickLancheTarde(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugest??o de Lanche da Tarde");
        String str = getIntent().getStringExtra("MESSAGE4");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickCeia(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sugest??o de Ceia");
        String str = getIntent().getStringExtra("MESSAGE5");
        intent.putExtra("MESSAGE_X", str);

        startActivity(intent);
    }

    public void OnClickSobre2(View view){
        Intent intent = new Intent(this, SugestaoAlimentacao.class);
        intent.putExtra("MESSAGE0", "iBlood - Sobre Sugest??es de Alimenta????o");
        intent.putExtra("MESSAGE_X", "ADVERT??NCIA: Este aplicativo n??o pretende substituir as recomenda????es dos m??dicos ou outras provid??ncias relacionadas ?? sa??de. Ao contr??rio, seu objetivo ?? dar informa????es que ajude o usu??rio a cooperar com os m??dicos e profissionais da sa??de em busca m??tua por um estado ??timo de bem-estar.\n" +
                "\n" +
                "\n" +
                "   Os alimentos aqui listados e recomendados n??o devem ser utilizados para total substitui????o de sua alimenta????o di??ria. Estes s??o expostos como exemplos de alimentos que se encaixam em cada perfil sangu??neo, conforme o livro ???A Dieta do Tipo Sangu??neo, de Peter J.D???Adamo com Catherine Whitney???. Para maiores detalhes e uma alimenta????o adequada, consulte seu M??dico ou Nutricionista. \n" +
                "\n" +
                "\n" +
                "   Os exemplos de dieta apresentados foram montados por uma aluna concluinte do curso de Nutri????o na faculdade UFTM campus Uberaba CE, sob a supervis??o de sua Orientada de projetos. Todas as informa????es foram baseadas no livro ???A Dieta do Tipo Sangu??neo, de Peter J.D???Adamo com Catherine Whitney???.\n");

        startActivity(intent);
    }
}
