package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Meu amor por você cresce a cada dia. ❤️",
            "Você é o motivo do meu sorriso todas as manhãs. 😊",
            "Te amo mais do que palavras podem dizer. 🌹",
            "Você é o meu porto seguro e minha alegria. 🌟",
            "Com você, todos os dias são especiais. 💕",
            "Sou grato por ter você na minha vida. 🙏",
            "Seu sorriso ilumina meu mundo. 😍",
            "Você é o meu maior presente. 🎁",
            "Não há nada que eu não faria por você. 💖",
            "Minha vida é completa porque tenho você ao meu lado. 🥰",
            "Você é a melodia mais doce da minha vida. 🎶",
            "Cada momento com você é um tesouro. 💎",
            "Te amo mais do que ontem, mas menos do que amanhã. 🌸",
            "Você é a razão do meu coração bater mais forte. 💓",
            "Minha alma encontrou sua casa em você. 🏠",
            "Você é a estrela mais brilhante no meu céu. ✨",
            "Meu lugar favorito é ao seu lado. 💑",
            "Não consigo imaginar minha vida sem você. 🌹",
            "Você é o capítulo mais bonito da minha história. 📖",
            "Meu amor por você é infinito. ♾️",
            "Você é o meu sonho que virou realidade. 🌈",
            "Sou a pessoa mais feliz do mundo porque tenho você. 😘",
            "Você faz cada dia valer a pena. 💕",
            "Meu coração pertence a você para sempre. 🔒",
            "Você é a luz nos meus dias mais sombrios. 🌞",
            "Te amo além das estrelas e da lua. 🌙",
            "Seu amor é meu maior presente. 🎀",
            "Você é minha inspiração e minha felicidade. 🥰",
            "Cada momento ao seu lado é mágico. ✨",
            "Você é o meu tudo. Sempre será. ❤️",
            "O amor que sinto por você nunca terá fim. 💖"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gerarNovaFrase();
    }

    public void gerarNovaFrase() {
        // Obtém o dia do mês atual
        Calendar calendar = Calendar.getInstance();
        int diaDoMes = calendar.get(Calendar.DAY_OF_MONTH);

        // Usa o dia do mês para selecionar a frase correspondente
        String fraseDoDia = frases[diaDoMes];

        // Exibe a frase no TextView
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(fraseDoDia);
    }
}