package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText etn, etp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etn = (EditText)findViewById(R.id.txt_Nombre);
        etp = (EditText)findViewById(R.id.txt_Contrasenia);
    }
    //Metodo para el boton Ingresar
    public void Registrar(View view){
        String nombre = etn.getText().toString();
        String contrasenia = etp.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(this, "Ingrese un nombre de Usuario", Toast.LENGTH_SHORT).show();
        }
        if (contrasenia.length() == 0){
            Toast.makeText(this, "Ingrese una Contraseña", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() != 0 && contrasenia.length() != 0){
            Toast.makeText(this, "Felicidades...!", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(this, StudentsList.class);
            startActivity(siguiente);
        }
    }
}
