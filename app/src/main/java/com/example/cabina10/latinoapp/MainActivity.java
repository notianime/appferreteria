package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cabina10.latinoapp.adapters.DocumentAdapter;
import com.example.cabina10.latinoapp.models.Document;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView tvmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        tvmain = (ListView) findViewById(R.id.tvmain);
        ArrayList<Document> items = Document.getDocuments();
        DocumentAdapter documentAdapter = new DocumentAdapter(this, R.id.tvmain, items);
        //ArrayAdapter<Document> adapter = new ArrayAdapter<Document>(this, R.layout.list_item_document, items);
        tvmain.setAdapter(documentAdapter);

        tvmain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Document documentCurrent = (Document) tvmain.getItemAtPosition(position);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(documentCurrent.getRuta()));
                startActivity(browserIntent);
            }
        });

       //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_estudiantes, nombres);
       // lv1.setAdapter(adapter);
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
