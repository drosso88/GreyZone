package com.example.greyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView btnRegistrate;
    EditText user, pass;
    Button login;

    //Esta clase se encarga del Inicio de sesión
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//declaramos las variables y las igualamos con los xml

        user = findViewById(R.id.Nick);
        pass = findViewById(R.id.Password);

        login = findViewById(R.id.inicioSesion);
        btnRegistrate = findViewById(R.id.Registro);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, password;

                usuario = user.getText().toString();
                password = pass.getText().toString();

                //comparamos strings y avisamos si algo queda en blanco con un TOAST (mensaje emergente)
                if (user.equals("")) {
                    Toast.makeText(MainActivity.this, "El Usuario está en blanco", Toast.LENGTH_LONG).show();
                } else if (pass.equals("")) {
                    Toast.makeText(MainActivity.this, "La contraseña está en blanco", Toast.LENGTH_LONG).show();
                } else {
                    //nos autenticamos si todo va bien
                }

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lo ponemos para que vya al formulario de registro para ver si funciona de momento.
                // Esto hay que cambiarlo luego
                Intent i = new Intent(MainActivity.this, Registro.class);
                startActivity(i);
                finish();
            }
        });
        //le damos funcionalidad del boton al texto, aun no funciona correctamente, pero lo hará
        btnRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Registro.class);
                startActivity(i);
                finish();
            }
        });

    }

    ;
}

