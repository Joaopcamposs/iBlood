package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txt_bemvindo, txt_descricao_main;
    Button btn_a, btn_b, btn_ab, btn_o, btn_sobre, btn_sangue;
    ImageView img_logo;
    private ArrayList<String> strList;
    private ArrayList<String> strTitles;

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
        this.strTitles = new ArrayList<>();
        this.strTitles.add("VANTAGENS"); this.strTitles.add("FRAQUEZAS"); this.strTitles.add("RISCOS PARA A SAÚDE"); this.strTitles.add("PERFIL DIETÉTICO");
        this.strTitles.add("FATORES DE PERDA DE PESO"); this.strTitles.add("SUPLEMENTOS"); this.strTitles.add("EXERCÍCIOS");
    }

    public void OnClick_A(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo A");
        intent.putExtra(DescricaoSangue.LIST_KEY2, this.strTitles);
        this.strList.clear();
        this.strList.add("- Adapta - se bem a mudanças de dieta e de ambiente.\n" +
                "- O sistema imunológico preserva e metaboliza os nutrientes mais facilmente.\n");

        this.strList.add("- Aparelho digestivo sensível.\n" +
                "- Sistema imunológico vulnerável, aberto á invasão de micróbios.\n");

        this.strList.add("- Doenças do coração.\n" +
                "- Câncer.\n" +
                "- Anemia.\n" +
                "- Distúrbios do fígado e da vesícula.\n" +
                "- Diabetes do tipo 1.\n");

        this.strList.add("- Vegetariano.\n" +
                "- Hortaliças.\n" +
                "- Tofu.\n" +
                "- Frutos do mar.\n" +
                "- Cereais.\n" +
                "- Feijões.\n" +
                "- Leguminosas.\n" +
                "- Frutas.\n");

        this.strList.add("- Evite: Carne, Laticínios, Feijão-mulatinho, Feijão-fradinho, Trigo.\n" +
                "\n" +
                "- Benéficos: Óleo Vegetal, Alimentos de soja, Hortaliças, Abacaxi.\n");

        this.strList.add("- Vitamina B12.\n" +
                "- Ácido fólico.\n" +
                "- Vitamina C.\n" +
                "- Vitamina E.\n" +
                "- Pilriteiro.\n" +
                "- Equinácea\n" +
                "- Quercetina.\n" +
                "- Cardomariano.\n");

        this.strList.add("- Exercícios relaxantes, que facilitam a concentração como: Ioga, Tai Chi.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);

        //msg desjejum
        intent.putExtra("MESSAGE1", "- Bebida de soja / Café\n" +
                "- Morango\n" +
                "- Panqueca de aveia com banana e mel\n" +
                "- Queijo fresco UHT\n");
        //msg lanche manha
        intent.putExtra("MESSAGE2", "- Melão com chia\n" +
                "- Uva\n");
        //msg almoco
        intent.putExtra("MESSAGE3", "- Salada de alface com tomate\n" +
                "- Tofu com legumes / Peixe grelhado \n" +
                "- Arroz com feijão carioca\n" +
                "- Suco de laranja\n" +
                "- Sobremesa Abacaxi assado com canela\n");
        //msg lanche tarde
        intent.putExtra("MESSAGE4", "- Banana e maça com aveia, flocos");
        //msg ceia
        intent.putExtra("MESSAGE5", "- Geléia de frutas vermelhas\n" +
                "- Torrada integral\n" +
                "- Bebida de soja\n");

        startActivity(intent);
    }

    public void OnClick_B(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo B");
        this.strList.clear();
        intent.putExtra(DescricaoSangue.LIST_KEY2, this.strTitles);
        this.strList.add("- Sistema imunológico forte.\n" +
                "- Facilidade de adaptação a mudanças de dieta e de ambiente.\n" +
                "- Sistema nervoso equilibrado.\n");

        this.strList.add("- Não tem fraquezas naturais, mas o desequilíbrio causa tendência a doenças autoimunes e a viroses raras.\n");

        this.strList.add("- Diabetes do tipo 1.\n" +
                "- Síndrome da fadiga crônica.\n" +
                "- Doenças autoimunes - doença de Lou Gehrid, lúpus, esclerose múltipla.\n");

        this.strList.add("- Onívoro equilibrado.\n" +
                "- Carne (mas não frango) laticínios.\n" +
                "- Cereais. \n" +
                "- Feijões.\n" +
                "- Leguminosas.\n" +
                "- Hortaliças.\n" +
                "- Frutas.\n");

        this.strList.add("- Evite: Milho, Lentilha, Amendoim, Gergelim, Sementes, Trigo, Trigo-sarraceno.\n" +
                "\n" +
                "- Benéficos: Folhas, Ovos, Fígado, Chá de alcaçuz.\n");

        this.strList.add("- Magnésio.\n" +
                "- Alcaçuz.\n" +
                "- Ginkgo.\n" +
                "- Lecitina.\n");

        this.strList.add("- Exercícios físicos moderados com o equilíbrio mental como: Caminhada, Ciclismo, Tênis, Natação.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);

        //msg desjejum
        intent.putExtra("MESSAGE1", "- Omelete de abobrinha\n" +
                "- Suco de laranja / pêssego\n");
        //msg lanche manha
        intent.putExtra("MESSAGE2", "- Iogurte natural\n" +
                "- Morango\n" +
                "- Mix de castanhas\n");
        //msg almoco
        intent.putExtra("MESSAGE3", "- Salada de salpicão com passas\n" +
                "- Bife á cavalo \n" +
                "- Arroz com feijão \n" +
                "- Suco de limão\n" +
                "- Sobremesa sorvete de abacate\n");
        //msg lanche tarde
        intent.putExtra("MESSAGE4", "- Leite / Café / Chá de alcaçuz\n" +
                "- Pão caseiro integral \n" +
                "- Salada de frutas\n");
        //msg ceia
        intent.putExtra("MESSAGE5", "- Leite / Chá de alcaçuz\n" +
                "- Torrada com ricota\n");

        startActivity(intent);
    }

    public void OnClick_AB(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo AB");
        this.strList.clear();
        intent.putExtra(DescricaoSangue.LIST_KEY2, this.strTitles);
        this.strList.add("- Programado para as condições modernas.\n" +
                "- Sistema imunológico altamente tolerante.\n" +
                "- Combina os benefícios dos tipos A e B.\n");

        this.strList.add("- Aparelho digestivo sensível.\n" +
                "- Sistema imunológico excessivamente tolerante, o que permite a invasão de micróbios.\n" +
                "- Reage negativamente às doenças que têm afinidade com os tipos A e B.\n");

        this.strList.add("- Doenças do coração.\n" +
                "- Câncer.\n" +
                "- Anemia.\n");

        this.strList.add("- Dieta mista, com moderação: Carne, Frutos do mar, Laticínios, tofu, feijões, leguminosas, cereais, hortaliças, frutas. \n");

        this.strList.add("- Evite: Carne vermelha, Feijão mulatinho, Feijão manteiga, Sementes de milho, Trigo-sarraceno.\n" +
                "\n" +
                "- Benéficos: Tofu, Frutos do mar, Laticínios, Folhas, Algas marinhas, Abacaxi.\n");

        this.strList.add("- Vitamina C.\n" +
                "- Pilriteiro.\n" +
                "- Equinácia.\n" +
                "- Valeriana.\n" +
                "- Quercetina.\n" +
                "- Cardomariano.\n");

        this.strList.add("- Exercícios relaxantes que facilitam a concentração como: Ioga, Tai chi.\n" +
                "\n" +
                "- Combinados com exercícios físicos moderados como: Caminhada, Ciclismo, Tênis.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);

        //msg desjejum
        intent.putExtra("MESSAGE1", "- Chá de Cardomariano\n" +
                "- Panqueca de aveia com queijo \n" +
                "- Frutas: Uva, Cereja, Melancia\n");
        //msg lanche manha
        intent.putExtra("MESSAGE2", "- Iogurte natural com amora\n" +
                "- Mix de castanhas\n");
        //msg almoco
        intent.putExtra("MESSAGE3", "- Salada de alface, couve e chicória\n" +
                "- Frango assado / Sushi / Tofu \n" +
                "- Arroz com feijão \n" +
                "- Suco de abacaxi\n" +
                "- Sobremesa Morangos frescos\n");
        //msg lanche tarde
        intent.putExtra("MESSAGE4", "- Suco de couve com limão e acerola\n" +
                "- Panqueca / Torrada / Pão integral\n");
        //msg ceia
        intent.putExtra("MESSAGE5", "- Leite / Chá de Valeriana\n" +
                "- Torrada com pasta de amendoim\n");

        startActivity(intent);
    }

    public void OnClick_O(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE0", "iBlood - Tipo O");
        this.strList.clear();
        intent.putExtra(DescricaoSangue.LIST_KEY2, this.strTitles);
        this.strList.add("- Aparelho digestivo forte.\n" +
                "- Sistema imunológico forte.\n" +
                "- Defesas naturais contra infecções.\n" +
                "- Sistema programado para ter metabolismo eficaz e preservar os nutrientes.\n");

        this.strList.add("- Intolerância a novas dietas e condições ambientais.\n" +
                "- O sistema imunológico pode ser excessivamente ativo e atacar a sí mesmo.\n");

        this.strList.add("- Distúrbios na coagulação sanguínea.\n" +
                "- Doenças inflamatórias – Artrite.\n" +
                "- Baixa produção de hormônios da tiroide.\n" +
                "- Úlceras, Alergias.\n");

        this.strList.add("- Muita proteína: Comedor de carnes.\n" +
                "- Carne, peixe, hortaliças, frutas.\n" +
                "- Limitados: Cereais, feijões, leguminosas.\n");

        this.strList.add("- Evite: Trigo, milho, feijão mulatinho, feijão branco, miúdo, lentilhas, repolho, couve de Bruxelas, couve flor, folhas de mostarda.\n\n" +
                "- Benéficos: Alga marinha, frutos do mar, sal, fígado, carne vermelha, espinafre, brócolis.\n");

        this.strList.add("- Vitamina B.\n" +
                "- Vitamina K.\n" +
                "- Cálcio.\n" +
                "- Iodo.\n" +
                "- Alcaçuz.\n" +
                "- Algas marinhas.\n");
        this.strList.add("- Exercícios físicos intensos, como: Aeróbicos, artes marciais, esporte em que haja contato com os adversários, corrida.\n");

        intent.putExtra(DescricaoSangue.LIST_KEY, this.strList);

        //msg desjejum
        intent.putExtra("MESSAGE1", "- Vitamina \n" +
                "- Panqueca com queijo fresco e geléia de uva\n");
        //msg lanche manha
        intent.putExtra("MESSAGE2", "- Salada de frutas ");
        //msg almoco
        intent.putExtra("MESSAGE3", "- Salada de brócolis com tomate\n" +
                "- Frutos do mar / Carne vermelha\n" +
                "- Arroz com feijão carioca temperado\n" +
                "- Espinafre salteado no azeite de dendê\n" +
                "- Suco de goiaba\n" +
                "- Sobremesa chocolate barra 80% cacau\n");
        //msg lanche tarde
        intent.putExtra("MESSAGE4", "- Leite com aveia\n" +
                "- Torrada \n" +
                "- Fruta kiwi\n");
        //msg ceia
        intent.putExtra("MESSAGE5", "- Chá de alcaçuz\n" +
                "- Torrada com geléia de manga\n");

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
