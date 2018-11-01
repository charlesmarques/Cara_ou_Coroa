package com.sample.craoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

private ImageView obtn_Jogar;
private  String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obtn_Jogar = findViewById(R.id.btn_Jogar);

      obtn_Jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random oRandom = new Random();
                int numero  = oRandom.nextInt(2);

                Intent oIntent =new Intent(MainActivity.this, Detalhe.class);
                oIntent.putExtra("opcao",opcao[numero]);

                startActivity(oIntent);
            }
        });

    }
}
