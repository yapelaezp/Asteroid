package com.example.asteroid;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar); 
    }

    public void verInformacion (View vistaInformacion){
        Intent i = new Intent(this,Informacion.class);
        startActivity(i);
    }

    public void finalizar(View view){
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu miMenu) {
        getMenuInflater().inflate(R.menu.menu_activity,miMenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem opcion) {
        int id = opcion.getItemId();

        if(id == R.id.menuConfiguracion){
            return true;
        }
        if(id == R.id.menuInfo){
            verInformacion(null);
            return true;
        }
       return super.onOptionsItemSelected(opcion);
    }
}