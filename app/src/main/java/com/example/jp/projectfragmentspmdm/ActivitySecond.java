package com.example.jp.projectfragmentspmdm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
    TextView texto;
    String nombre;
    @Override





        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            Intent intent = getIntent();
            nombre = intent.getStringExtra(ActivityPrincipalFragment.TXT);
            texto = (TextView) findViewById(R.id.text);
            texto.setText(nombre);
        }

    }

