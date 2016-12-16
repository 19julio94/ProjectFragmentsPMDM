package com.example.jp.projectfragmentspmdm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityPrincipal extends AppCompatActivity implements ActivityPrincipalFragment.Comunicador {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    @Override

    public void mensaje(String texto) {
        ActivitySecondFragment fr2 = (ActivitySecondFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLand);
        if (fr2 != null) {
            fr2.cambiarTexto(texto);
        }
    }

}
