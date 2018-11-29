package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class StudentsList extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres  [ ] =  {"Pedro", "Rosa", "Carlos", "Manuel", "Silvia", "Carmen", "Juan", "Mateo", "Oscar", "Mirian", "Alex"};
    private String Apellidos  [ ] =  {"Casas Aquino", "Torres Mucha", "Galves Montalvo", "Montes Castro", "De la cruz Gonsalez", "Montalvo Casas", "Perez Mendez"};
    private String Edad  [ ] =  {"19", "22", "20", "22", "19", "19", "20"};
    private String Correo  [ ] =  {"pcasas@gmail.com", "rtorres@gmail.com", "cgalves@hotmail.com", "mmontes@gmail.com", "sgonsalez@hotmail.com", "cmontalvo@hotmail.com", "jperez@gmail.com"};
    private String Telefono  [ ] =  {"986349856", "936584585", "956358967", "953689542", "986345689", "936458652", "962312541"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_estudiantes, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("El apellido de " + lv1.getItemAtPosition(position) + " es " + Apellidos[position] + ", tiene " + Edad[position]+ " años, su correo electronico es " + Correo[position]+ " y su numero telefonico " + Telefono[position]);
            }
        });
    }

    //Metodo para ir a StudentDetails
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, StudentDetails.class);
        startActivity(siguiente);
    }
}
