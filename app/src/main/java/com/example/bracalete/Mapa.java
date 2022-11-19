package com.example.bracalete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Fragment fragment=new MapFragment();

        getSupportFragmentManager()
                .beginTransaction().replace(R.id.marco_mapa,fragment)
                .commit();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if(id == R.id.mapa){
            Intent intent=new Intent(Mapa.this,Mapa.class);
            startActivity(intent);
        } else if (id == R.id.perfil){
            Intent intent=new Intent(Mapa.this,Perfil.class);
            startActivity(intent);
        } else if (id == R.id.salud) {
            Intent intent = new Intent(Mapa.this, Salud.class);
            startActivity(intent);
        } else if (id == R.id.historial) {
            Intent intent = new Intent(Mapa.this, Historial.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}