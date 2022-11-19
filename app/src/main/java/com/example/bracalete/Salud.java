package com.example.bracalete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Salud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if(id == R.id.mapa){
            Intent intent=new Intent(Salud.this,Mapa.class);
            startActivity(intent);
        } else if (id == R.id.perfil){
            Intent intent=new Intent(Salud.this,Perfil.class);
            startActivity(intent);
        } else if (id == R.id.salud) {
            Intent intent = new Intent(Salud.this, Salud.class);
            startActivity(intent);
        } else if (id == R.id.historial) {
            Intent intent = new Intent(Salud.this, Historial.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}