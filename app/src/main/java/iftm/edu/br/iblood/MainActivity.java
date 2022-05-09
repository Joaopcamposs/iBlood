package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.MessageQueue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.location.LocationRequest;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txt_bemvindo, txt_descricao_main;
    Button btn_a, btn_b, btn_ab, btn_o, btn_sobre, btn_sangue;
    ImageView img_logo;
    private ArrayList<String> strList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txt_bemvindo = findViewById(R.id.txt_bemvindo);
        this.txt_descricao_main = findViewById(R.id.txt_descricao_main);
        this.btn_a = findViewById(R.id.btn_a);
        this.btn_b = findViewById(R.id.btn_b);
        this.btn_ab = findViewById(R.id.btn_ab);
        this.btn_o = findViewById(R.id.btn_o);
        this.img_logo = findViewById(R.id.img_logo);
        this.btn_sobre = findViewById(R.id.btn_sobre);
        this.btn_sangue = findViewById(R.id.btn_sangue);
        this.strList = new ArrayList<>();
    }

    public void OnClick_A(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo A");
        this.strList.clear();
        this.strList.add("                     VANTAGENS:\n" +
                "\n" +
                "- Adapta - se bem a mudanças de dieta e de ambiente.\n" +
                "- O sistema imunológico preserva e metaboliza os nutrientes mais facilmente.\n");

        this.strList.add("                     FRAQUEZAS:\n" +
                "\n" +
                "- Aparelho digestivo sensível.\n" +
                "- Sistema imunológico vulnerável, aberto á invasão de micróbios.\n");

        this.strList.add("            RISCOS PARA A SAÚDE:\n" +
                "\n" +
                "- Doenças do coração.\n" +
                "- Câncer.\n" +
                "- Anemia.\n" +
                "- Distúrbios do fígado e da vesícula.\n" +
                "- Diabetes do tipo 1.\n");

        this.strList.add("               PERFIL DIETÉTICO:\n" +
                "\n" +
                "- Vegetariano.\n" +
                "- Hortaliças.\n" +
                "- Tofu.\n" +
                "- Frutos do mar.\n" +
                "- Cereais.\n" +
                "- Feijões.\n" +
                "- Leguminosas.\n" +
                "- Frutas.\n");

        this.strList.add("       FATORES DE PERDA DE PESO:\n" +
                "\n" +
                "Evite: Carne, Laticínios, Feijão-mulatinho, Feijão-fradinho, Trigo.\n" +
                "\n" +
                "Benéficos: Óleo Vegetal, Alimentos de soja, Hortaliças, Abacaxi.\n");

        this.strList.add("                    SUPLEMENTOS:\n" +
                "\n" +
                "- Vitamina B12.\n" +
                "- Ácido fólico.\n" +
                "- Vitamina C.\n" +
                "- Vitamina E.\n" +
                "- Pilriteiro.\n" +
                "- Equinácea\n" +
                "- Quercetina.\n" +
                "- Cardomariano.\n");

        this.strList.add("                      EXERCÍCIOS:\n" +
                "\n" +
                "- Exercícios relaxantes, que facilitam a concentração como: Ioga, Tai Chi.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);
        startActivity(intent);
    }

    public void OnClick_B(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo B");
        this.strList.clear();
        this.strList.add("                     VANTAGENS:\n" +
                "\n" +
                "- Sistema imunológico forte.\n" +
                "- Facilidade de adaptação a mudanças de dieta e de ambiente.\n" +
                "- Sistema nervoso equilibrado.\n");

        this.strList.add("                     FRAQUEZAS:\n" +
                "\n" +
                "- Não tem fraquezas naturais, mas o desequilíbrio causa tendência a doenças autoimunes e a viroses raras.\n");

        this.strList.add("              RISCOS PARA A SAÚDE:\n" +
                "\n" +
                "- Diabetes do tipo 1.\n" +
                "- Síndrome da fadiga crônica.\n" +
                "- Doenças autoimunes - doença de Lou Gehrid, lúpus, esclerose múltipla.\n");

        this.strList.add("                 PERFIL DIETÉTICO:\n" +
                "\n" +
                "- Onívoro equilibrado.\n" +
                "- Carne (mas não frango) laticínios.\n" +
                "- Cereais. \n" +
                "- Feijões.\n" +
                "- Leguminosas.\n" +
                "- Hortaliças.\n" +
                "- Frutas.\n");

        this.strList.add("        FATORES DE PERDA DE PESO:\n" +
                "\n" +
                "- Evite: Milho, Lentilha, Amendoim, Gergelim, Sementes, Trigo, Trigo-sarraceno.\n" +
                "\n" +
                "- Benéficos: Folhas, Ovos, Fígado, Chá de alcaçuz.\n");

        this.strList.add("                    SUPLEMENTOS:\n" +
                "\n" +
                "- Magnésio.\n" +
                "- Alcaçuz.\n" +
                "- Ginkgo.\n" +
                "- Lecitina.\n");

        this.strList.add("                     EXERCÍCIOS:\n" +
                "\n" +
                "- Exercícios físicos moderados com o equilíbrio mental como: Caminhada, Ciclismo, Tênis, Natação.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);
        startActivity(intent);
    }

    public void OnClick_AB(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo AB");
        this.strList.clear();
        this.strList.add("                     VANTAGENS:\n" +
                " \n" +
                "- Programado para as condições modernas.\n" +
                "- Sistema imunológico altamente tolerante.\n" +
                "- Combina os benefícios dos tipos A e B.\n");

        this.strList.add("                     FRAQUEZAS:\n" +
                " \n" +
                "- Aparelho digestivo sensível.\n" +
                "- Sistema imunológico excessivamente tolerante, o que permite a invasão de micróbios.\n" +
                "- Reage negativamente às doenças que têm afinidade com os tipos A e B.\n");

        this.strList.add("              RISCOS PARA A SAÚDE:\n" +
                "\n" +
                "- Doenças do coração.\n" +
                "- Câncer.\n" +
                "- Anemia.\n");

        this.strList.add("                 PERFIL DIETÉTICO:\n" +
                "\n" +
                "- Dieta mista, com moderação: Carne, Frutos do mar, Laticínios, tofu, feijões, leguminosas, cereais, hortaliças, frutas. \n");

        this.strList.add("        FATORES DE PERDA DE PESO:\n" +
                "\n" +
                "- Evite: Carne vermelha, Feijão mulatinho, Feijão manteiga, Sementes de milho, Trigo-sarraceno.\n" +
                "\n" +
                "- Benéficos: Tofu, Frutos do mar, Laticínios, Folhas, Algas marinhas, Abacaxi.\n");

        this.strList.add("                    SUPLEMENTOS:\n" +
                "\n" +
                "- Vitamina C.\n" +
                "- Pilriteiro.\n" +
                "- Equinácia.\n" +
                "- Valeriana.\n" +
                "- Quercetina.\n" +
                "- Cardomariano.\n");

        this.strList.add("                      EXERCÍCIOS:\n" +
                "\n" +
                "- Exercícios relaxantes que facilitam a concentração como: Ioga, Tai chi.\n" +
                "\n" +
                "- Combinados com exercícios físicos moderados como: Caminhada, Ciclismo, Tênis.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);
        startActivity(intent);
    }

    public void OnClick_O(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo O");
        this.strList.clear();
        this.strList.add("                    VANTAGENS:\n" +
                "\n" +
                "- Aparelho digestivo forte.\n" +
                "- Sistema imunológico forte.\n" +
                "- Defesas naturais contra infecções.\n" +
                "- Sistema programado para ter metabolismo eficaz e preservar os nutrientes.\n");

        this.strList.add("                    FRAQUEZAS:\n" +
                "\n" +
                "- Intolerância a novas dietas e condições ambientais.\n" +
                "- O sistema imunológico pode ser excessivamente ativo e atacar a sí mesmo.\n");

        this.strList.add("           RISCOS PARA A SAÚDE:\n" +
                "\n" +
                "- Distúrbios na coagulação sanguínea.\n" +
                "- Doenças inflamatórias – Artrite.\n" +
                "- Baixa produção de hormônios da tiroide.\n" +
                "- Úlceras, Alergias.\n");

        this.strList.add("              PERFIL DIETÉTICO:\n" +
                "\n" +
                "- Muita proteína: Comedor de carnes.\n" +
                "- Carne, peixe, hortaliças, frutas.\n" +
                "- Limitados: Cereais, feijões, leguminosas.\n");

        this.strList.add("      FATORES DE PERDA DE PESO:\n" +
                "\n" +
                "- Evite: Trigo, milho, feijão mulatinho, feijão branco, miúdo, lentilhas, repolho, couve de Bruxelas, couve flor, folhas de mostarda.\n" +
                "- Benéficos: Alga marinha, frutos do mar, sal, fígado, carne vermelha, espinafre, brócolis.\n");

        this.strList.add("                   SUPLEMENTOS:\n" +
                "\n" +
                "- Vitamina B.\n" +
                "- Vitamina K.\n" +
                "- Cálcio.\n" +
                "- Iodo.\n" +
                "- Alcaçuz.\n" +
                "- Algas marinhas.\n");
        this.strList.add("                      EXERCÍCIOS:\n" +
                "\n" +
                "- Exercícios físicos intensos, como: Aeróbicos, artes marciais, esporte em que haja contato com os adversários, corrida.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);
        startActivity(intent);
    }

    public void OnClickSobre(View viw) {
        Intent intent = new Intent(this, TelaSobre.class);
        intent.putExtra("MESSAGE0", "iBlood - Sobre");
        startActivity(intent);
    }

    public void OnClickSangue(View view){
        Intent intent = new Intent(this, DoeSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Informações Sobre Doação Sanguínea");
        startActivity(intent);
    }
}
