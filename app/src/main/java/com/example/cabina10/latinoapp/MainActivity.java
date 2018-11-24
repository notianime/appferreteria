package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    //Metodo para mostrar y ocultar Menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuprincipal, menu);
        return true;
    }

    //Metodo para crear funciones a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.item1){
            //Toast.makeText(this, "LOGIN", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(this, Login.class);
            startActivity(siguiente);
        }else if (id == R.id.item2){
            Toast.makeText(this, "Estudiantes", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(this, StudentsList.class);
            startActivity(siguiente);
        }else if (id == R.id.item3){
            Toast.makeText(this, "SALIR", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
