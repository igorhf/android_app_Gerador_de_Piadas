package com.example.igor.gerador_de_piadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_gerador;
    private TextView result;
    private String[] frase = {
            "O que a esposa do Albert Einstein disse quando ele tirou a roupa na sua lua de mel?\n" + "– Nossa, que físico!",
            "Um cavalo fala pro outro:\n" +
                    "– Eu ganhei 30 corridas\n" +
                    "– Pois eu ganhei 50 corridas – fala o outro cavalo\n" +
                    "– Pois eu ganhei 80 corridas – fala um outro.\n" +
                    "\n" +
                    "Aí vem um cachorro e fala:\n" +
                    "– Pois eu ganhei 150 corridas!\n" +
                    "\n" +
                    "Os cavalos ficam assustados e dizem:\n" +
                    "– Pô! Um cachorro que fala!!",
            "Você conhece a piada do fotógrafo?\n" +
                    "– Ainda não foi revelada!",
            "O que a girafa disse para a outra quando viu um elefante cor de rosa subindo a montanha?\n" +
                    "– Olha um elefante cor de rosa subindo a montanha!!",
            "Sabe a piada do viajante?\n" +
                    "– Quando ele voltar ele conta.",
            "Qual estação do ano que dá esperança pros cegos?\n" +
                    "Ve-rão",
            "Por que a mulher do Hulk se divorciou dele ?\n" +
                    "Porque ela queria um homem mais maduro.",
            "Um bêbado pergunta pro outro:\n" +
                    "– O certo é gripe ou gripa?\n" +
                    "– Gripe\n" +
                    "– Então eu to gripedo!",
            "Por que na Argentina as Vacas vivem olhando pro céu?\n" +
                    "– Pra ver se tem Boi nos ares.",
            "Qual a semelhança entre um pastor e um martelo?\n" +
                    "– Ambos pregam.",
            "Dois litros de leite atravessaram a rua e foram atropelados.. Um morreu, o outro não, por quê?\n" +
                    "– Por que um deles era Longa Vida.",
            "Qual o melhor chá para calvíce ?\n" +
                    "Chá-peu.",
            "Qual o nome do peixe que caiu do décimo andar?\n" +
                    "– AaaaaaaaahTum.",
            "O monstro fala pra monstra:\n" +
                    "– Vamos fazer um monstrinho?\n" +
                    "– Não posso, estou monstruada!",
            "Alô, gostaria de falar com o Caio, por favor?\n" +
                    "– É o próprio.\n" +
                    "– Oi Próprio, tudo bem? Será que você pode chamar o Caio.",
            "Vocês sabem qual é o contrário de volátil?\n" +
                    "Vem-cá-tio",
            "Como se faz para ganhar um Chokito ?\n" +
                    "– É só colocar o dedito na tomadita.",
            "Qual é a diferença do dente de leite e o Palmeiras?\n" +
                    "R.: O dente de leite só cai uma vez!",
            "Qual a única pedra que fica em cima da água?\n" +
                    "R.: a pedra de gelo.",
            "O que é que quanto mais cresce, mais baixo fica?\n" +
                    "R.: o rabo do cavalo",
            "Qual é o céu que não possui estrelas?\n" +
                    "Resposta: o céu da boca.",
            "Como se faz para evitar filhos durante uma relação sexual?\n" +
                    "R.: Feche a porta do quarto.",
            "Quem escuta tudo mas não fala pra ninguém?\n" +
                    "R.: As orelhas.",
            "Por que a loira jogou o computador no mar?\n" +
                    "R.: Porque ela queria navegar na internet.",
            "Qual o lugar mais velho do Brasil?\n" +
                    "R.: Porto Velho.",
            "O que é que vai e vem, sem sair do lugar?\n" +
                    "R.: A porta",
            "É um pássaro brasileiro e seu nome de trás para frente é igual.\n" +
                    "R.: arara."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_gerador = (Button) findViewById(R.id.btn_gerador);
        result = (TextView) findViewById(R.id.result);

        btn_gerador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int num = rand.nextInt(25);
                result.setText(frase[num]);

            }
        });

    }
}
