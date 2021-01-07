package com.example.greyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PantallaIncio extends Activity {
    //esta clase va a ser un SplashScreen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_incio);
        //creo un handler para que espere unos segundos y pase a la siguiente pantalla
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(PantallaIncio.this, MainActivity.class);
                startActivity(intent);

            }
        }, 4000); //estos son los milisegundos que quiero que dure
    }
}