package com.example.greyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*cuaando estamos en esta pantalla de la aplicación donde vamos a poner la dirección,
* la idea es que el maps nos señale la ubicación en la que estamos ahora mismo, cuando le damos al
* botón-lupa tras poner la dirección la gracia es que nos lleve a la ubicación que le pedimos.*/

public class buscarPlaza extends AppCompatActivity {
    //vamos a declarar variables de tipo boton
    Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_plaza);

        btnBuscar = (Button) findViewById(R.id.btn_Buscar); //casteamos la variable a id
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);

            }
        });



    }
}