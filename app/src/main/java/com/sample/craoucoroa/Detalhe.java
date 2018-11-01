package com.sample.craoucoroa;

import android.app.Activity;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;

public class Detalhe extends Activity {

    private ImageView image_Moeda;
    private ImageView imagem_voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        image_Moeda = findViewById(R.id.id_moeda);
        imagem_voltar = findViewById(R.id.btn_Voltar);

        Bundle oExtra = getIntent().getExtras();
        if(oExtra != null){

            String oEscolha = oExtra.getString("opcao");

            if(oEscolha.equals("cara")){
                image_Moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else
            {
                image_Moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }

        imagem_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
