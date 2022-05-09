package iftm.edu.br.iblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_bemvindo, txt_descricao_main;
    Button btn_a, btn_b, btn_ab, btn_o, btn_sobre, btn_livro;
    ImageView img_logo;

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
        this.btn_livro = findViewById(R.id.bnt_livro);
        this.btn_sobre = findViewById(R.id.btn_sobre);
    }

    public void OnClick_A(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE", "Lorem Ipsum tipo A");
        intent.putExtra("MESSAGE2", "iBlood - Tipo A");
        startActivity(intent);
    }

    public void OnClick_B(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE", "Lorem Ipsum tipo B");
        intent.putExtra("MESSAGE2", "iBlood - Tipo B");
        startActivity(intent);
    }

    public void OnClick_AB(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE", "Lorem Ipsum tipo AB");
        intent.putExtra("MESSAGE2", "iBlood - Tipo AB");
        startActivity(intent);
    }

    public void OnClick_O(View view) {
        Intent intent = new Intent(this, DescricaoSangue.class);
        intent.putExtra("MESSAGE", "VANTAGENS:\n" +
                "- Aparelho digestivo forte.\n" +
                "- Sistema imunológico forte.\n" +
                "- Defesas naturais contra infecções.\n" +
                "- Sistema programado para ter metabolismo eficaz e preservar os nutrientes.\n" +
                "\n" +
                "\n" +
                "FRAQUEZAS:\n" +
                "- Intolerância a novas dietas e condições ambientais.\n" +
                "- O sistema imunológico pode ser excessivamente ativo e atacar a sí mesmo.\n" +
                "\n" +
                "\n" +
                "RISCOS PARA A SAÚDE:\n" +
                "- Distúrbios na coagulação sanguínea.\n" +
                "- Doenças inflamatórias – Artrite.\n" +
                "- Baixa produção de hormônios da tiroide.\n" +
                "- Úlceras, Alergias.\n" +
                "\n" +
                "\n" +
                "PERFIL DIETÉTICO:\n" +
                "- Muita proteína: Comedor de carnes.\n" +
                "- Carne, peixe, hortaliças, frutas.\n" +
                "- Limitados: Cereais, feijões, leguminosas.\n" +
                "\n" +
                "\n" +
                "FATORES DE PERDA DE PESO:\n" +
                "- Evite: Trigo, milho, feijão mulatinho, feijão branco, miúdo, lentilhas, repolho, couve de Bruxelas, couve flor, folhas de mostarda.\n" +
                "- Benéficos: Alga marinha, frutos do mar, sal, fígado, carne vermelha, espinafre, brócolis.\n" +
                "\n" +
                "\n" +
                "SUPLEMENTOS:\n" +
                "- Vitamina B\n" +
                "- Vitamina K\n" +
                "- Cálcio\n" +
                "- Iodo\n" +
                "- Alcaçuz\n" +
                "- Algas marinhas.\n" +
                "\n" +
                "\n" +
                "EXERCÍCIOS:\n" +
                "- Exercícios físicos intensos, como: Aeróbicos, artes marciais, esporte em que haja contato com os adversários, corrida. \n");
        intent.putExtra("MESSAGE2", "iBlood - Tipo O");
        startActivity(intent);
    }
}
