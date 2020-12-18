package com.example.greyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText Nick, Password, Dni, Telefono, Nombre, Apellidos, Email;
    Button registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Nick = findViewById(R.id.Nick);
        Password = findViewById(R.id.Password);
        Dni = findViewById(R.id.Dni);
        Email = findViewById(R.id.Email);
        Telefono = findViewById(R.id.Telefono);
        Nombre = findViewById(R.id.Nombre);
        Apellidos = findViewById(R.id.Apellidos);
        registro = findViewById(R.id.Registro);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nick, password, dni, telefono, nombre, apellidos, email;

                nick = Nick.getText().toString();
                password = Password.getText().toString();
                dni = Dni.getText().toString();
                telefono = Telefono.getText().toString();
                nombre = Nombre.getText().toString();
                apellidos = Apellidos.getText().toString();
                email = Email.getText().toString();

                //ponemos avisos para no dejar ningun campo en blanco

                if (nick.equals("")) ;
                {
                    Toast.makeText(Registro.this, "El Usuario está en blanco", Toast.LENGTH_LONG).show();
                }
                if (password.equals("")) ;
                {
                    Toast.makeText(Registro.this, "La contraseña está en blanco", Toast.LENGTH_LONG).show();
                }
                if (dni.equals("")) ;
                {
                    Toast.makeText(Registro.this, "El DNI está en blanco", Toast.LENGTH_LONG).show();
                }
                if (Telefono.equals("")) ;
                {
                    Toast.makeText(Registro.this, "El teléfono está en blanco", Toast.LENGTH_LONG).show();
                }
                if (Nombre.equals("")) ;
                {
                    Toast.makeText(Registro.this, "El nombre está en blanco", Toast.LENGTH_LONG).show();
                }
                if (Apellidos.equals("")) ;
                {
                    Toast.makeText(Registro.this, "Los apellidos están en blanco", Toast.LENGTH_LONG).show();
                }
                if (email.equals("")) ;
                {
                    Toast.makeText(Registro.this, "El email está en blanco", Toast.LENGTH_LONG).show();
                }
            }
        });
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R = new Intent(Registro.this,MainActivity.class);
                startActivity(R);
                finish();
            }
        });
    }
}






